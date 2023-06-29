package LTP2_Lista_1;

import java.util.Scanner;

/*Exerc�cio 1.1 - Fazer um programa em Java que receba via teclado o Nome do Aluno, a Nota1, a Nota2 
e a Nota3. O programa dever� calcular e imprimir a m�dia e o desempenho do aluno baseado nas 
seguintes regras: 
- m�dia de 7 para cima => aluno aprovado
- m�dia de 4 para baixo => aluno reprovado
- m�dia entre 4.1 e 6.9 => aluno em recupera��o*/

public class Questão_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nomeAluno;
		float nota = 0;
		float contadorNota = 0;
		float soma = 0;
		
		System.out.print("Digite o nome do aluno: ");
		nomeAluno = leia.nextLine();
		
		for (int i=1; i<=3; i++) {
			System.out.printf("Digite a %d� nota: ", i);
			nota = leia.nextFloat();
			soma = soma + nota;
			contadorNota++;
		}
		System.out.printf("A media do(a) aluno(a) �: %.2f", soma/contadorNota);
		
		if ( soma/contadorNota >= 7 ) {
			System.out.print("\nAluno aprovado!");
		}else if ( soma/contadorNota > 4 && soma/contadorNota < 7 ) {
			System.out.print("\nAluno em recupera��o!");
		}else {
			System.out.print("\nAluno reprovado!");
		}
	}
}
