package LTP2_Lista_1;

import java.util.Scanner;

/*Exerc�cio 1.2 � Fazer um programa em Java que receba via teclado as medidas dos 3 lados de um 
tri�ngulo. De acordo com os valores digitados o programa dever� imprimir o tipo do tri�ngulo:
- n�o � triangulo, se a soma de dois lados for menor ou igual ao terceiro lado;
- eq�il�tero, se os 3 lados forem iguais;
- is�sceles, se 2 lados forem iguais e 1 diferente;
- escaleno, se os 3 lados forem diferentes;*/

public class Questão_1_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float lado = 0;
		float lado1 = 0;
		float lado2 = 0;
		float lado3 = 0;
		
		for (int i=1; i<=3; i++) {
			System.out.printf("Digite o %d� lado: ", i);
			lado = leia.nextFloat();
			if ( i == 1 ) {
				lado1 = lado;
			}else if ( i == 2 ) {
				lado2 = lado;
			}else if ( i == 3 ) {
				lado3 = lado;
			}
		}
		if ( lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1 ) {
			System.out.print("N�o � um tri�ngulo!");
		}else if ( lado1 == lado2 && lado2 == lado3 ) {
			System.out.print("O tri�ngulo � equil�tero!");
		}else if ( lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2 || lado2 == lado3 && lado2 != lado1) {
			System.out.print("O tri�ngulo � is�sceles!"); 
		}else {
			System.out.print("O tri�ngulo � escaleno!");
		}
	}

}
