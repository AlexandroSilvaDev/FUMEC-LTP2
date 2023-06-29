package LTP1;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int doacao;
		
		System.out.printf("Digite 1-Alimento não-perecível, 2-Alimento perecível, 3-Vestuário, 4-Limpeza:");
		doacao = leia.nextInt();
		
		switch (doacao)
		{
			case 1:
				System.out.printf("Você escolheu a opção alimento não-perecível.");
				break;
			case 2:
				System.out.printf("Você escolheu a opção alimento perecível.");
				break;
			case 3:
				System.out.printf("Você escolheu a opção vestuário.");
				break;
			case 4:
				System.out.printf("Você escolheu a opção limpeza.");
				break;
			default:
				System.out.printf("Você não escolheu nenhuma das opções válidas");
		}
		System.out.printf("\nFim do programa.");
		

	}

}
