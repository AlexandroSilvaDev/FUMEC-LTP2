package Lista1_Algoritmos;

import java.util.Scanner;

/*Escreva um algoritmo que armazene o valor 10 em uma vari�vel A e o valor 20 em uma vari�vel
B. A seguir (utilizando apenas atribui��es entre vari�veis) troque os seus conte�dos fazendo com
que o valor que est� em A passe para B e vice-versa. Ao final, escrever os valores que ficaram
armazenados nas vari�veis.*/

public class T3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		
		System.out.printf("Digite o valor de A:");
		a = leia.nextInt();
		
		System.out.printf("Digite o valor de B:");
		b = leia.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.printf("O valor de A � %d e o valor de B � %d.", a, b);
		
		System.out.printf("\nFim do programa.");

	}

}
