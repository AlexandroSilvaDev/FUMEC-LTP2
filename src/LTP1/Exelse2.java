package LTP1;

import java.util.Scanner;

/*
Uma loja deseja mandar uma correspond�ncia a um dos seus clientes anunciando um b�nus
especial. Escreva um algoritmo que leia o valor das compras desse cliente no ano passado e
calcule um b�nus de 10% se o valor das compras for menor que R$ 50.000,00 e de 15%,
caso contr�rio. O algoritmo deve imprimir o valor do b�nus cedido ao cliente
*/

public class Exelse2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float valor, bonus;
		
		System.out.printf("Digite o valor das compras do cliente:");
		valor = leia.nextFloat();
		
		if (50000 > valor)
		{
			System.out.printf("O b�nus deste cliente ser� %.2f.", valor+(valor*0.10));
		}
		else
		{
			System.out.printf("O b�nus deste cliente ser� %.2f", valor+(valor*0.15));
		}
		System.out.printf("\nFim do programa.");
	}

}
