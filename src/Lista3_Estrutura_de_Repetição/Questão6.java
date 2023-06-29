package Lista3_Estrutura_de_Repetição;

import java.util.Scanner;

/*6. Fa�a um programa que solicita ao usu�rio dois valores inteiros e positivos que ser�o a base e o
expoente. O programa deve calcular e escrever o resultado da base elevado � pot�ncia utilizando
estrutura de repeti��o. */

public class Questão6 {

	public static void main(String[] args) {
		/*
		Scanner leia = new Scanner(System.in);
		int base, expoente, resultado=1;
		
		System.out.printf("Digite a base:");
		base = leia.nextInt();
		
		System.out.printf("Digite o expoente:");
		expoente = leia.nextInt();
		
		for (int i=expoente; i>=1; i--)
		{
			resultado = resultado * base;
		}
		
		System.out.printf("O n�mero %d elevado a %d = %d", base, expoente, resultado);
		*/
		Scanner leia = new Scanner(System.in);
		int base, expoente, resultado=1, i=1;
		
		System.out.printf("Digite a base:");
		base = leia.nextInt();
		
		System.out.printf("Digite o expoente:");
		expoente = leia.nextInt();
		
		do
		{	
				resultado = resultado * base;
				i++;
				
		}while ( i<=expoente );
		
		System.out.printf("O n�mero %d elevado a %d = %d", base, expoente, resultado);
	}

}

