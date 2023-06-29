package LTP1;

/*Escreva um programa que solicite ao usuário
que digite um número inteiro positivo. Caso não
seja feito, o programa deve solicitar até que o
número seja um inteiro positivo.*/

import java.util.Scanner;

public class Wz_DoWhile2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num;
		
		do
		{
			System.out.printf("Digite um número inteiro positivo:");
			num = leia.nextInt();
			
		}while ( num <= 0 );

	}

}
