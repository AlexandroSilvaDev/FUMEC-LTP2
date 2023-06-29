package Desafios;

import java.util.Scanner;

/*Seu sistema tem cadastrado fixo o usuario 123 e senha 456. Somente quando o usu�rio informa essas credenciais o acesso � autorizado,
 *  caso contr�rio deve ser informado qual dos valores (usu�rio e, ou, senha) foi informado incorretamente.

Se o usu�rio informar essas credenciais corretamente, o sistema deve realizar um teste de 3 perguntas, sendo:

1 - Qual a cerveja preferida do Zeca Pagodinho?
	Op��es: 1: Brahma, 2: Skol, 3: Belo Horizontina. //correta 1

2 - Qual o mascote do Clube Atl�tico Mineiro?
	Op��es: 1: Raposa; 2: Galo; 3: Centop�ia //correta 2

3 - Qual a cor da mula marrom de J�o Celestino?
	Op��es: 1: Bege; 2; Branca; 3: Marrom; 4: Nenhuma //correta 3

Ao final, deve ser apresentada, EM UMA �NICA MENSAGEM, quais as quest�es ele acertou e quais ele errou. 
Em sequ�ncia, se acertou todas deve ser apresentada a mensagem: "T� �s um g�nio". Se acertou 2, deve exibir: "Cabra mahomeno". 
Caso contr�rio, deve ser exibido "Eita miserento abestado".*/

public class Desafio {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int usuario, senha, t1, t2, t3, ind1 = 0, ind2 = 0, ind3 = 0;
		
		usuario = 123;
		senha = 456;
		
		System.out.printf("Digite o Usu�rio:");
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
					System.out.printf("\nOp��o Correta!");
					ind1 = 1;
					break;
				case 2:
					System.out.printf("\nOp��o Incorreta!");
					ind1 = 0;
					break;
				case 3:
					System.out.printf("\nOp��o Incorreta!");
					ind1 = 0;
					break;
				default:
					System.out.printf("\nOp��o Inv�lida!");
					break;
			}
			
			System.out.printf("\n\nQual o mascote do Clube Atl�tico Mineiro? \nDigite 1-Raposa, 2-Galo, 3-Centop�ia:");
			t2 = leia.nextInt();
			
			switch ( t2 )
			{
				case 1:
					System.out.printf("\nOp��o Incorreta!");
					ind2 = 0;
					break;
				case 2:
					System.out.printf("\nOp��o Correta!");
					ind2 = 1;
					break;
				case 3:
					System.out.printf("\nOp��o Incorreta!");
					ind2 = 0;
					break;
				default:
					System.out.printf("\nOp��o Inv�lida!");
					break;
			}
			
			System.out.printf("\n\nQual a cor da mula marrom de J�o Celestino? \nDigite 1-Bege, 2-Branca, 3-Marrom, 4-Nenhuma:");
			t3 = leia.nextInt();
			
			switch ( t3 )
			{
				case 1:
					System.out.printf("\nOp��o Incorreta!\n");
					ind3 = 0;
					break;
				case 2:
					System.out.printf("\nOp��o Incorreta!\n");
					ind3 = 0;
					break;
				case 3:
					System.out.printf("\nOp��o Correta!\n");
					ind3 =1;
					break;
				case 4:
					System.out.printf("\nOp��o Incorreta!\n");
					ind3 = 0;
					break;
				default:
					System.out.printf("\nOp��o Inv�lida!\n");
					break;
			}
			
			if ( ind1 + ind2 + ind3 == 3 )
			{
				System.out.printf("\nT� �s um g�nio!");
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
				System.out.printf("\nUsu�rio inv�lido!");
			}
			else
			{
				System.out.printf("\nSenha inv�lida!");
			}
		}	
	}

}
