package LTP2_Lista_10;
import java.util.*;
import java.io.*;

/*
Quest�o 7.1 - Fazer um programa em Java para incluir dados em um arquivo de Clientes de uma 
Empresa, de acordo com a estrutura de registro abaixo:

ativo             -> char - gravar 'S' na inclus�o e 'N' na exclus�o
codCliente        -> int - c�digo do cliente
nomeCliente       -> String - nome do cliente
vlrCompra         -> float - valor da compra
anoPrimeiraCompra -> int - ano que o cliente fez a primeira compra 
emDia             -> boolean - se o cliente est� em dia com o pagamento

Obs: - utilizar o campo CODCLI como campo chave prim�ria.

CONSIST�NCIAS:
- o nome do cliente deve ter no m�nimo 10 caracteres. 
- o c�digo do cliente deve ser n�mero inteiro e maior que (zero).
- o valor da compra deve ser maior que zero.
- o ano da primeira compra dever ser menor ou igual a 2013. 
- emDia : por ser um campo do tipo boolean (l�gico), no arquivo este campo deve ser preenchido com 
o valor TRUE ou FALSE. Entretanto, para exibir o valor na tela o programa dever� exibir S ou N, e o 
usu�rio dever� digitar tamb�m o valor S ou N para este campo. Para isto, o programa dever� utilizar
uma vari�vel auxiliar do tipo char e solicitar ao usu�rio que responda a pergunta: ("Cliente est� em 
dia (S/N)?"). Se a resposta for 'S', atribuir TRUE ao campo emDia, caso contr�rio, atribuir o 
valor FALSE

- Quando o codCliente for digitado, verificar no arquivo se j� existe algum outro registro que j� 
possua o codCliente informado e com ativo == 'S'(registro n�o exclu�do). Caso existir, 
mostrar uma mensagem de erro ("Cliente j� cadastrado !"), e n�o permitir a inclus�o.
 */

public class Exercício_7_1 {

	public static class Cliente {
		
		public char ativo;
		public int codigoCliente;
		public String nomeCliente;
		public float valorCompra;
		public int anoPrimeiraCompra;
		public boolean semDividas;
	}
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Cliente cliente = new Cliente();
		RandomAccessFile arquivo;
		int codigoClienteChave;
		boolean encontrou;
		char emDia, confirmacao;
		
		do {
			do {
				System.out.println(" ************  INCLUS�O DE CLIENTES  ************ ");
				System.out.println("Digite o c�digo do cliente: ");
				codigoClienteChave = leia.nextInt();
				
				if ( codigoClienteChave <= 0 )
				{
					System.out.println("O c�digo deve ser um n�mero positivo!\n");
				}
			} while ( codigoClienteChave <= 0 );
				
			encontrou = false;
			try {
				arquivo = new RandomAccessFile("C:\\Users\\xande\\Documents\\Universidade FUMEC\\2� Per�odo\\LTP2\\Registro de clientes", "rw");
				while ( true )
				{
					cliente.ativo = arquivo.readChar();
					cliente.codigoCliente = arquivo.readInt();
					cliente.nomeCliente = arquivo.readUTF();
					cliente.valorCompra = arquivo.readFloat();
					cliente.anoPrimeiraCompra = arquivo.readInt();
					cliente.semDividas = arquivo.readBoolean();
					
					if ( codigoClienteChave == cliente.codigoCliente && cliente.ativo == 'S' )
					{
						System.out.println("C�digo j� registrado, tente novamente!\n");
						encontrou = true;
						break;
					}
				}
				arquivo.close();
			} 
			catch ( EOFException e )
			{
				encontrou = false;
			}
			catch ( IOException e )
			{
				System.out.println("Erro na abertura do arquivo - programa ser� finalizado!");
				System.exit(0);
			}
		} while ( encontrou );
		
		if ( encontrou )
		{
			System.out.println(" ************** PROGRAMA ENCERRADO *************** ");
		}
		else 
		{
			cliente.ativo = 'S';
			cliente.codigoCliente = codigoClienteChave;
			
			leia.nextLine();
			do {
				System.out.println("Digite o nome do cliente: ");
				cliente.nomeCliente = leia.nextLine();
				
				if ( cliente.nomeCliente.length() < 10 )
				{
					System.out.println("O nome deve conter pelo menos 10 caracteres!\n");
				}
			} while ( cliente.nomeCliente.length() < 10 );
			
			do {
				System.out.println("Digite o valor da compra: ");
				cliente.valorCompra = leia.nextFloat();
				
				if ( cliente.valorCompra <= 0 )
				{
					System.out.println("O cliente deve efetuar uma compra!\n");
				}
			} while ( cliente.valorCompra <= 0 );
			
			do {
				System.out.println("Digite o ano da primeira compra: ");
				cliente.anoPrimeiraCompra = leia.nextInt();
				
				if ( cliente.anoPrimeiraCompra > 2013 )
				{
					System.out.println("A primeira compra deve ter sido efetuada, no m�ximo, no ano de 2013!\n");
				}
			} while ( cliente.anoPrimeiraCompra > 2013 );
			
			do {
				System.out.println("O cliente est� em dia (S/N): ");
				emDia = leia.next().charAt(0);
				
				if ( emDia == 'S' )
				{
					cliente.semDividas = true;
				}
				else if ( emDia == 'N' )
				{
					cliente.semDividas = false;
				} 
				else 
				{
					System.out.println("Deve digitar S para sim ou N para n�o!\n");
					break;
				}
			} while ( emDia != 'S' && emDia != 'N' );
			
			do {
				System.out.println("\nConfirma a grava��o dos dados (S/N) ? ");
				confirmacao = leia.next().charAt(0);
				
				if ( confirmacao == 'S' )
				{
					try {
						arquivo = new RandomAccessFile("C:\\Users\\xande\\Documents\\Universidade FUMEC\\2� Per�odo\\LTP2\\Registro de clientes", "rw");
						arquivo.seek(arquivo.length());
						arquivo.writeChar(cliente.ativo);
						arquivo.writeInt(cliente.codigoCliente);
						arquivo.writeUTF(cliente.nomeCliente);
						arquivo.writeFloat(cliente.valorCompra);
						arquivo.writeInt(cliente.anoPrimeiraCompra);
						arquivo.writeBoolean(cliente.semDividas);
						arquivo.close();
						System.out.println("Dados gravados com sucesso!\n");
					}
					catch ( IOException e )
					{
						System.out.println("Erro na grava��o do registro - programa ser� finalizado");
						System.exit(0);
					}
				}
			} while ( confirmacao != 'S' && confirmacao != 'N' );
		}
		leia.close();
	}
}
