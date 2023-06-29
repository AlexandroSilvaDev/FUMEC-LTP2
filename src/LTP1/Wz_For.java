package LTP1;

/*Faça um programa que leia as notas da
primeira prova de 10 alunos de LTP1 e calcule e
imprima a média das notas.*/

import java.util.Scanner;

public class Wz_For {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float i, nota, soma=0, media;
		
		for (i=1; i<=10; i++)
		{
			System.out.printf("Digite a %.0f° nota:", i);		//i	 soma	nota
			nota = leia.nextFloat();							//1	   0	 10
																//3   15     4
			soma = soma + nota;									//4   19
			//soma += nota										//2   10     5
		}														
		System.out.printf("Media: %.1f", soma/(i-1));
	}
}
