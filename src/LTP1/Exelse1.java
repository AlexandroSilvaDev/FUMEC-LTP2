package LTP1;

import java.util.Scanner;

/*1. Fa�a um programa que leia dois n�meros inteiros e verifique qual deles � maior.
 *  Imprima uma mensagem informando qual deles � o maior (obs: eles s�o diferentes!).*/
public class Exelse1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num1, num2;
		
		System.out.printf("Digite um n�mero inteiro:");
		num1 = leia.nextInt();
		System.out.printf("Digite outro n�mero inteiro:");
		num2 = leia.nextInt();
		
		if (num1 > num2)
			{
				System.out.printf("O n�mero %d � maior que o n�mero %d.", num1, num2);
			}
		else
			{
				if (num1 == num2)
					{
						System.out.printf("Os n�meros %d e %d s�o iguais.", num1, num2);
					}
				else
					{
						System.out.printf("O n�mero %d � maior que o n�mero %d.", num2, num1);
					}
			}
		System.out.printf("\nFim do programa.");
	}

}
