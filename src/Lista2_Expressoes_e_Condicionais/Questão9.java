package Lista2_Expressoes_e_Condicionais;

import java.util.Scanner;

/*9. Fa�a um programa que receba do usu�rio dois n�meros reais (a e b). Ap�s isso, o programa 
deve exibir na tela o seguinte menu:
Digite 1 para somar.
Digite 2 para subtrair.
Digite 3 para multiplicar.
Digite 4 para dividir.
Digite 5 para sair.
De acordo com a op��o do usu�rio, o programa vai imprimir na tela o resultado de a+b, a-b, a*b 
ou a/b.*/

public class Questão9 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double a, b;
		int menu;
		
		System.out.printf("Digite um n�mero:");
		a = leia.nextDouble();
		
		System.out.printf("Digite outro n�mero:");
		b = leia.nextDouble();
		
		System.out.printf("\nDigite:\n1-somar, 2-subtrair, 3-multiplicar, 4-dividir, 5-sair:");
		menu = leia.nextInt();
		
		switch (menu)
		{
			case 1:
				System.out.printf("\nA soma dos n�meros �: %.2f. ", a + b);
				break;
			case 2:
				System.out.printf("\nA subtra��o dos n�meros �: %.2f.", a - b);
				break;
			case 3:
				System.out.printf("\nA multiplica��o dos n�meros �: %.2f.", a * b);
				break;
			case 4:
				System.out.printf("\nA divis�o dos n�meros �: %.2f.", a / b);
				break;
			case 5:
				System.out.printf("\nSair do programa.");
				break;
			default:
				System.out.printf("\nOp��o inv�lida.");
				break;
		}
		System.out.printf("\n\nFim do programa.");

	}

}
