package Lista2_Expressoes_e_Condicionais;

import java.util.Scanner;

/*2. Fa�a um programa que solicita ao usu�rio um valor inteiro e exibe uma mensagem informando se 
o n�mero � par ou �mpar.*/

public class Questão2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.printf("Digite um n�mero inteiro:");
		num = leia.nextInt();
		
		if ( num%2 == 0 )
		{
			System.out.printf("O n�mero %d � par.", num);
		}
		else
		{
			System.out.printf("O n�mero %d � �mpar.", num);
		}
		
		System.out.printf("\nFim do programa.");
	}

}
