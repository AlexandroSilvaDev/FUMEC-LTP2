package LTP1;

import java.util.Scanner;

/*2. Calcular e apresentar o volume de uma lata de
óleo, utilizando a fórmula: volume =
3.14159*raio*raio*altura.*/

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float raio, altura, volume;
		
		System.out.printf("Digite o raio:");
		raio = ler.nextFloat();
		
		System.out.printf("Digite a altura:");
		altura = ler.nextFloat();
		
		volume = (float) (3.14159 * raio * raio * altura);
		
		System.out.printf("volume = %f", volume);
	}

}
