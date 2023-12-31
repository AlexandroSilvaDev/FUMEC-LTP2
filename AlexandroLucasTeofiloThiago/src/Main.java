import java.util.*;

public class Main {
	
	static Scanner leia = new Scanner(System.in);
	static String codigoMarca[] = { "BM" , "VW" , "FO" , "MB" , "CV" , "FI" , "AU" , "TO" , "HO" , "HY" };
	static String descricaoMarca[] = {"BMW", "Volkswagen", "Ford", "Mercedes Benz", "Chevrolet", "Fiat", "Audi", "Toyota", "Honda", "Hyundai"};
	static String categoria[] = { "GI" , "PI" , "GN" , "PN" };
	
	public static void main(String[] args) {	
		Estacionamento estacionamento = new Estacionamento();
    	byte op = -1;
    	 
    	do {
			do {
    			System.out.println("\n ***************  ESTACIONAMENTO  ***************** ");
    			System.out.println(" [1] ENTRADA VEICULO ");
    			System.out.println(" [2] SAIDA VEICULO ");
    			System.out.println(" [3] ALTERAR DADOS DO VEICULO ");
    			System.out.println(" [4] EXCLUIR VEICULO ");
    			System.out.println(" [5] CONSULTAR DADOS ");
    			System.out.println(" [6] RELATORIO DE FATURAMENTO ");
    			System.out.println(" [0] SAIR");
    			System.out.print("\nDigite a opcao desejada: ");
    			op = leia.nextByte();
    			
    			if (op < 0 || op > 6) 
    			{
    				System.out.println("opcao Invalida, digite novamente.\n");
    			}
    		}while (op < 0 || op > 6);
			
			switch (op) {
				case 0:
					System.out.println("\n ************  PROGRAMA ENCERRADO  ************** \n");
					break;
				case 1: 
					estacionamento.incluirVeiculo(); 
					break;
				case 2:
					estacionamento.saidaVeiculo();
					break;
				case 3: 
					estacionamento.alterarDados();
					break;
				case 4: 
					estacionamento.excluirVeiculo();
					break;
				case 5:
					estacionamento.consultarDados();
					break;
				case 6:
					//estacionamento.exibirFaturamento();
					break;
			}
    	} while ( op != 0 );
    	leia.close();
	}

}
