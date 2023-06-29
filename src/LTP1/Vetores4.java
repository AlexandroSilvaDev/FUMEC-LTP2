package LTP1;

/*Ler n notas de alunos e imprimir quantas 
 tem valor superior à média. Assuma que n <= 1000.*/

import java.util.Scanner;

public class Vetores4 {

	public static void main(String[] args) {
		
		double vet[] = new double[1000], soma=0, cont=0, media=0, maior=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int i=0; i<1000; i++)
		{
			System.out.printf("Digite a %dº nota: ", i+1);
			vet[i] = leia.nextDouble();
			
			soma = soma + vet[i];
			//soma += vet[i];
			
			cont++;
		}
		
		media = soma/cont;
		for (int i=0; i<1000; i++)
		{
			if (vet[i] > media)
			{
				System.out.printf("O número %.2f é maior que a média!\n", vet[i]);
			}
		}
		
		
	}

}
