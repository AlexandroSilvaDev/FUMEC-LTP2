package Lista2_Expressoes_e_Condicionais;

import java.util.Scanner;

/*5. Fa�a um programa que verifica se a letra digitada pelo usu�rio � vogal ou consoante.
*/

public class Questão5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		char letra;
		
		System.out.printf("Digite uma letra:");
		letra = leia.next().charAt(0);
		
		if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' 
		   || letra == 'I' || letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U')
		{
			System.out.printf("A letra %c � uma vogal.", letra);
		}
		else
		{
			System.out.printf("A letra %c � uma consoante", letra);	
		}
		
		System.out.printf("\nFim do programa.");
		
	}

}
