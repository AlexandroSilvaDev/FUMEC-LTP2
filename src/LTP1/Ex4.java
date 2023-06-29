package LTP1;

import java.util.Scanner;

/*Elaborar um programa que calcule e apresente o volume de uma esfera, por meio da fórmula
volume = (4 * 3.14159 * raio * raio * raio)/3.*/

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float raio; 
		double volume;
		
		System.out.printf("Digite o raio:");
		raio = ler.nextFloat();
		
		volume = (4 * 3.14159 * raio * raio * raio)/3;
		
		System.out.printf("Volume = %f", volume);
		

	}

}
