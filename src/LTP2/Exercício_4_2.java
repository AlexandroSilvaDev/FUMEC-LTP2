package LTP2;

/*
Exerc�cio 4.2 - Fazer um programa para receber via teclado o Nome do Empregado, o C�digo do
Empregado (num�rico), e o N�mero de Pe�as fabricadas em um determinado m�s. O programa dever�
imprimir uma lista, contendo o Nome do Empregado, o Sal�rio e a M�dia de Sal�rios da empresa. Para
calcular o Sal�rio, considerar:
- 1 a 200 pe�as fabricadas � sal�rio de R$ 2,00 por pe�a
- 201 a 400 pe�as fabricadas � sal�rio de R$ 2,30 por pe�a
- acima de 400 pe�as fabricadas � sal�rio de R$ 2,50 por pe�a
No final do relat�rio, imprimir o total gasto em sal�rios pela empresa.
Consist�ncias:
- O n�mero de pe�as dever� ser maior que zero.
- O c�digo dever� ser um n�mero entre 1 e 999
M�todos:
- Fazer um m�todo para calcular o Sal�rio do Empregado
- Par�metro: n�mero de pe�as
- Retorno: sal�rio
Observa��es:
- Adotar um flag para encerrar a entrada de dados.
- Considerar o m�ximo de 100 empregados.
Layout do relat�rio:
      Nome             Sal�rio             M�dia Sal�rios
----------------   --------------- ------------------------------
XXXXXXXXXXXXXXXX       999.99                  999.99
XXXXXXXXXXXXXXXX       999.99                  999.99
XXXXXXXXXXXXXXXX       999.99                  999.99
XXXXXXXXXXXXXXXX       999.99                  999.99
Total pago com sal�rios: 9,999.99
*/

import java.util.*;

public class Exercício_4_2 {

	public static void main(String[] args) {
		
		// 1 - Vari�veis:
		
		Scanner leia = new Scanner(System.in);
		
		String nome[] = new String[100];
		float salario[] = new float[100];
		int codigoOperario = 0;
		int i;
		int numeroPecas = 0;
		int contador = 0;
		float mediaSalario = 0;
		float soma = 0;
		
		// 2 - Entrada de Dados:
		
		for ( i = 0 ; i < 100 ; i++ ) {
			
			System.out.println("Digite o c�digo do oper�rio (0 para encerrar): ");
			codigoOperario = leia.nextInt();
			
			leia.nextLine();
			
			if ( codigoOperario < 1 && codigoOperario > 999 ) {
				System.out.println("C�digo inv�lido! Digite novamente.");
				
			} else if ( codigoOperario == 0 ) {
				System.out.println("Entrada de dados encerrada!");
				break;
			} else {
				contador++;
				
				do {
					System.out.println("Digite o nome do funcion�rio: ");
					nome[i] = leia.nextLine();
					
					if ( nome[i].equalsIgnoreCase("") ) {
						System.out.println("Nome obrigat�rio!");
					}
				} while ( nome[i].equalsIgnoreCase("") );
				
				do {
					System.out.println("Digite o n�mero de pe�as fabricadas pelo empregado no m�s: ");
					numeroPecas = leia.nextInt();
					
					if ( numeroPecas <=0 ) {
						System.out.println("N�mero de pe�as inv�lido! Digite novamente.");
					}
				} while ( numeroPecas <= 0 );
				
		// 3 - C�lculos (Objetivo):
				
				salario[i] = calcularSalarioPorFuncionario(numeroPecas);
				soma += salario[i];
			}
		}			
		
		
		mediaSalario = soma / contador;
		
		// 4 - Sa�das
			
		for ( i = 0 ; i < contador ; i++ ) {
			
			System.out.println(nome[i] + "   R$" + salario[i] + "\n");
		}
		System.out.println("Total pago com s�larios: " + soma + "\nM�dia dos s�larios: " + mediaSalario);
		
	}
	
	public static float calcularSalarioPorFuncionario(int pecas) {
		
		float salario;
		
		if ( pecas <= 200 ) {
			salario = pecas * 2;
			
		} else if ( pecas <= 400 ) {
			salario = pecas * (float) 2.30;
			
		} else {
			salario = pecas * (float) 2.50;
			
		}
		
		return salario;
	}
}
