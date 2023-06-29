package Lista1_Algoritmos;

import java.util.Scanner;

/*Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável
B. A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com
que o valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram
armazenados nas variáveis.*/

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
		
		System.out.printf("O valor de A é %d e o valor de B é %d.", a, b);
		
		System.out.printf("\nFim do programa.");

	}

}
