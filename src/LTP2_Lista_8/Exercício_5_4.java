package LTP2_Lista_8;
import java.util.*;

/*
Exerc�cio 5.4 - O DETRAN deseja fazer o controle das multas de ve�culos. Fa�a um programa em Java
que receba via teclado a PLACA DO VE�CULO, a DATA DA MULTA (DD/MM/AAAA) e o VALOR DA 
MULTA. 

O programa dever� consistir a entrada de dados da seguinte forma:

- A placa dever� ser uma String de 7 caracteres e ser formada por tr�s letras e quatro d�gitos. Ex: GVP5566
- O valor da multa dever� ser maior que zero.
- Fazer um m�todo de nome dataEhValida para consistir a data da multa: 
- o m�todo dever� receber como par�metro uma data no formato DD/MM/AAAA;

- a consist�ncia dever� seguir as seguintes regras:
- a String dever� ter 10 caracteres de tamanho.
- o 3�. E o 6�. Caracteres dever�o ser uma barra ('/').
- para os meses de Janeiro, Mar�o, Maio, Julho, Agosto, Outubro e Dezembro o dia dever� ser entre 1 e 31.
- para os meses Abril, Junho, Setembro e Novembro o dia dever� ser entre 1 e 30.
- para o m�s de Fevereiro:
- anos divis�veis por 4 e n�o divis�vel por 100 ou anos divis�veis por 400 o dia dever� ser entre 1 e 29 ((ano bissexto);
- para os demais anos o dia dever� ser entre 1 e 28; 
- os m�s dever� ser entre 1 e 12
- o ano dever� ser menor ou igual ao ano atual. 
- o m�todo dever� retornar um valor do tipo Boolean. Caso a data recebida como par�metro 
esteja de acordo com as regras acima a fun��o retornar� o valor TRUE, caso contr�rio, retornar� o valor FALSE. 

Como resultado final o programa dever� imprimir:
- A soma dos valores das multas.
- O valor m�dio das multas.
- O valor da menor multa.

Obs:
- Definir um Flag para encerrar o programa.
*/

public class Exercício_5_4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String placaVeiculo, letraPlaca, numeroPlaca;
		String dataMulta;
		float valorMulta, somaMultas = 0, mediaMultas = 0, menorMulta = 100000000;
		int letraValida = 0, numeroValido = 0, contadorMultas = 0;
		boolean validarDataMulta;
		
		do {
			do {
				System.out.println("Digite o valor da multa (0 para encerrar): ");
				valorMulta = leia.nextFloat();
				
				if ( valorMulta < 0 ) {
					System.out.println("Valor da multa inv�lido!");
				}
			} while ( valorMulta < 0 );
			
			if ( valorMulta == 0 )
			{
				System.out.println("Entrada de dados encerrada!");
				break;
			}
			
			do {
				do {
					System.out.println("Digite a placa do ve�culo: ");
					placaVeiculo = leia.next();
					
					if ( placaVeiculo.length() != 7 )
					{
						System.out.println("Placa inv�lida!");
					}
				} while ( placaVeiculo.length() != 7 );
				
				for ( int i = 0 ; i < 3 ; i++ ) 
				{
					letraPlaca = placaVeiculo.substring( i , i + 1 );
					
					letraValida = 0;
					if ( letraPlaca.compareToIgnoreCase("A") < 0 || letraPlaca.compareToIgnoreCase("Z") > 0 ) 
					{
						System.out.println("Os 3 primeiros d�gitos devem ser letras!");
						letraValida = 1;
						break;
					}
				}
				for ( int i = 3 ; i < 7 ; i++ ) 
				{
					numeroPlaca = placaVeiculo.substring( i , i + 1 );
					
					numeroValido = 0;
					if ( numeroPlaca.compareToIgnoreCase("0") < 0 || numeroPlaca.compareToIgnoreCase("9") > 0 )
					{
						System.out.println("Os 4 �ltimos d�gitos devem ser n�meros!");
						numeroValido = 1;
						break;
					}
				}
			} while ( letraValida == 1 || numeroValido == 1 );
			
			do {
				System.out.println("Digite a data (DD/MM/AAAA) da multa: ");
				dataMulta = leia.next();
				
				validarDataMulta = validarDataMulta(dataMulta);
				
				if ( ! validarDataMulta )
				{
					System.out.println("Data inv�lida!\n");
				}
			} while ( ! validarDataMulta );
			
			contadorMultas++;
			somaMultas = somaMultas + valorMulta;
			
			if ( menorMulta > valorMulta )
			{
				menorMulta = valorMulta;
			}
		} while ( true );
		
		mediaMultas = somaMultas / contadorMultas;
		
		if ( valorMulta == 0 && contadorMultas > 0 )
		{
			System.out.println("A soma das multas: " + somaMultas);
			System.out.println("O valor m�dio das multas: " + mediaMultas);
			System.out.println("O valor da menor multa: " + menorMulta);
		}
	}
	public static boolean validarDataMulta ( String dataMulta ) {
		
		boolean dataValida;
		int dia, mes, ano;
		
		dataValida = true;
		dia = Integer.parseInt(dataMulta.substring( 0 , 2 ));
		mes = Integer.parseInt(dataMulta.substring( 3 , 5 ));
		ano = Integer.parseInt(dataMulta.substring( 6 ));
		
		if ( dataMulta.length() != 10 )
		{
			dataValida = false;
			return dataValida;
		} 
		else if ( dataMulta.substring( 2 , 3 ).compareTo("/") != 0 || dataMulta.substring( 5 , 6 ).compareTo("/") != 0 )
		{
			dataValida = false;
			return dataValida;
		}
		else if ( mes >= 1 && mes <= 12 && ano <= 2022 )
		{
			if ( mes == 2 )
			{
				if ( ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0 )
				{
					if ( dia < 1 || dia > 29 )
					{
						dataValida = false;
						return dataValida;
					}
				}
				else
				{
					if ( dia < 1 || dia > 28 )
					{
						dataValida = false;
						return dataValida;
					}
				}
			}
			if ( mes == 4 || mes == 6 || mes == 9 || mes == 11 )
			{
				if ( dia < 1 || dia > 30 )
				{
					dataValida = false;
					return dataValida;
				}
			}
			else
			{
				if ( dia < 1 || dia > 31 )
				{
					dataValida = false;
					return dataValida;
				}
			}
		}
		return dataValida;
	}
}
