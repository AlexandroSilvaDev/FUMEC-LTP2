package LTP2_Lista_1;

import java.util.Scanner;

/*Exerc�cio 1.3 � Fa�a um programa em Java para calcular e imprimir o B�nus Salarial e Desconto de 
Vale Transporte para um empregado da Empresa ABCD�rio LTDA. O programa dever� receber via 
teclado o Tempo de Casa e o Sal�rio do Empregado e considerar:

  Tempo de Casa					Sal�rio						B�nus		Vale Trasnporte
_______________________________________________________________________________________
At� 5 anos       | At� R$300,00                       | R$50,00        | 5% do Sal�rio 
_______________________________________________________________________________________
At� 5 anos       | Acima de R$300,00                  | R$80,00        | 6% do Sal�rio 
_______________________________________________________________________________________
De 6 a 10 anos   | At� R$500,00                       | 15% do Sal�rio | R$70,00       
_______________________________________________________________________________________
De 6 a 10 anos   | Acima de R$500,00 at� R$2000,00    | 13% do Sal�rio | R$90,00
_______________________________________________________________________________________
De 6 a 10 anos   | Acima de R$2000,00                 | 12% do Sal�rio | 8% do Sal�rio 
_______________________________________________________________________________________
Acima de 10 anos | ------------                       | R$300,00       | 4% do Sal�rio 
_______________________________________________________________________________________*/

public class Questão_1_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		byte tempoDeCasa = 0;
		float salario = 0;
		float bonus = 0;
		float valeTransporte = 0;
		
		System.out.print("Qual o tempo de casa do funcion�rio: ");
		tempoDeCasa = leia.nextByte();
		System.out.print("Qual o s�lario do funcion�rio: ");
		salario = leia.nextFloat();
		
		if ( tempoDeCasa <= 5 && salario <= 300 ) {
			System.out.printf("O b�nus � R$50,00 e o vale transporte � %.2f.", salario * 0.05);
		}else if ( tempoDeCasa <= 5 && salario > 300 ) {
			System.out.printf("O b�nus � R$80,00 e o vale transporte � %.2f.", salario * 0.06);
		}else if ( tempoDeCasa >= 6 && tempoDeCasa <= 10 && salario <= 500 ) {
			System.out.printf("O b�nus � %.2f e o vale transporte � R$70,00.", salario * 0.15);
		}else if ( tempoDeCasa >= 6 && tempoDeCasa <= 10 && salario > 500 && salario <= 2000 ) {
			System.out.printf("O b�nus � %.2f e o vale transporte � R$90,00.", salario * 0.13);
		}else if ( tempoDeCasa >= 6 && tempoDeCasa <= 10 && salario > 2000 ) {
			System.out.printf("O b�nus � %.2f e o vale transporte � %.2f.", salario * 0.12, salario * 0.08);
		}else {
			System.out.printf("O b�nus � R$300,00 e o vale transporte � %.2f.", salario * 0.04);
		}
	}
}
