package LTP1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		System.out.printf("Digite 1-Cadastro, 2-Imprimir:");
		opcao = leia.nextInt();
		
		switch (opcao)
		{
			case 1:
				System.out.printf("Voc� acessou a tela de cadastro.");
				break;
			case 2:
				System.out.printf("Rel�torio foi impresso.");
				break;
			default:
				System.out.printf("Op��o inv�lida.");
		}
		System.out.printf("\nFim do programa.");
		

	}

}
