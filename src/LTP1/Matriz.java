package LTP1;

/*Faça um programa que leia e imprima
  uma matriz 4×3 (4 linhas e 3 colunas).*/

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		/*double mat [][] = new double[3][4];
		
		Scanner leia = new Scanner(System.in);

		for (int i=0; i<3; i++)
		{
			for (int j=0; j<4; j++)
			{
				mat[i][j] = 1;
				System.out.printf("%.0f -", mat[i][j]);
			}
			System.out.printf("\n");
		}*/
		
		int mat[][] = new int[4][3];
		
		Scanner leia = new Scanner(System.in);
		
		for (int i=0; i<4; i++)
		{
			for (int j=0; j<3; j++)
			{
				System.out.printf("Digite o %dº elemento da %dº linha: \n", j+1, i+1);
				mat[i][j] = leia.nextInt();
			}
		}
		
		for (int i=0; i<4; i++)
		{
			for (int j=0; j<3; j++)
			{
				System.out.printf("%d \t", mat[i][j]);
			}
			System.out.printf("\n");
		}
		
	}

}
