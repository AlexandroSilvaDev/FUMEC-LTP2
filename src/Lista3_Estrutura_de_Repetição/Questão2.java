package Lista3_Estrutura_de_Repetição;

/*2. Fa�a um programa que exiba na tela a tabuada do n�mero 5 no seguinte formato: 5X1=5;
5X2=10; 5X3=15; ... ; 5X10=50. */

public class Questão2 {

	public static void main(String[] args) {
		
		int resultado;
		
		for (int i=1; i<=10;i++)
		{
			resultado = 5 * i;
			System.out.printf("5 x %d = %d\n", i, resultado);
		}
		
	}

}
