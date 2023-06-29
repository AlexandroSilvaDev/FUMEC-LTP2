package Lista1_Algoritmos;

/*5. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a
idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.*/

import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int anos, meses, dias;
		
		System.out.printf("Digite quantos anos você têm:");
		anos = leia.nextInt();
		
		System.out.printf("Digite quantos meses você têm:");
		meses = leia.nextInt();
		
		System.out.printf("Digite quantos dias você têm:");
		dias = leia.nextInt();
		
		System.out.printf("A idade expressa em dias é %d.",((anos*365)+ meses*30)+ dias);
		
		System.out.printf("\nFim do programa.");
		

	}

}
