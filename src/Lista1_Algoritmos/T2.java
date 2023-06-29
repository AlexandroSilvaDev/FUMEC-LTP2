package Lista1_Algoritmos;

import java.util.Scanner;

/*2. Faça um programa que solicita que o usuário digite o seu nome e exiba a mensagem “Olá”
seguido do nome digitado pelo usuário.*/

public class T2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		char nome;
		
		System.out.printf("Digite um nome:");
		nome = leia.next().charAt(0);
		
		System.out.printf("Olá %c", nome);
		
		System.out.printf("Fim do programa.");
		

	}

}
