package LTP1;

import java.util.Scanner;

/*Escreva um programa que solicite 5 n�meros ao usu�rio. 
O programa deve exibir, ao final, a m�dia dos n�meros pares, 
�mpares e de todos os valores digitados.*/

public class Wz_DoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int i=1, contPar=0, contImpar=0;
		float num, somaPar=0, somaImpar=0, media1, media2, mediaTotal;
		
		do
		{
			System.out.printf("Digite o %d n�mero:", i);
			num = leia.nextFloat();
			
			if ( num%2 == 0 )		
			{
				somaPar = somaPar + num;
				contPar++;
			}
			else
			{
				somaImpar = somaImpar + num;
				contImpar++;
			}
			i++;
		}while ( i <= 5 );
		
		media1 = somaPar/contPar;
		media2 = somaImpar/contImpar;
		mediaTotal = ( somaPar + somaImpar )/ ( contPar + contImpar );
		
		System.out.printf("A media �:\nPares: %.2f.\nImpares: %.2f.\nTotal: %.2f.", media1, media2, mediaTotal);
		
	}

}
