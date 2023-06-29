package LTP2_Lista_7;
import java.util.*;

/*
 Exerc�cio 5.3 - Fazer um programa em Java para calcular uma conta telef�nica. Ser�o digitadas via 
teclado o HOR�RIO INICIAL e o HOR�RIO FINAL de cada liga��o. Calcular e imprimir o CUSTO de 
cada chamada de acordo com a tabela abaixo:

______________________________________________
| Intervalo de hor�rio  |   Custo do minuto  |
----------------------------------------------
|    00:00 �s 05:59     |      R$ 0,10       |
----------------------------------------------
|    06:00 �s 07:59     |      R$ 0,15       |
----------------------------------------------
|    08:00 �s 17:59     |      R$ 0,20       |
----------------------------------------------
|    18:00 �s 23:59     |      R$ 0,15       |
----------------------------------------------

Obs: 
- Receber os hor�rios em vari�vel do tipo String no formato HH:MM. Exemplo: "10:30";
- Imprimir o valor TOTAL DA CONTA TELEF�NICA; 
- Considerar que as liga��es sempre ocorrem dentro do mesmo dia;
- Considerar o valor do minuto relativo a HOR�RIO INICIAL da chamada para calcular o CUSTO da 
chamada. Ex: se a chamada come�ou as 06:30, o valor do minuto para toda a chamada ser� R$0,15 
independente de quanto tempo durar a chamada;
- Criar um m�todo de nome horaEhValida que dever� receber como par�metro uma hora no formato 
HH:MM e consistir se HH est� entre 0 e 23 e MM est� entre 0 e 59. Caso afirmativo, o m�todo dever� 
retornar o valor TRUE, caso negativo o m�todo dever� retornar o valor FALSE.
- Criar uma consist�ncia para que o HOR�RIO FINAL da chamada seja sempre maior que o HOR�RIO 
INICIAL. 
- Adote um Flag para encerrar a entrada de dados.
 */

public class Exercício_5_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String horarioInicial;
		String horarioFinal;
		String parametroHora;
		float custoChamada = 0;
		float custoTotalChamadas = 0;
		int finalMenorInicial;
		int horaInicial = 0, minutoInicial = 0, horaFinal = 0, minutoFinal = 0;
		
		do {
			do {
				do {
					System.out.println("Digite o hor�rio de in�cio (HH:MM) da chamada (FIM para encerrar): ");
					horarioInicial = leia.next();
					parametroHora = horarioInicial;
					
					if ( horarioInicial.equalsIgnoreCase("FIM") ) {
						break;
					}
				} while ( ! validarHorarios(parametroHora) );
				do {
					System.out.println("Digite o hor�rio de t�rmino (HH:MM) da chamada: ");
					horarioFinal = leia.next();
					parametroHora = horarioFinal;
					
					if ( horarioFinal.equalsIgnoreCase("FIM") ) {
						break;
					}
				} while ( ! validarHorarios(parametroHora) );
				
				if ( parametroHora.equalsIgnoreCase("FIM") ) {
					break;
				}
				
				horaInicial = Integer.parseInt( horarioInicial.substring( 0 , 2 ));
				minutoInicial = Integer.parseInt( horarioInicial.substring( 3 ));
				horaFinal = Integer.parseInt( horarioFinal.substring( 0 , 2 ));
				minutoFinal = Integer.parseInt( horarioFinal.substring( 3 ));
				
				finalMenorInicial = 0;
				if ( horaFinal < horaInicial ) 
				{
					System.out.println("A hora de t�rmino deve ser maior que a hora de in�cio da chamada!");
					finalMenorInicial = 1;
				} 
				else if ( horaFinal == horaInicial ) 
				{
					if ( minutoFinal < minutoInicial ) 
					{
						System.out.println("A hora de t�rmino deve ser maior que a hora de in�cio da chamada!");
						finalMenorInicial = 1;
					}
				}
			} while ( finalMenorInicial == 1 );
			
			if ( parametroHora.equalsIgnoreCase("FIM") ) 
			{
				System.out.println("Veja agora o valor total da conta telef�nica: \n");
				break;
			}
			
			if ( ( horaInicial >= 0 && minutoInicial >= 0 ) && ( horaInicial <= 5 && minutoInicial <= 59 ) ) 
			{
				custoChamada = ((( horaFinal - horaInicial) * 60 ) + ( minutoFinal - minutoInicial )) * 0.10f;
			} 
			else if ( ( horaInicial >= 6 && minutoInicial >= 0 ) && ( horaInicial <= 7 && minutoInicial <= 59 ) ) 
			{
				custoChamada = ((( horaFinal - horaInicial) * 60 ) + ( minutoFinal - minutoInicial )) * 0.15f;
			} 
			else if ( ( horaInicial >= 8 && minutoInicial >= 0 ) && ( horaInicial <= 17 && minutoInicial <= 59 ) ) 
			{
				custoChamada = ((( horaFinal - horaInicial) * 60 ) + ( minutoFinal - minutoInicial )) * 0.20f;
			} 
			else if ( ( horaInicial >= 18 && minutoInicial >= 0 ) && ( horaInicial <= 23 && minutoInicial <= 59 ) ) 
			{
				custoChamada = ((( horaFinal - horaInicial) * 60 ) + ( minutoFinal - minutoInicial )) * 0.15f;
			}
			custoTotalChamadas = custoTotalChamadas + custoChamada;
			
			System.out.println("O valor da chamada �: " + custoChamada + "\n");
		} while ( true );
		System.out.println(custoTotalChamadas);
	}
	public static boolean validarHorarios ( String parametroHora ) {
		
		int hora, minuto;
		boolean horarioValido;
		
		horarioValido = false;
		try {
			hora = Integer.parseInt( parametroHora.substring( 0 , 2 ));
			minuto = Integer.parseInt( parametroHora.substring( 3 ));
			
			if (( hora >= 0 && hora <= 23 ) && ( minuto >= 0  && minuto <= 59 )) {
				horarioValido = true;
			} else {
				System.out.println("Hora digitada inv�lida!\n");
			}
		} catch ( NumberFormatException E ) {
			System.out.println("\nO texto digitado n�o pode ser convertido em n�mero!");
		}
		
		return horarioValido;
	}
}
