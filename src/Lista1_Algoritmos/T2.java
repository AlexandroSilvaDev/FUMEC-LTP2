package Lista1_Algoritmos;

import java.util.Scanner;

/*2. Fa�a um programa que solicita que o usu�rio digite o seu nome e exiba a mensagem �Ol�
seguido do nome digitado pelo usu�rio.*/

public class T2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		char nome;
		
		System.out.printf("Digite um nome:");
		nome = leia.next().charAt(0);
		
		System.out.printf("Ol� %c", nome);
		
		System.out.printf("Fim do programa.");
		

	}

}
