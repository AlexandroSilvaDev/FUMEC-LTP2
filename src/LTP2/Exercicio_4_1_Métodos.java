package LTP2;
import java.util.*;

public class Exercicio_4_1_Métodos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numA, numB, numC;
		int retornoSoma, retornoPercentual;
		
		System.out.println("Digite o valor de A: ");
		numA = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		numB = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		numC = leia.nextInt();
		
		retornoSoma = somarInteirosEntreAeB(numA, numB);
		System.out.println("A soma dos inteiros entre " + numA + " e " + numB + " �: " + retornoSoma);
		
		exibirInteirosEntreAeB_DivisiveisPorC(numA, numB, numC);
		
		retornoPercentual = retornarPercentualDeNumC_EmRelacaoA_NumC(numA, numC);
		System.out.println("O valor pencentual de " + numC + " em rela��o a " + numA + " �: " + retornoPercentual + "%");
	}
	
	public static int somarInteirosEntreAeB(int a, int b) {
		
		int soma = 0;
		
		if ( a > b ) {
			for (int x = a - 1 ; x > b ; x-- ) {
				soma = soma + x;
			}
		} else {
			for (int x = a + 1 ; x < b ; x++ ) {
				soma = soma + x;
			}
		}
		return soma;
	}
	
	public static void exibirInteirosEntreAeB_DivisiveisPorC(int a, int b, int c) {
		
		for (int x = a + 1 ; x < b ; x++) {
			if ( x % c == 0 ) {
				System.out.println("O valor de " + x + " � divis�vel por " + c);
			}
		}
	}
	
	public static int retornarPercentualDeNumC_EmRelacaoA_NumC(int a, int c) {
		
		int percentual = 0;
		
		percentual = (int) ( ( (float) c / a ) * 100 );
		
		return percentual;
	}
}
