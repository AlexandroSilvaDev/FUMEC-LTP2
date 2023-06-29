package LTP2_Lista_5;

import java.util.*;

/*
Pedra-papel-tesoura � um jogo envolvendo dois jogadores em que cada jogador escolhe uma de 3 jogadas poss�veis:
 �pedra�, �papel� ou �tesoura�. O resultado do jogo � determinado com base nas seguintes regras:

O jogador que escolher �pedra� perde o jogo se o outro escolher �papel� e ganha caso
o outro escolha �tesoura�.

O jogador que escolher �papel� perde o jogo se o outro escolher �tesoura� e ganha
caso o outro escolha �pedra�.

O jogador que escolher �tesoura� perde o jogo se o outro escolher �pedra� e ganha
caso o outro escolha �papel�

Caso ambos escolham a mesma jogada, o jogo � considerado um empate.

Exerc�cio 4.4 - Fazer um programa para identificar e exibir os ganhadores de um jogo pedra-papel-tesoura. 
O programa dever� receber como entrada de dados sucessivas jogadas escolhida pelo jogador 1 e pelo jogador 2. 
Ap�s isso, para cada jogada, o programa dever� identificar e exibir na console o jogador vencedor.

O programa deve terminar se um dos jogadores introduzir uma jogada inv�lida.

Para identificar e exibir o jogador vencedor, construir um m�todo que receba como par�metro a jogada escolhida
pelo jogador 1 e pelo jogador 2. Em seguida o m�todo dever� identificar e exibir na console qual foi o jogador vencedor.

Seguem alguns exemplos:

Digite a jogada do Jogador 1: pedra
Digite a jogada do Jogador 2: papel

Jogador 2 venceu o jogo!

Digite a jogada do Jogador 1: tesoura
Digite a jogada do Jogador 2: papel

Jogador 1 venceu o jogo!
 
Digite a jogada do Jogador 1: xyz
Digite a jogada do Jogador 2: tesoura

Jogo terminado.
*/

public class Exercício_4_4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String jogador1;
		String jogador2;
		boolean encerrarJogo;
		
		do {
			System.out.println("Escolha entre pedra, papel e tesoura (jogador n�1): ");
			jogador1 = leia.next();
			
			System.out.println("Escolha entre pedra, papel e tesoura (jogador n�2): ");
			jogador2 = leia.next();
			
			encerrarJogo = true;
			
			if ( ! jogador1.equalsIgnoreCase("PEDRA") && ! jogador1.equalsIgnoreCase("PAPEL") && ! jogador1.equalsIgnoreCase("TESOURA") || 
					! jogador2.equalsIgnoreCase("PEDRA") && ! jogador2.equalsIgnoreCase("PAPEL") && ! jogador2.equalsIgnoreCase("TESOURA") ) {
				
				encerrarJogo = false;
			}
			
			encontrarVencedor(jogador1, jogador2);
			
		} while ( encerrarJogo );
		
		System.out.println("Fim do Jogo.");
	}

	public static void encontrarVencedor ( String primeira, String segunda ) {
		
		if ( primeira.equalsIgnoreCase(segunda) ) {
			System.out.println("Empate entre os jogadores!\n");
			
		} else if ( primeira.equalsIgnoreCase("PEDRA") ) {
			if ( segunda.equalsIgnoreCase("PAPEL") ) {
				System.out.println("\nO jogador n�2 venceu!\n");
				
			} else if ( segunda.equalsIgnoreCase("TESOURA") ) {
				System.out.println("\nO jogador n�1 venceu!\n");
			}
		} else if ( primeira.equalsIgnoreCase("PAPEL") ) {
			if ( segunda.equalsIgnoreCase("PEDRA") ) {
				System.out.println("\nO jogador n�1 venceu!\n");
				
			} else if ( segunda.equalsIgnoreCase("TESOURA") ) {
				System.out.println("\nO jogador n�2 venceu!\n");
			}
		} else if ( primeira.equalsIgnoreCase("TESOURA") ) {
			if ( segunda.equalsIgnoreCase("PEDRA") ) {
				System.out.println("\nO jogador n�2 venceu!\n");
				
			} else if ( segunda.equalsIgnoreCase("PAPEL") ) {
				System.out.println("\nO jogador n�1 venceu!\n");
			}
		} else {
			System.out.println("\nEscolha inv�lida!\n");
		}
	}
}
