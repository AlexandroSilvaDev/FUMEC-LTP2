package Lista2_Expressoes_e_Condicionais;

import java.util.Scanner;

/*7. Fa�a um programa que receba do usu�rio seu peso e altura, calcular o IMC (�ndice de Massa 
Corporal). Exiba na tela qual a classifica��o da pessoa de acordo com a seguinte tabela:
IMC CLASSIFICA��O
MENOR QUE 18,5 MAGREZA
ENTRE 18,5 E 24,9 NORMAL
ENTRE 25,0 E 29,9 SOBREPESO
ENTRE 30,0 E 39,9 OBESIDADE
MAIOR QUE 40,0 OBESIDADE GRAVE
Utilize a seguinte f�rmula: IMC = peso / altura*2.*/

public class Questão7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double peso, altura, imc;
		
		System.out.printf("Digite o peso(Kg):");
		peso = leia.nextDouble();
		
		System.out.printf("Digite a altura(metros):");
		altura = leia.nextDouble();
		
		imc = (peso / (altura*altura));
		
		if ( imc<18.5 )
		{
			System.out.printf("A pessoa com imc %.2f est� associada a classifica��o magreza.", imc);
		}
		else
		{
			if ( imc>=18.5 && imc<=24.9 )
			{
				System.out.printf("A pessoa com imc %.2f est� associada a classifica��o normal.", imc);
			}
		    else
			{
				if ( imc>=25.0 && imc<=29.9 )
				{
					System.out.printf("A pessoa com imc %.2f est� associada a classifica��o sobrepeso.", imc);
				}
				else
				{
					if ( imc>=30.0 && imc<=39.9 )
					{
						System.out.printf("A pessoa com imc %.2f est� associada a classifica��o obesidade.", imc);
					}
					else
					{
						System.out.printf("A pessoa com imc %.2f est� associada a classifica��o obesidade grave", imc);
					}
				}
			}
		}
		System.out.printf("\nFim do programa.");
	}

}
