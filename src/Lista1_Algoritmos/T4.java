package Lista1_Algoritmos;

/*4. Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever
a �rea do ret�ngulo.*/

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float base, altura;
		
		System.out.printf("Digite a Base:");
		base = leia.nextFloat();
		
		System.out.printf("Digite a Altura:");
		altura = leia.nextFloat();
		
		System.out.printf("A �rea do ret�ngulo � %.2f", base * altura);
		
		System.out.printf("\nFim do programa.");
	}

}
