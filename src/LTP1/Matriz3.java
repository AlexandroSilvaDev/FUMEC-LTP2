package LTP1;

/*Escreva um programa que declare e preencha uma matriz (10 × 10) com valores fornecidos pelo usuário.
O programa deve imprimir o maior valor da matriz e em qual posição (linha e coluna) este valor está.*/

import java.util.Scanner;

public class Matriz3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int mat[][] = new int[10][10];
		int maiorNota=0, linha=0, coluna=0;
		
		for (int i=0; i<10; i++)
		{
			for (int j=0; j<10; j++)
			{
				System.out.printf("Digite o %dº elemento da %dº linha: ", j+1, i+1);
				mat[i][j] = leia.nextInt();
				
				if(mat[i][j] > maiorNota)
				{
					maiorNota = mat[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		System.out.printf("Valor %d na coordenada [%d][%d]", maiorNota, linha+1, coluna+1);
		
	}

}
