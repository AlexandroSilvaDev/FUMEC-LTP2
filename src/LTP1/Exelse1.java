package LTP1;

import java.util.Scanner;

/*1. Faça um programa que leia dois números inteiros e verifique qual deles é maior.
 *  Imprima uma mensagem informando qual deles é o maior (obs: eles são diferentes!).*/
public class Exelse1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num1, num2;
		
		System.out.printf("Digite um número inteiro:");
		num1 = leia.nextInt();
		System.out.printf("Digite outro número inteiro:");
		num2 = leia.nextInt();
		
		if (num1 > num2)
			{
				System.out.printf("O número %d é maior que o número %d.", num1, num2);
			}
		else
			{
				if (num1 == num2)
					{
						System.out.printf("Os números %d e %d são iguais.", num1, num2);
					}
				else
					{
						System.out.printf("O número %d é maior que o número %d.", num2, num1);
					}
			}
		System.out.printf("\nFim do programa.");
	}

}
