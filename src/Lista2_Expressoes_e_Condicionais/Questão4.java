package Lista2_Expressoes_e_Condicionais;

import java.util.Scanner;

/*4. Fa�a um programa que recebe do usu�rio 3 n�meros e exibir o maior deles.*/

public class Questão4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double num1, num2, num3;
		
		System.out.printf("Digite um n�mero:");
		num1 = leia.nextDouble();
		
		System.out.printf("Digite outro n�mero:");
		num2 = leia.nextDouble();
		
		System.out.printf("Digite mais um n�mero:");
		num3 = leia.nextDouble();
		
		if ( num1>num2 && num1>num3 )
		{
			System.out.printf("O n�mero %.2f � o maior deles.", num1);
		}
		else
		{
			if ( num2>num1 && num2>num3 )
			{
				System.out.printf("O n�mero %.2f � o maior deles", num2);
			}
			else
			{
				System.out.printf("O n�mero %.2f � o maior deles", num3);
			}
		}
		System.out.printf("\nFim do programa.");

	}

}
