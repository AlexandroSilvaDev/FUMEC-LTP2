package LTP2_Lista_3;

import java.util.Scanner;

/*
Exerc�cio 3.1 � Fazer um programa em Java para consultar informa��es sobre os v�os de uma empresa 
a�rea. Primeiramente o programa dever� receber via teclado os Nomes e respectivas Dist�ncias (em 
km, at� Belo Horizonte) de at� 20 Cidades no mundo e armazenar em dois vetores. Em seguida, o 
programa dever� entrar no m�dulo de consultas e solicitar o Nome de uma Cidade. Para cada cidade 
digitada o programa dever� calcular e exibir os seguintes resultados:

- Pre�o da Passagem
- Tempo de V�o em minutos
- N�mero de escalas no percurso

Considera��es para os c�lculos:

- A empresa a�rea cobra R$0,25 por km percorrido no v�o
- O avi�o voa com uma velocidade de 800 km/h
- A empresa a�rea faz uma escala a cada 3 horas de v�o.

Observa��es:

- Adotar um flag para finalizar a entrada de dados com os Nomes de Cidades e Dist�ncias 
- Adotar um flag para finalizar as consultas 
- Exibir mensagem de erro se o Nome da Cidade digitada na consulta n�o existir na lista de 
cidades digitadas inicialmente (Max. 20) 
- Durante a digita��o dos Nomes das Cidades e Dist�ncias, consistir:
- O Nome da Cidade dever� ser de preenchimento obrigat�rio 
- A dist�ncia at� Belo Horizonte dever� ser no m�nimo 500 km.     
*/

public class Questão_1 {

	public static void main(String[] args) {
	
		// 1 - Vari�veis:
		
		Scanner leia = new Scanner(System.in);
		
		String nomeCidade[] = new String[20];
		float distancia[] = new float[20];
		String nomePesquisa;
		boolean encontrou;
		int i;
		float precoPassagem = 0;
		float tempoVoo = 0;
		byte numeroEscalas = 0;
		byte contador;
		
		// 2 - Entrada de Dados:
		
			for(i = 0 ; i < 20 ; i++) {
				do {
					System.out.println("Digite o " + (i + 1) + "� nome de uma cidade qualquer: ");
					nomeCidade[i] = leia.nextLine();
	
					if ( nomeCidade[i].equalsIgnoreCase("") ) {
						System.out.println("� obrigat�rio digitar o nome de uma cidade para continuar!\n");
					}
				} while( nomeCidade[i].equalsIgnoreCase("") );
				
				if ( nomeCidade[i].equalsIgnoreCase("SAIR") ) {
					System.out.println("Encerrando a entrada de dados!\n");
					break;
				} 

				do {
					System.out.println("Digite a dist�ncia desta cidade at� Belo Horizonte: ");
					distancia[i] = leia.nextFloat();
					
					if ( distancia[i] < 500 ) {
						System.out.println("A dist�ncia at� Belo Horizonte deve ser de, no m�nimo, 500 km!\n");
					}
				} while( distancia[i] < 500 );
				
				leia.nextLine();
			}
		
		// 3 - Mecanismo de Pesquisa:	
			
		do {
			System.out.println("Digite o nome da cidade para pesquisa (FIM para encerrar a pesquisa): ");
			nomePesquisa = leia.nextLine();
			
			if ( nomePesquisa.equalsIgnoreCase("FIM") ) {
				System.out.println("Fim da pesquisa!\n");
				break;
			}
			encontrou = false;
			
			for ( contador = 0 ; contador < i ; contador++ ) {
				if ( nomePesquisa.equalsIgnoreCase(nomeCidade[contador]) ) {
					encontrou = true;
					break;
				}
			}
			
		// 4 - C�lculos (Objetivo):
			
			if ( encontrou ) {
				precoPassagem = distancia[contador] * (float) 0.25;
				tempoVoo = (distancia[contador] / 800) * 60;
				numeroEscalas = (byte) (tempoVoo / 180);
			}
			
		// 5 - Sa�das:
			
			else {
				System.out.println("Cidade pesquisada n�o encontrada, tente novamente!\n");
			}
			System.out.println("O pre�o da passagem de " + nomePesquisa + " at� Belo Horizonte �: " + precoPassagem);
			System.out.println("O tempo de v�o (em minutos) de " + nomePesquisa + " at� Belo Horizonte �: " + tempoVoo);
			System.out.println("O n�mero de escalas a cada 3 horas de " + nomePesquisa + " at� Belo Horizonte �: " + numeroEscalas + "\n");
			
		} while( ! nomePesquisa.equalsIgnoreCase("FIM") );
	}
}
