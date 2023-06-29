package Desafios;

import java.util.Scanner;

/*Que tal implementar um jogo da velha?
__________________
__X__|_____|__O__
_____|__X__|__O__
__O__|_____|__X__

Resultados possíveis:
1) Deu velha
2) Jogador 1 ganhou
3) jogador 2 ganhou

Dicas:
Pode considerar um variável para cada posição
Desenhe na tela (printf) o quadro do jogo com as posições de 1 a 9
Peça para cada jogador especificar uma posição por vez (não pode ser uma já jogada)
Isso deve acontecer até que todas as posições sejam selecionadas (deu velha) ou até alguém vencer

Bora lá?*/

public class Desafio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int p1=0, p2=0, p3=0, p4=0, p5=0, p6=0, p7=0, p8=0, p9=0, i=0, valor, situacao=0;
		
		do
		{
			/*Jogador 1 é o par e as posições são setadas com 1. 
			Jogador 2 é o ímpar e as posições são setadas com 2.*/
			
			System.out.printf("Jogador %d. Digite a posição:", (i%2)+1);
			valor = leia.nextInt();
			
			switch (valor)
			{
				case 1:
					if ( p1 != 0 )
					{
						System.out.printf("\nPosição já utilizada!\n\n");
						i--;
					}
					
					else
					{
						if ( i%2 == 0 )  //se for o Jogador 1
						{
							p1 = -1;
						}
						else             //senão é o Jogador 2 guardando nesta posição
						{
							p1 = 2;
						}
					}
					
					System.out.printf("____________________\n"
							        + "___%d__|______|______\n"
							        + "______|______|______\n"
							        + "______|______|______\n\n", (i%2)+1 );
					
					break;
				
				case 2:
					if ( p2 != 0 )
					{
						System.out.printf("\nPosição já utilizada!\n\n");
						i--;
					}
					
					else
					{
						if ( i%2 == 0 )
						{
							p2 = -1;
						}
						else
						{
							p2 = 2;
						}
					}
					
					System.out.printf("____________________\n"
							        + "______|___%d__|______\n"
							        + "______|______|______\n"
							        + "______|______|______\n\n", (i%2)+1 );
					
					break;
					
				case 3:
					if ( p3 != 0 )
					{
						System.out.printf("\nPosição já utilizada!\n\n");
						i--;
					}
					
					else
					{
						if ( i%2 == 0 )
						{
							p3 = -1;
						}
						else
						{
							p3 = 2;
						}
					}
					
					System.out.printf("____________________\n"
							        + "______|______|___%d__\n"
							        + "______|______|______\n"
							        + "______|______|______\n\n", (i%2)+1 );
					
					break;
					
				case 4:
					if ( p4 != 0 )
					{
						System.out.printf("\nPosição já utilizada!\n\n");
						i--;
					}
					
					else
					{
						if ( i%2 == 0 )
						{
							p4 = -1;
						}
						else
						{
							p4 = 2;
						}
					}
					
					System.out.printf("____________________\n"
							        + "______|______|______\n"
							        + "___%d__|______|______\n"
							        + "______|______|______\n\n", (i%2)+1 );
					
					break;
					
				case 5:
					if ( p5 != 0 )
					{
						System.out.printf("\nPosição já utilizada!\n\n");
						i--;
					}
					
					else
					{
						if ( i%2 == 0 )
						{
							p5 = -1;
						}
						else
						{
							p5 = 2;
						}
					}
					
					System.out.printf("____________________\n"
							        + "______|______|______\n"
							        + "______|___%d__|______\n"
							        + "______|______|______\n\n", (i%2)+1 );
					
					break;
					
				case 6:
					if ( p6 != 0 )
					{
						System.out.printf("\nPosição já utilizada!\n\n");
						i--;
					}
					
					else
					{
						if ( i%2 == 0 )
						{
							p6 = -1;
						}
						else
						{
							p6 = 2;
						}
					}
					
					System.out.printf("____________________\n"
							        + "______|______|______\n"
							        + "______|______|___%d__\n"
							        + "______|______|______\n\n", (i%2)+1 );
					
					break;
					
				case 7:
					if ( p7 != 0 )
					{
						System.out.printf("\nPosição já utilizada!\n\n");
						i--;
					}
					
					else
					{
						if ( i%2 == 0 )
						{
							p7 = -1;
						}
						else
						{
							p7 = 2;
						}
					}
					
					System.out.printf("____________________\n"
							        + "______|______|______\n"
							        + "______|______|______\n"
							        + "___%d__|______|______\n\n", (i%2)+1 );
					
					break;
					
				case 8:
					if ( p8 != 0 )
					{
						System.out.printf("\nPosição já utilizada!\n\n");
						i--;
					}
					
					else
					{
						if ( i%2 == 0 )
						{
							p8 = -1;
						}
						else
						{
							p8 = 2;
						}
					}
					
					System.out.printf("____________________\n"
							        + "______|______|______\n"
							        + "______|______|______\n"
							        + "______|___%d__|______\n\n", (i%2)+1 );
					
					break;
					
				case 9:
					if ( p9 != 0 )
					{
						System.out.printf("\nPosição já utilizada!\n\n");
						i--;
					}
					
					else
					{
						if ( i%2 == 0 )
						{
							p9 = -1;
						}
						else
						{
							p9 = 2;
						}
					}
					
					System.out.printf("____________________\n"
							        + "______|______|______\n"
							        + "______|______|______\n"
							        + "______|______|___%d__\n\n", (i%2)+1 );
					
					break;
					
				default:
				{
					System.out.printf("\nPosição inválida.\n\n");
					i--;
				}
				
			}
			
			if(p1+p2+p3 == -3 || p1+p5+p9 == -3 || p1+p4+p7 == -3
					|| p2+p5+p8 == -3 || p3+p5+p7 == -3  || p3+p6+p9 == -3
					|| p4+p5+p6 == -3 || p7+p8+p9 == -3 ) 						//Jogador 1 venceu
			{	
				situacao = 1;
			}
			else
			{	
				if(p1+p2+p3 == 6 || p1+p5+p9 == 6 || p1+p4+p7 == 6
					|| p2+p5+p8 == 6 || p3+p5+p7 == 6  || p3+p6+p9 == 6
					|| p4+p5+p6 == 6 || p7+p8+p9 == 6 )							//Jogador 2 venceu
				{
					situacao = 2;
				}	
				else
				{	
					if(i>=8) 													//deu velha
					{	
						situacao = 3;
					}	
				}	
			}	
			i++;
			
			/*System.out.printf("____________________\n"
					        + "__%d__|__%d__|__%d__\n"
					        + "__%d__|__%d__|__%d__\n"
					        + "__%d__|__%d__|__%d__\n\n", (i%2), (i%2), (i%2), (i%2), (i%2), (i%2), (i%2), (i%2), (i%2));*/
			
		}while ( situacao == 0 );
		
		if ( situacao == 1 )
		{
			System.out.printf("O jogador 1 ganhou!");
		}
		else
		{
			if ( situacao == 2 )
			{
				System.out.printf("O jogador 2 ganhou!");
			}
			
			else
			{
				System.out.printf("Deu velha!");
			}
		}
	}
}
