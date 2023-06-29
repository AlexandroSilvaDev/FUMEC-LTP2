package LTP2_Lista_6;

import java.util.*;

/*
Exerc�cio 5.2 � Fazer um programa em Java para receber via teclado um c�digo caracter contendo 11
d�gitos. Os 9 primeiros d�gitos representam o c�digo em si e os 2 �ltimos os d�gitos representam os
d�gitos verificadores. Utilizando a regra de c�lculo dos d�gitos verificadores, o programa dever� conter
um m�todo para calcular os dois d�gitos verificadores do c�digo e comparar com os 2 d�gitos
verificadores digitados no c�digo. Se forem iguais, o programa dever� imprimir a mensagem: �D�gito
Correto�, caso contr�rio imprimir �D�gito Inv�lido�.

O c�lculo dos dois d�gitos verificadores dever� ser feito baseando-se nos 9 primeiros d�gitos do C�digo:
1�. D�gito verificador:
1 - somar entre si o valor de cada d�gito do c�digo
2 - dividir o resultado por 10
3 - o 1�. D�gito ser� a parte inteira do resultado da divis�o do item 2 (acima).

2�. D�gito verificador:
1 - multiplicar entre si o valor de cada d�gito do c�digo
2 - o 2�. Digito verificador ser� o ultimo algarismo a direita do resultado da multiplica��o
do item 1 (acima).

Exemplo:
9 primeiros d�gitos do C�digo: "821324312"
1�. Digito verificador: 8+2+1+3+2+4+3+1+2 = 26 / 10 = 2,6 => Parte inteira = 2
2�. Digito verificador: 8*2*1*3*2*4*3*1*2 = 2304 => Ultimo algarismo a direita = 4

OBS: - consistir a entrada de dados para aceitar somente CODIGO:
- com 11 caracteres
- todos os 11 caracteres devem ser d�gitos
*/

public class Exercício_5_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String codigo;
		int tamanhoString;
		
		do {
			System.out.println("Digite o CPF (s� os n�meros): ");
			codigo = leia.next();
			tamanhoString = codigo.length();
			
			if ( tamanhoString != 11 ) {
				System.out.println("\nO CPF digitado � inv�lido.\n");
			}
		} while ( tamanhoString != 11 );
		
		calcularDigitosVerificadoresE_CompararComOsDigitados(codigo);
	}
	
	public static void calcularDigitosVerificadoresE_CompararComOsDigitados ( String codigo ) {
		
		int digito1, digito2;
		int tamanhoString;
		String digito2STR;
		int vetDigitos[] = new int[9];
		int somaDigitos = 0, multiplicacaoDigitos = 1;
		
		for (int i = 0 ; i < 9 ; i++ ) {
			try {	
				vetDigitos[i] = Integer.parseInt(codigo.substring( i , i + 1 ));
				somaDigitos = somaDigitos + vetDigitos[i];
				multiplicacaoDigitos = multiplicacaoDigitos * vetDigitos[i];
				
			} catch ( NumberFormatException E ) {
				System.out.println("\nO texto digitado n�o pode ser convertido em n�mero!");
			}
		}
		try {
			digito1 = (int) (somaDigitos / 10);
			
			digito2STR = String.valueOf( multiplicacaoDigitos );
			tamanhoString = digito2STR.length();
			digito2 = Integer.parseInt( digito2STR.substring( tamanhoString - 1 ) );
			
			if ( Integer.parseInt( codigo.substring( 9 , 10 ) ) == digito1 && Integer.parseInt( codigo.substring( 10 , 11 ) ) == digito2 ) {
				System.out.println("\nD�gito correto!\n");
			} else {
				System.out.println("\nD�gito inv�lido!\n");
			}
		} catch ( NumberFormatException E ) {
			System.out.println("\nO texto digitado n�o pode ser convertido em n�mero!");
		}
	}
}
