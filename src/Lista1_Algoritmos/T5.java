package Lista1_Algoritmos;

/*5. Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a
idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e m�s com 30 dias.*/

import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int anos, meses, dias;
		
		System.out.printf("Digite quantos anos voc� t�m:");
		anos = leia.nextInt();
		
		System.out.printf("Digite quantos meses voc� t�m:");
		meses = leia.nextInt();
		
		System.out.printf("Digite quantos dias voc� t�m:");
		dias = leia.nextInt();
		
		System.out.printf("A idade expressa em dias � %d.",((anos*365)+ meses*30)+ dias);
		
		System.out.printf("\nFim do programa.");
		

	}

}
