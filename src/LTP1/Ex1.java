package LTP1;

import java.util.Scanner;

/*1. Ler uma temperatura em graus Celsius (C) e
apresenta-la convertida em graus Fahrenheit. A
fórmula de conversão é F = (9*C+160)/5.*/

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float temperaturaC, temperaturaF;
		
		System.out.printf("Digite a temperatura em graus Celsius (C):");
		temperaturaC = ler.nextFloat();
		
		temperaturaF = (9*temperaturaC+160)/5;
		
		System.out.printf("Temperatura em Fahrenheit = %f", temperaturaF);
		

	}

}
