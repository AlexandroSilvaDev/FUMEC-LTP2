package LTP2;

import java.util.*;

/*
Exerc�cio 4.3 - Fazer um programa para controlar as contas de uma rede de Hoteis. Receber via teclado
o Nome do H�spede, o Dia de Entrada no Hotel, o Dia de Sa�da do Hotel, o Tipo de Quarto e a Cidade
do Hotel.
O programa dever� por meio de um m�todo de nome calcularConta, calcular e imprimir o valor da Conta
de cada h�spede de acordo com a seguinte tabela:
______________________________________
| Tipo de Quarto  |  Valor da Di�ria |
|------------------------------------| 
|    STANDARD     |      120,00      | 
|      LUXO       |      150,00      |
|   SUPER-LUXO    |      180,00      |
--------------------------------------
O valor da conta ser� o valor da di�ria multiplicada pelo n�mero de di�rias da hospedagem. Para
descobrir o n�mero de di�rias, subtrair o dia de sa�da do dia de entrada no hotel.
F�rmula => Valor da Conta = (diaSaida - diaEntrada) * Valor Diaria

Ex:
Dia de Entrada: 20
Dia de Sa�da: 25
Tipo de Quarto: Luxo - Valor Diaria: 150,00
Valor da conta: ( 25 � 20 ) * 150,00 = 750,00

O m�todo dever� receber como par�metro a Dia da Entrada, o Dia da Sa�da e o Tipo de Quarto.
O programa dever� imprimir no final um relat�rio com o Nome do h�spede e o Valor da Conta, de
todas as contas acima da m�dia.
Consist�ncias:
- Fazer um m�todo de nome cidadeEhValida para consistir a Cidade do Hoteldigitada.
- Par�metro: Cidade do Hotel digitada.
- Este m�todo dever� pesquisar no vetor vetCidades se o nome da cidade informada existe l�,
caso positivo, o m�todo dever� retornar o valor TRUE, caso negativo retornar o valor FALSE.
- Consistir o tipo de quarto para aceitar somente os valores STANDARD, LUXO ou SUPER-LUXO.
- O Dia de Sa�da dever� ser maior que o Dia de Entrada.
Obs:
- declarar no programa um vetor global de nome vetCidades contendo os seguintes nomes de cidades:
BELO HORIZONTE, S�O PAULO, RIO DE JANEIRO, SALVADOR e CURITIBA
- Criar um flag para encerrar a entrada de dados.
- O n�mero m�ximo de hospedagens que o programa receber� ser� 100.
- Considerar que a entrada e sa�da no hotel ocorrem sempre no mesmo m�s.
Layout do relat�rio:
Relat�rio de contas acima da m�dia

Nome do h�spede   Vlr Conta
-------------------------------- -------------
XXXXXXXXXXXXXXXX   999.99
XXXXXXXXXXXXXXXX   999.99
XXXXXXXXXXXXXXXX   999.99
XXXXXXXXXXXXXXXX   999.99
*/

public class Exercício_4_3 {

	static String cidades[] = {"BELO HORIZONTE", "S�O PAULO", "RIO DE JANEIRO", "SALVADOR", "CURITIBA"};
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
	}

}
