package LTP1;

import java.util.Scanner;

/*3. Elaborar um programa que calcule e apresente
o volume de uma caixa retangular, por meio da
fórmula volume = comprimento*largura*altura.*/

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float comprimento, largura, altura, volume;
		
		System.out.printf("Digite o comprimento:");
		comprimento = ler.nextFloat();
		
		System.out.printf("Digite a largura:");
		largura = ler.nextFloat();
		
		System.out.printf("Digite a altura:");
		altura = ler.nextFloat();
		
		volume = (comprimento * largura * altura);
		
		System.out.printf("volume = %f", volume);

	}

}
