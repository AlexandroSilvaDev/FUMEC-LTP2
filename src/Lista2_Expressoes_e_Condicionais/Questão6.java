package Lista2_Expressoes_e_Condicionais;

import java.util.Scanner;

/*6. Fa�a um programa que receba do aluno o valor de 3 provas, calcule a m�dia aritm�tica entre 
elas e exiba na tela se o aluno foi aprovado ou reprovado. Obs: um aluno � aprovado se sua nota 
for maior ou igual a 6.
*/

public class Questão6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float p1, p2, p3;
		
		System.out.printf("Digite o valor da prova 1:");
		p1 = leia.nextFloat();
		
		System.out.printf("Digite o valor da prova 2:");
		p2 = leia.nextFloat();
		
		System.out.printf("Digite o valor da prova 3:");
		p3 = leia.nextFloat();
		
		if ((p1+p2+p3)/3 >= 6 )
		{
			System.out.printf("\nO aluno foi aprovado.");
		}
		else
		{
			System.out.printf("\nO aluno foi reprovado.");
		}
		
		System.out.printf("\n\nFim do programa.");

	}

}
