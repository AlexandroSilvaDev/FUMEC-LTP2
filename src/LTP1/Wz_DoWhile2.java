package LTP1;

/*Escreva um programa que solicite ao usu�rio
que digite um n�mero inteiro positivo. Caso n�o
seja feito, o programa deve solicitar at� que o
n�mero seja um inteiro positivo.*/

import java.util.Scanner;

public class Wz_DoWhile2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num;
		
		do
		{
			System.out.printf("Digite um n�mero inteiro positivo:");
			num = leia.nextInt();
			
		}while ( num <= 0 );

	}

}
