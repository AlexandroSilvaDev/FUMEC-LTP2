package LTP1;

import java.util.Scanner;

/*Ler 3 n�meros inteiros do teclado para depois
imprimir os n�meros na ordem inversa de leitura.*/

public class Vetores2 {

	public static void main(String[] args) {
		int vet[] = new int[3];
		
		Scanner leia = new Scanner(System.in);
		
		for (int i=0; i<=2; i++)
		{
			System.out.printf("Digite o %d� valor: ", i+1);
			vet[i] = leia.nextInt();
		}
		
		for (int i=2; i>=0; i--)
		{
			System.out.printf("%d - ", vet[i]);
		}
	}

}
