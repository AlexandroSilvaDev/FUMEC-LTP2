package LTP2;
import java.util.*;

public class Exercicio_4_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numA, numB, numC;
		int retorno;
		
		System.out.println("Digite o valor de A: ");
		numA = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		numB = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		numC = leia.nextInt();
		
		retorno = somarInteirosEntreAeB(numA, numB);
		System.out.println("A soma dos inteiros entre " + numA + " e " + numB + " é: " + retorno);
		
		exibirInteirosEntreAeB_DivisiveisPorC(numA, numB, numC);
	}
	
	public static int somarInteirosEntreAeB(int a, int b) {
		
		int soma = 0;
		
		for (int x = a + 1 ; x < b ; x++ ) {
			soma = soma + x;
		}
		return soma;
	}
	
	public static void exibirInteirosEntreAeB_DivisiveisPorC(int a, int b, int c) {
		
		for (int x = a + 1 ; x < b ; x++) {
			if ( x % c == 0 ) {
				System.out.println("O valor de " + x + " é divisível por " + c);
			}
		}
	}
}
