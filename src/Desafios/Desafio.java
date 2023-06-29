package Desafios;

import java.util.Scanner;

/*Seu sistema tem cadastrado fixo o usuario 123 e senha 456. Somente quando o usuário informa essas credenciais o acesso é autorizado,
 *  caso contrário deve ser informado qual dos valores (usuário e, ou, senha) foi informado incorretamente.

Se o usuário informar essas credenciais corretamente, o sistema deve realizar um teste de 3 perguntas, sendo:

1 - Qual a cerveja preferida do Zeca Pagodinho?
	Opções: 1: Brahma, 2: Skol, 3: Belo Horizontina. //correta 1

2 - Qual o mascote do Clube Atlético Mineiro?
	Opções: 1: Raposa; 2: Galo; 3: Centopéia //correta 2

3 - Qual a cor da mula marrom de Jão Celestino?
	Opções: 1: Bege; 2; Branca; 3: Marrom; 4: Nenhuma //correta 3

Ao final, deve ser apresentada, EM UMA ÚNICA MENSAGEM, quais as questões ele acertou e quais ele errou. 
Em sequência, se acertou todas deve ser apresentada a mensagem: "Tú és um gênio". Se acertou 2, deve exibir: "Cabra mahomeno". 
Caso contrário, deve ser exibido "Eita miserento abestado".*/

public class Desafio {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int usuario, senha, t1, t2, t3, ind1 = 0, ind2 = 0, ind3 = 0;
		
		usuario = 123;
		senha = 456;
		
		System.out.printf("Digite o Usuário:");
		usuario = leia.nextInt();
		
		System.out.printf("Digite a Senha:");
		senha = leia.nextInt();
		
		if ( usuario == 123 && senha == 456 )
		{
			System.out.printf("\nLogin realizado com sucesso!");
			
			System.out.printf("\n\nQual a cerveja preferida do Zeca Pagodinho? \nDigite 1-Brahma, 2-Skol, 3-Belo Horizontina:");
			t1 = leia.nextInt();
			
			switch ( t1 )
			{
				case 1:
					System.out.printf("\nOpção Correta!");
					ind1 = 1;
					break;
				case 2:
					System.out.printf("\nOpção Incorreta!");
					ind1 = 0;
					break;
				case 3:
					System.out.printf("\nOpção Incorreta!");
					ind1 = 0;
					break;
				default:
					System.out.printf("\nOpção Inválida!");
					break;
			}
			
			System.out.printf("\n\nQual o mascote do Clube Atlético Mineiro? \nDigite 1-Raposa, 2-Galo, 3-Centopéia:");
			t2 = leia.nextInt();
			
			switch ( t2 )
			{
				case 1:
					System.out.printf("\nOpção Incorreta!");
					ind2 = 0;
					break;
				case 2:
					System.out.printf("\nOpção Correta!");
					ind2 = 1;
					break;
				case 3:
					System.out.printf("\nOpção Incorreta!");
					ind2 = 0;
					break;
				default:
					System.out.printf("\nOpção Inválida!");
					break;
			}
			
			System.out.printf("\n\nQual a cor da mula marrom de Jão Celestino? \nDigite 1-Bege, 2-Branca, 3-Marrom, 4-Nenhuma:");
			t3 = leia.nextInt();
			
			switch ( t3 )
			{
				case 1:
					System.out.printf("\nOpção Incorreta!\n");
					ind3 = 0;
					break;
				case 2:
					System.out.printf("\nOpção Incorreta!\n");
					ind3 = 0;
					break;
				case 3:
					System.out.printf("\nOpção Correta!\n");
					ind3 =1;
					break;
				case 4:
					System.out.printf("\nOpção Incorreta!\n");
					ind3 = 0;
					break;
				default:
					System.out.printf("\nOpção Inválida!\n");
					break;
			}
			
			if ( ind1 + ind2 + ind3 == 3 )
			{
				System.out.printf("\nTú és um gênio!");
			}
			else
			{
				if ( ind1 + ind2 + ind3 == 2 )
				{
					System.out.printf("\nCabra mahomeno!");
				}
				else
				{
					if ( ind1 + ind2 + ind3 == 1 )
					{
						System.out.printf("\nEita miserento abestado!");
					}
					else
					{
						System.out.printf("\nEita miserento abestado!");
					}
				}
			}
		}
		else
		{
			if ( usuario != 123 )
			{
				System.out.printf("\nUsuário inválido!");
			}
			else
			{
				System.out.printf("\nSenha inválida!");
			}
		}	
	}

}
