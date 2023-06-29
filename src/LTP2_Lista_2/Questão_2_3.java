package LTP2_Lista_2;

import java.util.Scanner;

/*Exerc�cio 2.3- Em uma F�brica trabalham empregados divididos em 3 classes: A, B e C. Fazer um
programa em Java que receba via teclado o C�DIGO DO OPER�RIO (inteiro), a CLASSE do oper�rio
(caracter 1 posi��o) e o N�MERO DE PE�AS FABRICADAS no m�s (inteiro). Em seguida o programa
dever� calcular e imprimir o sal�rio dos empregados considerando a tabela a seguir:
CLASSE   Pe�as fabricadas no m�s                  Calculo do Sal�rio
__________________________________________________________________________________
|  A  |    at� 30                 |      R$500,00 + R$2,00 por pe�a fabricada    |
|  A  |    de 31 a 40             |      R$500,00 + R$2,30 por pe�a fabricada    |
|  A  |    acima de 40            |      R$500,00 + R$2,80 por pe�a fabricada    |
|  B  |    -                      |      R$1.200,00                              |
|  C  |    At� 50                 |      R$ 40,00 por pe�a fabricada             |
|  C  |    acima de 50            |      R$ 45,00 por pe�a fabricada             |
|_____|___________________________|______________________________________________|
Ao final, o programa dever� imprimir:
- Total gasto pela empresa com o pagamento de sal�rios*
- N�mero total de pe�as fabricadas*
- C�digo do Oper�rio que fabricou o menor n�mero de pe�as*
- M�dia de quantidade de pe�as fabricadas por empregados da classe B*
Obs:
- adotar o flag C�digo de Oper�rio = 0 (zero) para encerrar a entrada de dados*
- consistir os seguintes valores digitados na entrada de dados:*
- N�MERO DE PE�AS dever� ser maior que zero
- CLASSE dever� ser A, B ou C*/

public class Questão_2_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		char classe;
		int codigoOperario = 0;
		int codigoOperarioMinimo = 0;
		int numeroPecasMinimo = 10000;
		int numeroPecas = 0;
		int somaPecas = 0;
		float somaPecasB = 0;
		float contadorPecas = 0;
		float media = 0;
		float salario = 0;
		float somaSalario = 0;
		
		do {
			System.out.print("\nDigite o c�digo do oper�rio (0 para encerrar): ");
			codigoOperario = leia.nextInt();
			
			if (codigoOperario != 0) {
				System.out.print("Digite a classe do oper�rio: ");
				classe = leia.next().charAt(0);
				System.out.print("Digite o n�mero de pe�as fabricadas no m�s: ");
				numeroPecas = leia.nextInt();
				
				if(numeroPecas > 0 && classe == 'A' || classe == 'B' || classe == 'C') {
					
					if (classe == 'A' && numeroPecas <= 30) {
						System.out.printf("O s�lario do funcion�rio �: %.2f.\n", 500 + (2 * numeroPecas));
						
					} else if (classe == 'A' && numeroPecas >=31 && numeroPecas <= 40) {
						System.out.printf("O s�lario do funcion�rio �: %.2f.\n", (500 + (2.30 * numeroPecas)));
						
					} else if (classe == 'A' && numeroPecas > 40) {
						System.out.printf("O s�lario do funcion�rio �: %.2f.\n", (500 + (2.80 * numeroPecas)));
						
					} else if (classe == 'B') {
						salario = 1200;
						System.out.printf("O s�lario do funcion�rio �: %.2f.\n", salario);
						somaPecasB = somaPecasB + numeroPecas;
						contadorPecas++;
						
					} else if (classe == 'C' && numeroPecas <= 50) {
						System.out.printf("O s�lario do funcion�rio �: %.2f.\n", 40 * numeroPecas);
						
					} else if (classe == 'C' && numeroPecas > 50) {
						System.out.printf("O s�lario do funcion�rio �: %.2f.\n", 45 * numeroPecas);
						
					} if (numeroPecas < numeroPecasMinimo) {
						numeroPecasMinimo = numeroPecas;
						codigoOperarioMinimo = codigoOperario;
					}
					somaSalario = somaSalario + salario;
					somaPecas = somaPecas + numeroPecas;
					
				} else {
					System.out.print("N�mero de pe�as ou classe inv�lidos! Tente Novamente:\n");
				}
			} else {
				System.out.print("\nVoc� escolheu sair do programa! Programa Finalizado.\n");
			}
		} while ( codigoOperario != 0 );
		
		media = somaPecasB / contadorPecas;
		
		System.out.printf("O total gasto pela empresa com o pagamento de sal�rios �: %.2f\n"
				+ "O n�mero total de pe�as fabricadas �: %d\n"
				+ "O C�digo do Oper�rio que fabricou o menor n�mero de pe�as �: %d\n"
				+ "A m�dia de quantidade de pe�as fabricadas por empregados da classe B �: %.2f\n", somaSalario, somaPecas, codigoOperarioMinimo, media);
	}
}
