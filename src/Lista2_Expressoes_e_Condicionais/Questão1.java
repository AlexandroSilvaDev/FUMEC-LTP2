package Lista2_Expressoes_e_Condicionais;

import java.util.Scanner;

/*1. Fa�a um programa que solicita ao usu�rio um n�mero inteiro e exibe este na tela. Se o n�mero 
for negativo, antes de ser exibido, ele deve ser transformado no equivalente positivo. */

public class Questão1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int Num;
		
		System.out.printf("Digite um n�mero inteiro:");
		Num = leia.nextInt();
		
		if ( Num<0 )
		{
			System.out.printf("O n�mero digitado foi: %d", Num*(-1) );
		}
		else
		{
			System.out.printf("O n�mero digitado foi: %d", Num);
		}
		
		System.out.printf("\nFim do programa.");
	}

}
