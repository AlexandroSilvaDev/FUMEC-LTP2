package Lista1_Algoritmos;

/*6. Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o percentual de
reajuste. Calcular e escrever o valor do novo sal�rio.*/

import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float salario;
		
		System.out.printf("Digite o s�lario:");
		salario = leia.nextFloat();
		
		System.out.printf("O s�lario com reajuste � %.2f", (salario * 0.10)+ salario);
		
		System.out.printf("\nFim do programa");
		

	}

}
