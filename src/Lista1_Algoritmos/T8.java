package Lista1_Algoritmos;

/*8. Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por
mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas
por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor
total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva
o salário final do vendedor.*/

import java.util.Scanner;

public class T8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int carrosVendidos;
		float salario, totalVendas, valorPorCarro;
		
		System.out.printf("Digite a quantidade de carros vendidos:");
		carrosVendidos = leia.nextInt();
		
		System.out.printf("Digite o sálario fixo:");
		salario = leia.nextFloat();
		
		System.out.printf("Digite o Valor total de vendas:");
		totalVendas = leia.nextFloat();
		
		System.out.printf("Digite o valor recebido por carro vendido:");
		valorPorCarro = leia.nextFloat();
		
		System.out.printf("O sálario final do vendedor é %.2f", (salario+(carrosVendidos*valorPorCarro)+(totalVendas*0.05)) );
		
		System.out.printf("\nFim do programa");

	}

}
