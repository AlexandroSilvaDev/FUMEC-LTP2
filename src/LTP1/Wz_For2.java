package LTP1;

/*Faça um programa que leia as notas da
primeira prova de 10 alunos de PC e calcule e
imprima a média das notas. Altere o programa 
para validar que a nota é um valor entre 0 e 10.*/

import java.util.Scanner;

public class Wz_For2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int i;
		float nota, soma=0, media;
		
		for (i=1; i<=10; i++)
		{
			do
			{
				System.out.printf("Digite a %d° nota:", i);
				nota = leia.nextInt();
				
			}while (nota<0 || nota>10);
			
			soma = soma + nota;
			//soma += nota;
		}
		
		System.out.printf("Media: %.2f", soma/(i-1));
	}

}
