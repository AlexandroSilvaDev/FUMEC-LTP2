package Lista1_Algoritmos;

/*6. Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de
reajuste. Calcular e escrever o valor do novo salário.*/

import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float salario;
		
		System.out.printf("Digite o sálario:");
		salario = leia.nextFloat();
		
		System.out.printf("O sálario com reajuste é %.2f", (salario * 0.10)+ salario);
		
		System.out.printf("\nFim do programa");
		

	}

}
