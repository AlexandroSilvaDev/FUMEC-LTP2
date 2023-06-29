package Lista3_Estrutura_de_Repetição;

import java.util.Scanner;

/*9. Fa�a um programa para uma calculadora simples que solicita ao usu�rio dois operandos como
entrada, seleciona uma das op��es da lista (1- soma, 2- produto, 3- divis�o, 4- pot�ncia) e exibe
o resultado. O algoritmo deve executar repetidamente at� que os dois operandos informados
sejam iguais a zero. */

public class Questão9 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int calculadora, num1, num2, resultado=1;
		
		do
		{
			System.out.printf("Digite um n�mero:");
			num1 = leia.nextInt();
			
			System.out.printf("Digite outro n�mero:");
			num2 = leia.nextInt();
			
			System.out.printf("Digite 1- Soma, 2- Multiplica��o, 3- Divis�o, 4- Pot�ncia:");
			calculadora = leia.nextInt();
			
			switch ( calculadora )
			{
				case 1:
					System.out.printf("A soma �: %d.\n", num1 + num2);
					break;
				case 2:
					System.out.printf("A multiplica��o �: %d.\n", num1 * num2);
					break;
				case 3:
					System.out.printf("A divis�o �: %d.\n", num1/num2);
					break;
				case 4:
					resultado = 1;
					for (int i=num2; i>=1;i--)
					{
						resultado = resultado * num1;
					}
					System.out.printf("A pot�ncia �: %d.\n", resultado);
					break;
				default:
					System.out.printf("A op��o digitada � inv�lida.\n");
			}
		}while ( num1 != 0 && num2 != 0 );
	}

}
