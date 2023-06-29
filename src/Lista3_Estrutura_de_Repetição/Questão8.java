package Lista3_Estrutura_de_Repetição;

import java.util.Scanner;

/*8. Fa�a um programa que solicita ao usu�rio um n�mero real positivo. Verifique se o n�mero �
realmente positivo, e em caso contr�rio solicite ao usu�rio digitar novamente (este processo pode
se repetir in�meras vezes e � chamado de consist�ncia, pois garante que o n�mero ser� v�lido
ap�s a entrada de dados).*/

public class Questão8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double num;
		
		do
		{
			System.out.printf("Digite um n�mero real positivo:");
			num = leia.nextDouble();
			
		}while ( num < 0 );

	}

}
