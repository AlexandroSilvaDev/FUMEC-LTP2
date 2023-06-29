package LTP2_Lista_2;

import java.util.Scanner;

/*Exerc�cio 2.2� Fazer um programa em Java para receber via teclado a ALTURA em metros e o SEXO
dos atletas de uma delega��o. O programa dever� calcular e imprimir:
- a maior altura encontrada
- a menor altura encontrada*
- o n�mero de atletas do sexo feminino*
- a m�dia da altura masculina*
- a m�dia geral das alturas.*
Obs:
- adotar um flag para encerrar a entrada de dados
- consistir os valores digitados na entrada de dados de maneira que s� poder�o ser aceitos:
* SEXO = M ou F;
* ALTURA maior que zero e menor ou igual a 2,5 metros;*/

public class Questão_2_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float altura = 10;
		float maiorAltura = 0;
		float menorAltura = 3;
		float media = 0;
		float mediaMasculina = 0;
		float somaTotal = 0;
		float somaMasculina = 0;
		char sexo = 0;
		int contadorFeminino = 0;
		int contadorGeral = 0;
		int contadorMasculino = 0;
		int opcao = 0;
		
		
		while (opcao != 2) {
			System.out.print("Digite a altura: ");
			altura = leia.nextFloat();
			System.out.print("Digite o sexo: ");
			sexo = leia.next().charAt(0);
			
			System.out.print("Digite 1-Continuar, 2-Sair: ");
			opcao = leia.nextInt();
			
			switch (opcao) {
				case 1:
					System.out.print("\nVoc� escolheu continuar!\n");
					break;
				case 2:
					System.out.print("\nVoc� escolheu finalizar o programa!\n");
					break;
				default:
					System.out.print("Op��o inv�lida! Digite Novamente: \n");
			}
			
			if (altura <= 0 || altura > 2.5) {
				System.out.print("Altura inv�lida! Tente novamente: \n");
			}else if (sexo != 'M' && sexo != 'F') {
				System.out.print("Sexo inv�lido! Tente novamente: \n");
			}else if (sexo == 'F') {
				contadorFeminino++;
			}else if (sexo == 'M') {
				somaMasculina = somaMasculina + altura;
				contadorMasculino++;
				mediaMasculina = somaMasculina / contadorMasculino;
			}if (altura > maiorAltura) {
				maiorAltura = altura;
			}if (altura < menorAltura) {
				menorAltura = altura;
			}
			somaTotal = somaTotal + altura;
			contadorGeral++;
			media = somaTotal / contadorGeral;
		}	
		System.out.printf("A maior altura encontrada foi: %.2f\n"
				+ "A menor altura encontrada foi: %.2f\n"
				+ "O n�mero de atletas do sexo feminino: %d\n"
				+ "A m�dia da altura masculina �: %.2f\n"
				+ "A m�dia geral das alturas �: %.2f", maiorAltura, menorAltura, contadorFeminino, mediaMasculina, media);
	}

}
