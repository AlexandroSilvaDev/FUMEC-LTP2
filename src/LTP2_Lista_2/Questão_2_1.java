package LTP2_Lista_2;

import java.util.Scanner;

/*Exerc�cio 2.1- Fazer um programa em Java para receber via teclado o NOME, o SAL�RIO e o N�MERO 
DE DEPENDENTES dos 10 empregados de uma empresa. O programa dever� calcular um Novo Sal�rio 
para cada empregado de acordo com a tabela abaixo:
- sal�rios abaixo de R$1.000,00 ter�o aumento de 30%
- sal�rios de R$1.000,00 at� R$2.000,00 ter�o aumento de 20%
- sal�rios acima de R$2.000,00 ter�o aumento de 10%
Em seguida, o programa dever� acrescentar ao Novo Sal�rio calculado R$50,00 por DEPENDENTE e 
imprimir o Novo Sal�rio.
Ao final o programa dever� imprimir:
- Soma dos Novos Sal�rios
- M�dia dos Novos Sal�rios
- N�mero de empregados que passou a receber sal�rio acima de R$1700,00.*/

public class Questão_2_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float mat[][] = new float[3][10];
		String vet[] = new String[10];
		float novoSalario = 0;
		float media = 0;
		float somaSalario = 0;
		int contador = 0;
		int contadorEmpregados = 0;
		
		for (int i=0; i<10; i++) {
			System.out.printf("Digite o nome do %d� funcion�rio: ", i+1);
			vet[i] = leia.nextLine();
		}
		for (int i=0; i<3; i++) {
			somaSalario = 0;
			for (int j=0; j<10; j++) {
				if (i == 0) {
					System.out.printf("Digite o s�lario do %d� funcion�rio: ", j+1);
					mat[0][j] = leia.nextFloat();
				}else if (i == 1) {
					System.out.printf("Digite o n�mero de dependentes do %d� funcion�rio: ", j+1);
					mat[1][j] = leia.nextFloat();
				}if (mat[0][j] < 1000) {
					mat[2][j] = (float) (mat[0][j] + (mat[0][j] * 0.3));
				}else if (mat[0][j] >= 1000 && mat[0][j] <= 2000) {
					mat[2][j] = (float) (mat[0][j] + (mat[0][j] * 0.2));
				}else {
					mat[2][j] = (float) (mat[0][j] + (mat[0][j] * 0.1));
				}
				
				novoSalario = mat [2][j] + (mat[1][j] * 50);
				if (i == 2) {
					somaSalario = somaSalario + novoSalario;
					contador++;
				}if ( novoSalario > 1700 && i == 2) {
					contadorEmpregados++;
				}
			}
		}
		media = somaSalario / contador;
		System.out.printf("A soma dos novos sal�rios �: %.2f\n"
				+ "A m�dia dos novos sal�rios �: %.2f\n"
				+ "O n�mero de empregados que passou a receber sal�rio acima de R$1700,00 �: %d", somaSalario, media, contadorEmpregados);
	}
}
