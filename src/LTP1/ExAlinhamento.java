package LTP1;

import java.util.Scanner;

/*
1. Faça um programa que leia dois números inteiros. O programa deverá imprimir a
mensagem informando se:
1. Ambos os números são maiores que zero;
2. Ambos os números são menores que zero;
3. Algum número é igual a zero;
Obs: este exercício deve ser realizado utilizando as expressões lógicas (Algebra de Boole)
*/

public class ExAlinhamento {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		int num1, num2;
		
		System.out.printf("Digite o número 1:");
		num1 = leia.nextInt();
		
		System.out.printf("Digite o número 2:");
		num2 = leia.nextInt();
		
		if (num1>0 && num2>0)
		{
			System.out.printf("Os números %d e %d são maiores que 0.", num1, num2);
		}
		else
		{
			if (num1<0 && num2<0)
			{
				System.out.printf("Os números %d e %d são menores que 0.", num1, num2);
			}
			else
			{
				System.out.printf("Pelo menos um dos números é igual a 0.");
			}
		}
		System.out.printf("\nFim do programa.");
		
	}

}
