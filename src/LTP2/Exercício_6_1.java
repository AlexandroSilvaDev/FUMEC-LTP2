package LTP2;
import java.util.*;

/*
Exerc�cio 6.1 � Fazer um programa para receber via teclado a digita��o em letras min�sculas de um 
NOME do tipo string. Em seguida o programa dever� executar os seguintes m�todos:

1.1 � Criar um m�todo que para Converter a primeira letra do Nome para mai�sculo e retornar o 
nome convertido.

1.2 - Criar um m�todo para Converter a primeira letra de cada palavra do Nome para mai�scula 
e imprimir a frase convertida.

1.3 � Criar um m�todo para eliminar espa�os em branco digitados � esquerda do Nome e retornar 
o nome sem os espa�os.

1.4 � Criar um m�todo para eliminar espa�os em branco digitados � direita do Nome e imprimir 
o nome sem os espa�os.

1.5 � Criar um m�todo para eliminar espa�os em branco excessivos digitados entre as palavras 
do nome de tal forma que fique somente um espa�o entre cada palavra, e retornar o nome.
*/

public class Exercício_6_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		
		System.out.println("Digite um nome: ");
		nome = leia.nextLine();
		
		nome = eliminarEspacosEsquerda(nome);
		System.out.println("Espa�os � esquerda eliminados: " + nome);
		
		nome = eliminarEspacosDireita(nome);
		System.out.println("Espa�os � direita eliminados: " + nome);
		
		nome = eliminarEspacosEmBranco(nome);
		System.out.println("Todos os espa�os em branco eliminados: " + nome);
		
		nome = converterPrimeiraLetraDoNome(nome);
		System.out.println("Primeira letra convertida em mai�scula: " + nome);
		
		nome = converterPrimeiraLetraDeCadaPalavrasDoNome(nome);
		System.out.println("Primeira letra de cada palavra do nome convertidas em mai�sculas: " + nome);
	}
	public static String converterPrimeiraLetraDoNome ( String nome ) {
		
		String nomeConvertido;
		String primeiraLetraMaiuscula;
		
		primeiraLetraMaiuscula = nome.substring(0, 1).toUpperCase();
		nomeConvertido = primeiraLetraMaiuscula + nome.substring(1);
		
		return nomeConvertido;
	}
	public static String converterPrimeiraLetraDeCadaPalavrasDoNome ( String nome ) {
		
		for ( int i = 0 ; i < nome.length() ; i++ )
		{
			if ( nome.charAt(i) == ' ' )
			{
				nome = nome.substring( 0 , i + 1 ) + nome.substring( i + 1 , i + 2 ).toUpperCase() + nome.substring( i + 2 );
			}
		}
		return nome;
	}
	public static String eliminarEspacosEsquerda( String nome ) {
		
		while ( nome.charAt( 0 ) == ' ' )
		{
			nome = nome.substring(1);
		}
		return nome;
	}
	public static String eliminarEspacosDireita( String nome ) {
		
		while ( nome.charAt( nome.length() - 1 ) == ' ' )
		{
			nome = nome.substring( 0 , nome.length() - 1 );
		}
		return nome;
	}
	public static String eliminarEspacosEmBranco( String nome ) {
		
		while ( nome.contains("  ") )
		{
			nome = nome.replace("  ", " ");
		}
		return nome;
	}
}
