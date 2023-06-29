package Lista2_Expressoes_e_Condicionais;

import java.util.Scanner;

/*8. A prefeitura de Cafundodojudas abriu uma linha de credito para os funcion�rios. O valor m�ximo 
da presta��o n�o poder� ultrapassar 30% do sal�rio bruto. Fazer um algoritmo onde o usu�rio 
informa seu sal�rio bruto e o valor da presta��o e o programa exibe na tela se o empr�stimo 
pode ou n�o ser concedido.
*/

public class Questão8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float salarioB, valorP;
		
		System.out.printf("Digite o s�lario bruto de um funcion�rio:");
		salarioB = leia.nextFloat();
		
		System.out.printf("Digite o valor de presta��o de um funcion�rio:");
		valorP = leia.nextFloat();
		
		if ( valorP <= salarioB * 0.30 )
		{
			System.out.printf("\nO empr�stimo pode ser concedido.");
		}
		else
		{
			System.out.printf("\nO empr�stimo n�o pode ser concedido.");
		}
		System.out.printf("\n\nFim do programa.");

	}

}
