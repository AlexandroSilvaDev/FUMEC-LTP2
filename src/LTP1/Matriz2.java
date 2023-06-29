package LTP1;

/*Dada uma matriz (4x5), calcular a soma de todos os elementos da matriz.
  Calcular  também o somatório dos elementos de cada linha da matriz,
  armazenando o somatorio em um vetor.*/

public class Matriz2 {

	public static void main(String[] args) {
		
		int mat[][] = { {1, 2, 3, 4, 5}, {0, -1, 0, -3, 1}, {2, -2, -2, 2, 0}, {0, 0, 6, 0, 0} }, vet[] = new int[4], soma=0, somaLinha=0;
		
		for (int i=0; i<4; i++)
		{	
			somaLinha=0;
			
			for (int j=0; j<5; j++)
			{
				soma = soma + mat[i][j];
				//soma += mat[i][j];
				
				somaLinha = somaLinha + mat[i][j];
				//somaLinha += mat[i][j];
			}

			vet[i] = somaLinha;
		}
		
		System.out.printf("A soma dos elementos da matriz é: %d", soma);
		//System.out.printf("\n\nO vetor com a soma das linhas é:\n\n%d\n%d\n %d\n %d", vet[0], vet[1], vet[2], vet[3]);
		
		for (int i=0; i<4; i++)
		{
			System.out.printf("\n %d", vet[i]);
		}
		

	}

}
