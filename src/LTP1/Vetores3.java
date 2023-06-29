package LTP1;

import java.util.Scanner;

/*Ler 6 notas de alunos e, em seguida, 
 imprimir o a nota e o índice da maior nota.*/

public class Vetores3 {

	public static void main(String[] args) {
		
		int vet[] = new int[6], maiorNota, indice=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int i=0; i<=5; i++)
		{
			System.out.printf("Digite a %dº nota: ", i+1);
			vet[i] = leia.nextInt();
		}
		
		maiorNota = vet[0];
		for (int i=1; i<=5; i++)
		{
			if (vet[i] > maiorNota)
			{
				maiorNota = vet[i];
				indice = i;
			}
		}
		
		System.out.printf("Maior nota é %d e seu índice é %d", maiorNota, indice);

	}

}
