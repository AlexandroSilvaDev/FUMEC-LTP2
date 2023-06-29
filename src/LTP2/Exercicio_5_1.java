package LTP2;

import java.util.*;

/*
Exercício 5.1 – Faça um programa em Java para receber via teclado a data de nascimento de uma
pessoa e a data de hoje, ambas no formato string DD/MM/AAAA. O programa deverá criar um método
para calcular e imprimir a idade da pessoa.
*/

public class Exercicio_5_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String dataHoje;
		String dataNascimento;
		
		System.out.println("Digite a data de hoje (DD/MM/AAAA): ");
		dataHoje = leia.next();
		
		System.out.println("Digite a data de nascimento (DD/MM/AAAA): ");
		dataNascimento = leia.next();
		
		calcularIdade(dataHoje, dataNascimento);
	}
	
	public static void calcularIdade (String hoje, String nascimento) {
		
		String diaHojeSTR, mesHojeSTR, anoHojeSTR;
		String diaNascimentoSTR, mesNascimentoSTR, anoNascimentoSTR;
		
		diaHojeSTR = hoje.substring(0, 2);
		mesHojeSTR = hoje.substring(3, 5);
		anoHojeSTR = hoje.substring(6);
		
		diaNascimentoSTR = nascimento.substring(0, 2);
		mesNascimentoSTR = nascimento.substring(3, 5);
		anoNascimentoSTR = nascimento.substring(6);
		
		int diaHoje, mesHoje, anoHoje;
		int diaNascimento, mesNascimento, anoNascimento;
		int idade;
		
		diaHoje = Integer.parseInt(diaHojeSTR);
		mesHoje = Integer.parseInt(mesHojeSTR);
		anoHoje = Integer.parseInt(anoHojeSTR);
		
		diaNascimento = Integer.parseInt(diaNascimentoSTR);
		mesNascimento = Integer.parseInt(mesNascimentoSTR);
		anoNascimento = Integer.parseInt(anoNascimentoSTR);
		
		idade = anoHoje - anoNascimento;
		
		if ( (mesNascimento > mesHoje) || (mesNascimento == mesHoje && diaNascimento > diaHoje) ) {
			idade--;
		}
		System.out.println("Idade: " + idade);
	}
}
