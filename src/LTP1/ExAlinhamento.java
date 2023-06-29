package LTP1;

import java.util.Scanner;

/*
1. Fa�a um programa que leia dois n�meros inteiros. O programa dever� imprimir a
mensagem informando se:
1. Ambos os n�meros s�o maiores que zero;
2. Ambos os n�meros s�o menores que zero;
3. Algum n�mero � igual a zero;
Obs: este exerc�cio deve ser realizado utilizando as express�es l�gicas (Algebra de Boole)
*/

public class ExAlinhamento {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		int num1, num2;
		
		System.out.printf("Digite o n�mero 1:");
		num1 = leia.nextInt();
		
		System.out.printf("Digite o n�mero 2:");
		num2 = leia.nextInt();
		
		if (num1>0 && num2>0)
		{
			System.out.printf("Os n�meros %d e %d s�o maiores que 0.", num1, num2);
		}
		else
		{
			if (num1<0 && num2<0)
			{
				System.out.printf("Os n�meros %d e %d s�o menores que 0.", num1, num2);
			}
			else
			{
				System.out.printf("Pelo menos um dos n�meros � igual a 0.");
			}
		}
		System.out.printf("\nFim do programa.");
		
	}

}
