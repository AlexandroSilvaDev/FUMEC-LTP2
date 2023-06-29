package Lista3_Estrutura_de_Repetição;

import java.util.Scanner;

/*7. Fa�a um programa que solicita ao usu�rio uma quantidade indeterminada de n�meros inteiros. O
programa deve calcular e escrever a m�dia aritm�tica apenas dos n�meros pares. A entrada de
dados deve ser encerrada quando o n�mero ZERO for digitado. */

public class Questão7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int i=1, num, contPar=0;
		float  somaPar=0, media=0;
		
		do
		{
			System.out.printf("Digite o %d� n�mero:", i);
			num = leia.nextInt();
			if ( num%2 == 0 && num != 0 )
			{
				somaPar = somaPar + num;
				contPar++;                                      
			}                                                   
			i++;                                                
		}while ( num != 0 );
		
		media = somaPar/contPar;
		System.out.printf("A media dos n�meros pares �: %.2f", media);
	}

}
