package LTP2_Lista_9;
import java.util.*;


/*
Exerc�cio 6.2 � Fazer um programa em Java que receba via teclado a digita��o de at� 30 nomes de 
pessoas. 

Para cada um dos nomes digitados o programa dever� conter um m�todo para gerar e retornar um Login 
e uma Senha. 

Ap�s gerados o login e senha o programa dever� exibi-los na tela. 

O Login ser� formado da concatena��o da primeira letra de cada nome em mai�sculo. E a senha ser� 
formada da concatena��o do primeiro d�gito do valor ASCII Decimal de cada letra do Login.

Ex: 
nome digitado: jose maria alves dos santos
Login gerado: JMADS (c�digos ASCII decimais: J=74, M=77, A=65, D=68, S=83)
Senha gerada: 77668

Obs: 
- Consistir a entrada de dados para que o nome da pessoa digitado: 
	- tenha o tamanho m�nimo de 15 caracteres;
	- n�o deve existir caracteres espa�o antes do primeiro nome; *
	- deve existir pelo menos 1 nome e 1 sobrenome;
	- deve existir apenas 1 espa�o entre o nome e sobrenomes; *
	- s� possua letras em cada nome;
	- Criar um FLAG para encerrar a entrada de dados. *
*/

public class Exercício_6_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		String character;
		String loginSenha, login = null, senha = null;
		boolean entradaValida;
		
		for ( int i = 0 ; i < 30 ; i++ )
		{
			do {
				System.out.println("Digite um nome (FIM para encerrar): ");
				nome = leia.nextLine();
				entradaValida = true;
				
				if ( nome.equalsIgnoreCase("FIM") )
				{
					System.out.println("Entrada de dados encerrada!\n");
					break;
				}
				else if ( nome.length() < 15 )
				{
					System.out.println("O nome deve ter pelo menos 15 caracters!\n");
					entradaValida = false;
				}
				else if ( nome.charAt(0) == ' ' )
				{
					System.out.println("O nome n�o pode ter espa�os � esquerda!\n");
					entradaValida = false;
				}
				else if ( nome.charAt( nome.length() - 1 ) == ' ' )
				{
					System.out.println("O nome n�o pode ter espa�os � direita!\n");
					entradaValida = false;
				}
				else if ( nome.contains("  ") )
				{
					System.out.println("O nome n�o pode ter mais de 1 espa�o entre cada palavra do nome!\n");
					entradaValida = false;
				}
				else if ( ! nome.contains(" ") )
				{
					System.out.println("O nome deve ter pelo menos 1 nome e 1 sobrenome!\n");
					entradaValida = false;
				}
				if ( entradaValida )
				{
					for ( int x = 0 ; x < nome.length() ; x++ )
					{
						character = nome.substring( x , x + 1 ).toUpperCase();
						
						if ( character.compareTo("A") < 0 && character.compareTo(" ") != 0 || character.compareTo("Z") > 0 )
						{
							System.out.println("Nome deve ser composto apenas de letras!\n");
							entradaValida = false;
							break;
						}
					}
				}
			} while ( ! entradaValida );
			
			if ( nome.equalsIgnoreCase("FIM") )
			{
				break;
			}
			/*
			while ( nome.charAt(0) == ' ' )
			{
				nome = nome.substring(1);
			}
			while ( nome.charAt( nome.length() - 1 ) == ' ' )
			{
				nome = nome.substring( 0 , nome.length() - 1 );
			}
			while ( nome.contains("  ") )
			{
				nome.replace("  ", " ");
			}
			*/
			
			loginSenha = gerarLoginSenha(nome);
			for ( int j = 0 ; j < loginSenha.length() ; j++ )
			{
				if ( loginSenha.substring( j , j + 1 ).compareTo( "A" ) > 0 || loginSenha.substring( j , j + 1 ).compareTo( "Z" ) < 0 )
				{
					login = login + loginSenha.substring( j , j + 1 );
				}
				else {
					senha = senha + loginSenha.substring(j);
				}
			}
			System.out.println("O login �: " + login);
			System.out.println("A senha �: " + senha);
		}
	}
	public static String gerarLoginSenha( String nome ) {
		
		String login = null;
		String senha = null;
		String acesso;
		
		for ( int i = 0 ; i < nome.length() ; i++ )
		{
			if ( nome.charAt(i) == ' ' )
			{
				login = login + nome.charAt( i + 1 ); 
			}
		}
		login = login.toUpperCase();
		
		for ( int x = 1 ; x < login.length() ; x++ )
		{
			senha = senha + (int)login.charAt( x ) / 10;
		}
		acesso = login + senha;
		return acesso;
	}
}
