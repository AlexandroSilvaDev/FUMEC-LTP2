package LTP1;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int doacao;
		
		System.out.printf("Digite 1-Alimento n�o-perec�vel, 2-Alimento perec�vel, 3-Vestu�rio, 4-Limpeza:");
		doacao = leia.nextInt();
		
		switch (doacao)
		{
			case 1:
				System.out.printf("Voc� escolheu a op��o alimento n�o-perec�vel.");
				break;
			case 2:
				System.out.printf("Voc� escolheu a op��o alimento perec�vel.");
				break;
			case 3:
				System.out.printf("Voc� escolheu a op��o vestu�rio.");
				break;
			case 4:
				System.out.printf("Voc� escolheu a op��o limpeza.");
				break;
			default:
				System.out.printf("Voc� n�o escolheu nenhuma das op��es v�lidas");
		}
		System.out.printf("\nFim do programa.");
		

	}

}
