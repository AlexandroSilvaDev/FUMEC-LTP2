package LTP1;

/*Escreva um programa que some os n�meros pares de 0 a 500.*/

public class While {

	public static void main(String[] args) {
		
		int a = 0, b = 0;
		
		
		
		while ( a <= 500 )
		{
			if ( a % 2 == 0 )
			{
				b = b + a;
			}
			a++;
		}
		System.out.printf("A soma dos n�meros pares de 0 a 500 � = %d", b);
		

	}

}
