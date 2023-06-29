package LTP1;

import java.util.Scanner;

/*Ler 5 notas de alunos e, em seguida, calcular
 e imprimir a maior nota.*/

public class Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int i; 
		double vet[] = new double[5], maiorNota;
		
		for (i=0; i<=4; i++)
		{
			vet[i] = leia.nextInt();
		}
		
		maiorNota = vet[0];
		for (i=1; i<=4; i++)
		{
			if (vet[i] > maiorNota)
			{
				maiorNota = vet[i];
			}
		}
		System.out.printf("Maior nota é %.2f", maiorNota);
	}

}
