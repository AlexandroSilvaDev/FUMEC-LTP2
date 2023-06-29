package LTP1;

import java.util.Scanner;

public class Exif1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num1;
		
		System.out.printf("Digite um número inteiro:");
		num1 = leia.nextInt();
		
		if (num1%2 == 0)
		{
			System.out.printf("O número é par.\n");
		}
		else
		{
			System.out.printf("O número é ímpar\n");
		}
	
		
		System.out.printf("Fim do programa.");
	}

}
