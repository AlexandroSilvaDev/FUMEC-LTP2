package LTP1;

/*Escreva um programa que imprima a m�dia dos
n�meros pares e a m�dia dos n�meros �mpares
de 0 a 1000*/

public class While2 {

	public static void main(String[] args) {
		
		int media1, media2, i = 1, contPar = 0, contImpar = 0, somaPar = 0, somaImpar = 0;
		
		while ( i <= 1000 )
		{
			if ( i%2 == 0 )
			{
				somaPar = somaPar + i;
				contPar++;
			}
			else
			{
				somaImpar = somaImpar + i;
				contImpar++;
			}
			i++;
		}
		
		media1 = somaPar/contPar;
		media2 = somaImpar/contImpar;
		
		System.out.printf("M�dia:\nPares � %d.\n�mpares � %d.", media1, media2);
	}

}
