package Lista1_Algoritmos;

import java.util.Scanner;

/*7. O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que o percentual do
distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de f�brica
de um carro, calcular e escrever o custo final ao consumidor.*/

public class T7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float custof;
		
		System.out.printf("Digite o custo de f�brica:");
		custof = leia.nextFloat();
		
		System.out.printf("O custo de um carro novo � %.2f", (custof+(0.28*custof)+(0.45*custof)) );
		
		System.out.printf("\nFim do programa.");

	}

}
