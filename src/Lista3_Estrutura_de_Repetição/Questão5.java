package Lista3_Estrutura_de_Repetição;

/*5. Fa�a um programa que exiba na tela a soma dos n�meros inteiros do intervalo [100, 200].*/

public class Questão5 {

	public static void main(String[] args) {
		
		int i=100, soma=0;
		
		for (i=100; i<=200;i++)
		{
			soma = soma + i;
		}
		
		System.out.printf("A soma dos n�meros inteiros do intervalo [100, 200] %d", soma);
	}

}
