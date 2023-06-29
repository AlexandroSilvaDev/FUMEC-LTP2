import java.io.*;
import java.util.*;

public class Estacionamento {

	char 	ativo;
	String	codigoEstacionamento;
	String 	placa;
	String 	dataOperacao;
	char 	tipoOperacao;
	String	modeloCor;
	String	codigoMarca;
	String	categoriaMarca;
	String	horaEntrada;
	String 	horaSaida;
	float 	valorPago;
	
	
	public long pesquisarRegistro(String codigoEstacionamentoPesquisa) {	
		// metodo para localizar um registro no arquivo em disco
		
		long posicaoCursorArquivo = 0;
		try { 
			RandomAccessFile arqEst = new RandomAccessFile("EST.DAT", "rw");
			while (true) {
				posicaoCursorArquivo  	= arqEst.getFilePointer();	// posicao do inicio do registro no arquivo
				ativo		 			= arqEst.readChar();
				codigoEstacionamento    = arqEst.readUTF();
				placa   				= arqEst.readUTF();
				dataOperacao     		= arqEst.readUTF();
				tipoOperacao 			= arqEst.readChar();
				modeloCor        		= arqEst.readUTF();
				codigoMarca   			= arqEst.readUTF();
				categoriaMarca   		= arqEst.readUTF();
				horaEntrada   			= arqEst.readUTF();
				horaSaida   			= arqEst.readUTF();
				valorPago   			= arqEst.readFloat();

				if ( codigoEstacionamentoPesquisa.equals(codigoEstacionamento) && ativo == 'S') {
					arqEst.close();
					return posicaoCursorArquivo;
				}
			}
		}catch (EOFException e) {
			return -1; // registro nao foi encontrado
		}catch (IOException e) { 
			System.out.println("Erro na abertura do arquivo  -  programa sera finalizado");
			System.exit(0);
			return -1;
		}
	}

	public void salvarRegistro() {	
		// metodo para incluir um novo registro no final do arquivo em disco
		
		try {
			RandomAccessFile arqEst = new RandomAccessFile("EST.DAT", "rw");	
			arqEst.seek(arqEst.length());  // posiciona o ponteiro no final do arquivo (EOF)
			arqEst.writeChar(ativo);
			arqEst.writeUTF(codigoEstacionamento);
			arqEst.writeUTF(placa);
			arqEst.writeUTF(dataOperacao);
			arqEst.writeChar(tipoOperacao);
			arqEst.writeUTF(modeloCor);
			arqEst.writeUTF(codigoMarca);
			arqEst.writeUTF(categoriaMarca);
			arqEst.writeUTF(horaEntrada);
			arqEst.writeUTF(horaSaida);
			arqEst.writeFloat(valorPago);
			arqEst.close();
			System.out.println("Dados gravados com sucesso !\n");
		}catch (IOException e) { 
			System.out.println("Erro na abertura do arquivo  -  programa sera finalizado");
			System.exit(0);
		}
	}

	public void desativarRegistro(long posicao)	{    
		// metodo para alterar o valor do campo ATIVO para N, tornando assim o registro excluido
		
		try {
			RandomAccessFile arqEst = new RandomAccessFile("EST.DAT", "rw");			
			arqEst.seek(posicao);
			arqEst.writeChar('N');   // desativar o registro antigo
			arqEst.close();
		}catch (IOException e) { 
			System.out.println("Erro na abertura do arquivo  -  programa sera finalizado");
			System.exit(0);
		}
	}

	// ***********************  INCLUSAO VEÍCULO  *****************************
	
	public void incluirVeiculo() {
		
		String codigoEstacionamentoChave = "000000";
		char confirmacao;
		long posicaoRegistro;
		int gerarProximaChave;
		String MaiorCodigoEstacionamento = "000000";
		boolean horaValida;
		boolean dataValida;
		int marcaValida;
		boolean categoriaValida;
		boolean placaValida;

		System.out.println("\n ***************  INCLUSAO DE REGISTROS  ***************** \n");
		System.out.print("Código para estacionamento: ");
		
		try { 
			RandomAccessFile arqEst = new RandomAccessFile("EST.DAT", "rw");
			
			while (true) {
				ativo		 			= arqEst.readChar();
				codigoEstacionamento    = arqEst.readUTF();
				placa   				= arqEst.readUTF();
				dataOperacao     		= arqEst.readUTF();
				tipoOperacao 			= arqEst.readChar();
				modeloCor        		= arqEst.readUTF();
				codigoMarca   			= arqEst.readUTF();
				categoriaMarca   		= arqEst.readUTF();
				horaEntrada   			= arqEst.readUTF();
				horaSaida   			= arqEst.readUTF();
				valorPago   			= arqEst.readFloat();

				if ( Integer.parseInt(codigoEstacionamento) > Integer.parseInt(MaiorCodigoEstacionamento) && ativo == 'S') 
				{
					MaiorCodigoEstacionamento = codigoEstacionamento;
					arqEst.close();
				}
			}
		}catch (EOFException e) 
		{
			gerarProximaChave = Integer.parseInt(codigoEstacionamentoChave) + 1;
			codigoEstacionamentoChave = String.valueOf(gerarProximaChave);
			
			while ( codigoEstacionamentoChave.length() < 6 )
			{
				codigoEstacionamentoChave = "0" + codigoEstacionamentoChave;
			}
			System.out.println(codigoEstacionamentoChave);
		}
			catch (IOException e) 
			{ 
				System.out.println("Erro na abertura do arquivo  -  programa sera finalizado");
				System.exit(0);
			}

		ativo = 'S';
		codigoEstacionamento = codigoEstacionamentoChave;
		horaSaida = "";
		valorPago = 0;
		tipoOperacao = 'E';
		
		Main.leia.nextLine();
		do {
			System.out.print("Digite o código da marca do veículo ......................: ");
			codigoMarca = Main.leia.next();
			
			marcaValida = pesquisarMarcaVeiculo(codigoMarca);
			
			if ( marcaValida == -1 )
			{
				System.out.println("A marca não existe, tente novamente!\n");
			}
		} while ( marcaValida == -1 );
		
		do {
			System.out.println("Digite a categoria do veículo ..........................: ");
			categoriaMarca = Main.leia.nextLine();
			
			categoriaValida = consistirCategoria(categoriaMarca);
			
			if ( ! categoriaValida )
			{
				System.out.println("ERRO! Categoria não é valida, tente novamente!\n");
			}
		} while ( ! categoriaValida );
		
		do {
			System.out.print("Digite a placa do veículo (XXX9999) ..........................: ");
			placa = Main.leia.nextLine();
			
			placaValida = validarPlaca(placa);
			
			if ( ! placaValida )
			{
				System.out.println("");
			}
		} while (  );
		
		
		do {
			System.out.println("Digite o modelo e a cor do veículo .....................: ");
			modeloCor = Main.leia.nextLine();
			
			if ( modeloCor.length() < 10 )
			{
				System.out.println("Devem existir pelo menos 10 caracteres!\n");
			}
		} while ( modeloCor.length() < 10 );
		
		do {
			System.out.print("Digite a data de hoje (DD/MM/AAAA)........................: ");
			dataOperacao= Main.leia.nextLine();
			
			dataValida = validarDataOperacao(dataOperacao);
			
			if ( ! dataValida ) 
			{
				System.out.println("Digite a data no formato DD/MM/AAAA!\n");
			}
		} while ( ! dataValida );
		
		do {
			System.out.print("Digite a hora da entrada (HH:MM)..........................: ");
			horaEntrada = Main.leia.next();
			
			horaValida = validarHorarios(horaEntrada);
			
			if ( ! horaValida ) 
			{
				System.out.println("Digite a hora no formato HH:MM!\n");
			}
		} while ( ! horaValida );	  

		do {
			System.out.print("\nConfirma a gravacao dos dados (S/N) ? ");
			confirmacao = Main.leia.next().charAt(0);
			if (confirmacao == 'S') {
				salvarRegistro();
			}
		}while (confirmacao != 'S' && confirmacao != 'N');		    
	}
	
	public static boolean validarPlaca( String placa ) {
		
		String letraPlaca, numeroPlaca;
		boolean letraValida , numeroValido, placaValida;
		
		for ( int i = 0 ; i < 3 ; i++ ) 
		{
			letraPlaca = placa.substring( i , i + 1 );
			
			letraValida = true;
			
			if ( letraPlaca.compareToIgnoreCase("A") < 0 || letraPlaca.compareToIgnoreCase("Z") > 0 ) 
			{
				System.out.println("Os 3 primeiros dígitos devem ser letras!");
				letraValida = false;
				return letraValida;
			}
		}
		for ( int i = 3 ; i < 7 ; i++ ) 
		{
			numeroPlaca = placa.substring( i , i + 1 );
			
			numeroValido = true;
			
			if ( numeroPlaca.compareToIgnoreCase("0") < 0 || numeroPlaca.compareToIgnoreCase("9") > 0 )
			{
				System.out.println("Os 4 últimos dígitos devem ser números!");
				numeroValido = false;
				return numeroValido;
			}
		}
		
		placaValida = true;
		numeroValido = true;
		letraValida = true;
		
		if ( ! letraValida || ! numeroValido )
		{
			placaValida = false;
		}
		
		return placaValida;
	}
	
	public static int pesquisarMarcaVeiculo (String codigoMarca) {
		
		int x;
		
		for ( x = 0 ; x < 10 ; x++ ) 
		{
			if (codigoMarca.equals(Main.codigoMarca[x])) 
			{
				return x;
			}
		}
		return -1;
	}
	
	public static boolean consistirCategoria (String categoriaMarca) {
			
			boolean valido;
			valido = false;
			
			if (categoriaMarca.equals("GI")) 
			{			
				System.out.println("Grande e Importado");
				valido = true;
			}
			else if (categoriaMarca.equals("PI")) 
			{
				System.out.println("Pequeno e Importado");
				valido = true;
			}
			else if (categoriaMarca.equals("GN")) 
			{
				System.out.println("Grande e Nacional");
				valido = true;
			}
			else if (categoriaMarca.equals("PN")) 
			{
				System.out.println("Pequeno e Nacional");
				valido = true;
			}
			return valido;
		}
	
	public static boolean validarDataOperacao ( String dataOperacao ) {
			
			boolean dataValida;
			int dia, mes, ano;
			
			dataValida = true;
			dia = Integer.parseInt(dataOperacao.substring( 0 , 2 ));
			mes = Integer.parseInt(dataOperacao.substring( 3 , 5 ));
			ano = Integer.parseInt(dataOperacao.substring( 6 ));
			
			if ( dataOperacao.length() != 10 )
			{
				dataValida = false;
				return dataValida;
			} 
			else if ( dataOperacao.substring( 2 , 3 ).compareTo("/") != 0 || dataOperacao.substring( 5 , 6 ).compareTo("/") != 0 )
			{
				dataValida = false;
				return dataValida;
			}
			else if ( mes >= 1 && mes <= 12 && ano <= 2022 )
			{
				if ( mes == 2 )
				{
					if ( ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0 )
					{
						if ( dia < 1 || dia > 29 )
						{
							dataValida = false;
							return dataValida;
						}
					}
					else
					{
						if ( dia < 1 || dia > 28 )
						{
							dataValida = false;
							return dataValida;
						}
					}
				}
				if ( mes == 4 || mes == 6 || mes == 9 || mes == 11 )
				{
					if ( dia < 1 || dia > 30 )
					{
						dataValida = false;
						return dataValida;
					}
				}
				else
				{
					if ( dia < 1 || dia > 31 )
					{
						dataValida = false;
						return dataValida;
					}
				}
			}
			return dataValida;
	}
	
	public static boolean validarHorarios ( String parametroHora ) {
		
		int hora, minuto;
		boolean horarioValido;
		
		horarioValido = false;
		try {
			hora = Integer.parseInt( parametroHora.substring( 0 , 2 ));
			minuto = Integer.parseInt( parametroHora.substring( 3 ));
			
			if (( hora >= 0 && hora <= 23 ) && ( minuto >= 0  && minuto <= 59 )) 
			{
				horarioValido = true;
			} 
			else {
				System.out.println("Hora digitada inválida!\n");
			}
		} catch ( NumberFormatException E ) 
		{
			System.out.println("\nO texto digitado não pode ser convertido em número!");
		}
		return horarioValido;
	}
	
	//************************  SAÍDA VEÍCULO  *****************************
	
	public void saidaVeiculo() {
		String codigoEST;
		char confirmacao;
		long posicaoRegistro = 0;
		int horaE, horaS;
		int minutoE, minutoS;
		
		do {
			System.out.println("\n ***************  SAÍDA DE VEÍCULOS  ***************** \n");
			System.out.println("Digite o código do veículo estacionado que está saindo: ");
			codigoEST = Main.leia.next();
			
			try { 
				RandomAccessFile arqEst = new RandomAccessFile("EST.DAT", "rw");
				
				while (true) 
				{
					// guarda a posição inicial do registro a ser alterado
					posicaoRegistro         = arqEst.getFilePointer();
					ativo		 			= arqEst.readChar();
					codigoEstacionamento    = arqEst.readUTF();
					placa   				= arqEst.readUTF();
					dataOperacao     		= arqEst.readUTF();
					tipoOperacao 			= arqEst.readChar();
					modeloCor        		= arqEst.readUTF();
					codigoMarca   			= arqEst.readUTF();
					categoriaMarca   		= arqEst.readUTF();
					horaEntrada   			= arqEst.readUTF();
					horaSaida   			= arqEst.readUTF();
					valorPago   			= arqEst.readFloat();

					if ( codigoEstacionamento.equals(codigoEST) && ativo == 'S' ) 
					{
						System.out.println("Digite a hora de saída do veículo (HH:MM): ");
						horaSaida = Main.leia.next();
						tipoOperacao = 'S';
						arqEst.close();
					}
				}
			}catch (EOFException e) 
			{
				System.out.println("Código digitado não registrado ainda!\n");
			}
			catch (IOException e) 
			{ 
				System.out.println("Erro na abertura do arquivo  -  programa sera finalizado");
				System.exit(0);
			}
			
			horaE = Integer.parseInt( horaEntrada.substring( 0 , 2 ));
			horaS = Integer.parseInt( horaSaida.substring( 0 , 2 ));
			minutoE = Integer.parseInt( horaEntrada.substring( 3 ));
			minutoS = Integer.parseInt( horaSaida.substring( 3 ));
			
			if ( horaS < horaE || ( horaS == horaE && minutoS <= minutoE ) )
			{
				System.out.println("A hora de saída deve ser maior que a hora de entrada!\n");
			}
		} while ( horaS < horaE || ( horaS == horaE && minutoS <= minutoE ) );
		
		valorPago = calcularValorA_Pagar(horaEntrada, horaSaida, categoriaMarca);
		
		do {
			System.out.print("\nConfirma a gravacao dos dados (S/N) ? ");
			confirmacao = Main.leia.next().charAt(0);
			if (confirmacao == 'S') 
			{
				desativarRegistro(posicaoRegistro);
				salvarRegistro();
			}
		}while (confirmacao != 'S' && confirmacao != 'N');
	}
	
	public static float calcularValorA_Pagar( String horaEntrada , String horaSaida , String categoriaVeiculo ) {
		int horaE, horaS;
		int minutoE, minutoS;
		float valorHora;
		float valorPago;
		
		horaE = Integer.parseInt( horaEntrada.substring( 0 , 2 ));
		horaS = Integer.parseInt( horaSaida.substring( 0 , 2 ));
		minutoE = Integer.parseInt( horaEntrada.substring( 3 ));
		minutoS = Integer.parseInt( horaSaida.substring( 3 ));
		
		if ( horaE <= 18 && minutoE <= 00 || horaE <= 17 && minutoE <= 59 )
		{
			if ( categoriaVeiculo.equals("GI") )
			{
				valorHora = 10;
			}
			else if ( categoriaVeiculo.equals("PI") )
			{
				valorHora = (float) 8.2;
			}
			else if ( categoriaVeiculo.equals("GN") )
			{
				valorHora = 9;
			}
			else {
				valorHora = 7;
			}
		}
		else {
			if ( categoriaVeiculo.equals("GI") )
			{
				valorHora = 8;
			}
			else if ( categoriaVeiculo.equals("PI") )
			{
				valorHora = (float) 6.5;
			}
			else if ( categoriaVeiculo.equals("GN") )
			{
				valorHora = (float) 7.5;
			}
			else {
				valorHora = 6;
			}
		}
		valorPago = ( horaS - horaE + ( minutoS - minutoE ) / 60 ) * valorHora;
		
		return valorPago;
	}
	//************************  ALTERAÇÃO  *****************************

	public void alterarDados() {
			
		String codigoEst;
		char confirmacao;
		long posicaoRegistro = 0;
		byte opcao;

		do {
			do {
				Main.leia.nextLine();
				System.out.println("\n ***************  ALTERACAO DE DADOS  ***************** ");
				System.out.print("Digite Código do Estacionamento do Carro que deseja alterar( FIM para encerrar ): ");
				codigoEst = Main.leia.nextLine();
				
				if (codigoEst.equals("FIM")) 
				{
					break;
				}

				posicaoRegistro = pesquisarRegistro(codigoEstacionamentoPesquisa);
				
				if (posicaoRegistro == -1) 
				{
					System.out.println("Código de Estacionamento não cadastrado no arquivo, digite outro valor\n");
				}
			}while (posicaoRegistro == -1);

			if (codigoEst.equals("FIM")) 
			{
				break;
			}

			ativo = 'S';

			do {
				System.out.println("[ 1 ] Placa......................: " + placa);
				System.out.println("[ 2 ] Modelo e Cor...............: " + modeloCor);
				System.out.println("[ 3 ] Marca......................: " + codigoMarca);
				System.out.println("[ 4 ] Categoria..................: " + categoriaMarca);
				System.out.println("[ 5 ] Data de Entrada............: " + dataOperacao);
				System.out.println("[ 6 ] Hora da Entrada............: " + horaEntrada);
				System.out.println("[ 7 ] Hora da Saída .............: " + horaSaida);
				System.out.println("[ 8 ] Valor Pago.................: " + valorPago);

				do{
					System.out.println("Digite o numero do campo que deseja alterar (0 para finalizar as alterações): ");
					opcao = Main.leia.nextByte();
					
				}while (opcao < 0 || opcao > 8);

				switch (opcao) {
				
				case 1:
					Main.leia.nextLine();
					System.out.print  ("Digite a NOVA placa (XXX9999)..........: ");
					placa = Main.leia.nextLine();
					break;
					
				case 2: 
					Main.leia.nextLine();
					System.out.print  ("Digite o NOVO modelo e cor.............: ");
					modeloCor = Main.leia.nextLine();
					break;
					
				case 3:
					System.out.print  ("Digite a NOVA marca....................: ");
					codigoMarca = Main.leia.next();
					break;
					
				case 4: 
					System.out.print  ("Digite a NOVA categoria................: ");
					categoriaMarca = Main.leia.next();
					break;
					
				case 5: 
					System.out.print  ("Digite a NOVA data de Entrada..........: ");
					dataOperacao = Main.leia.next();
					break;
					
				case 6: 
					System.out.print  ("Digite a NOVA hora da entrada..........: ");
					horaEntrada = Main.leia.next();
					break;
					
				case 7: 
					System.out.print  ("Digite a NOVA hora da saída............: ");
					horaSaida = Main.leia.next();
					break;
					
				case 8: 
					System.out.print  ("Digite o NOVO valor pago...............: ");
					valorPago = Main.leia.nextFloat();
					break;
				}
				System.out.println();
			}while (opcao != 0);  		

			do {
				System.out.print("\nConfirma a alteracao dos dados (S/N) ? ");
				confirmacao = Main.leia.next().charAt(0);
				if (confirmacao == 'S') {
					desativarRegistro(posicaoRegistro);
					salvarRegistro();
					System.out.println("Dados gravados com sucesso !\n");
				}
			}while (confirmacao != 'S' && confirmacao != 'N');

		}while ( ! codigoEst.equals("FIM"));
	}

	//************************  EXCLUSAO  *****************************
	
	public void excluirVeiculo() {
		
		String estacionamentoChave;
		char confirmacao;
		long posicaoRegistro = 0;

		do {
			do {
				Main.leia.nextLine();
				System.out.println(" ***************  EXCLUSAO DE VEICULOS  ***************** ");
				System.out.print("Digite o codigo do estacionamento que deseja excluir ( FIM para encerrar ): ");
				estacionamentoChave = Main.leia.nextLine();
				
				if (estacionamentoChave.equals("FIM")) 
				{
					break;
				}

				posicaoRegistro = pesquisarMarcaVeiculo(estacionamentoChave);
				
				if (posicaoRegistro == -1) 
				{
					System.out.println("Codigo do estacionamento nao cadastrado no arquivo, digite outro valor\n");
				}
			}while (posicaoRegistro == -1);

			if (estacionamentoChave.equals("FIM")) 
			{
				System.out.println("\n ************  PROGRAMA ENCERRADO  ************** \n");
				break;
			}

			System.out.println("Placa do veiculo.......: " + placa);
			System.out.println("Modelo e cor...........: " + modeloCor);
			System.out.println("Marca do veiculo.......: " + Main.descricaoMarca);
			System.out.println("Categoria do veiculo...: " + Main.categoria);
			System.out.println("Data...................: " + dataOperacao);
			System.out.println("Horario de entrada.....: " + horaEntrada);
			System.out.println("Horario de saida.......: " + horaSaida);
			System.out.println("Valor pago.............: " + valorPago);

			do {
				System.out.print("\nConfirma a exclusao deste aluno (S/N) ? ");
				confirmacao = Main.leia.next().charAt(0);
				if (confirmacao == 'S') {
					desativarRegistro(posicaoRegistro);
				}	
			}while (confirmacao != 'S' && confirmacao != 'N');

		} while ( ! estacionamentoChave.equals("FIM"));
	}

	//************************  CONSULTA  *****************************
	
	public void consultarDados() {
		
		byte opcao;
		String matriculaChave;
		long posicaoRegistro;
		String dataOp = "";

		do {
			do {
				System.out.println("\n ***************  CONSULTA DE ALUNOS  ***************** \n");
				System.out.println(" [1] EXIBIR TODOS OS VEÍCULOS ");
				System.out.println(" [2] EXIBIR SOMENTE OS VEÍCULOS QUE NÃO SAÍRAM DO ESTACIONAMENTO ");
				System.out.println(" [3] EXIBIR OS REGISTROS DE UMA DATA ESPECÍFICA ");
				System.out.println(" [0] SAIR");
				System.out.print("\nDigite a opção desejada: ");
				opcao = Main.leia.nextByte();
				
				if (opcao < 0 || opcao > 3) 
				{
					System.out.println("opcao Invalida, digite novamente.\n");
				}
			}while (opcao < 0 || opcao > 3);

			switch (opcao) {
			
			case 0:
				System.out.println("\n ************  PROGRAMA ENCERRADO  ************** \n");
				break;

			case 1:  // Exibir todos os registros
				
				Main.leia.nextLine();  // limpa buffer de memoria
				
				try { 
					RandomAccessFile arqEst = new RandomAccessFile("EST.DAT", "rw");
					
					imprimirCabecalho();
					
					while (true) {
						ativo		 			= arqEst.readChar();
						codigoEstacionamento    = arqEst.readUTF();
						placa   				= arqEst.readUTF();
						dataOperacao     		= arqEst.readUTF();
						tipoOperacao 			= arqEst.readChar();
						modeloCor        		= arqEst.readUTF();
						codigoMarca   			= arqEst.readUTF();
						categoriaMarca   		= arqEst.readUTF();
						horaEntrada   			= arqEst.readUTF();
						horaSaida   			= arqEst.readUTF();
						valorPago   			= arqEst.readFloat();

						if ( ativo == 'S' ) 
						{
							imprimirRegistro();
						}
					}
					//arqEst.close();
				}catch (EOFException e) 
				{
					System.out.println("\nFim da consulta!");
				}
				catch (IOException e) 
				{ 
					System.out.println("Erro na abertura do arquivo  -  programa sera finalizado");
					System.exit(0);
				}
				break;

			case 2:  // Exibir somente os veículos que ainda não saíram do estacionamento
				
				try { 
					RandomAccessFile arqEst = new RandomAccessFile("EST.DAT", "rw");
					
					imprimirCabecalho();
					
					while (true) {
						ativo		 			= arqEst.readChar();
						codigoEstacionamento    = arqEst.readUTF();
						placa   				= arqEst.readUTF();
						dataOperacao     		= arqEst.readUTF();
						tipoOperacao 			= arqEst.readChar();
						modeloCor        		= arqEst.readUTF();
						codigoMarca   			= arqEst.readUTF();
						categoriaMarca   		= arqEst.readUTF();
						horaEntrada   			= arqEst.readUTF();
						horaSaida   			= arqEst.readUTF();
						valorPago   			= arqEst.readFloat();

						if ( tipoOperacao == 'E' && ativo == 'S' ) 
						{
							imprimirRegistro();
						}
					}
					//arqEst.close();
				}catch (EOFException e) 
				{
					System.out.println("\nFim da consulta!");
				}
				catch (IOException e) 
				{ 
					System.out.println("Erro na abertura do arquivo  -  programa sera finalizado");
					System.exit(0);
				}
				break;
				
			case 3:  // Exibir os registros cadastrados em uma data informada
		
					System.out.print("Digite a data desejada (DD/MM/AAAA): ");
					dataOp = Main.leia.next();
					
					try { 
						RandomAccessFile arqEst = new RandomAccessFile("EST.DAT", "rw");
						
						imprimirCabecalho();
						
						while (true) {
							ativo		 			= arqEst.readChar();
							codigoEstacionamento    = arqEst.readUTF();
							placa   				= arqEst.readUTF();
							dataOperacao     		= arqEst.readUTF();
							tipoOperacao 			= arqEst.readChar();
							modeloCor        		= arqEst.readUTF();
							codigoMarca   			= arqEst.readUTF();
							categoriaMarca   		= arqEst.readUTF();
							horaEntrada   			= arqEst.readUTF();
							horaSaida   			= arqEst.readUTF();
							valorPago   			= arqEst.readFloat();

							if ( dataOperacao.equals( dataOp ) && ativo == 'S' ) 
							{
								imprimirRegistro();
							}
						}
						//arqEst.close();
					}catch (EOFException e) 
					{
						System.out.println("\nFim da consulta!");
					}
					catch (IOException e) 
					{ 
						System.out.println("Erro na abertura do arquivo  -  programa sera finalizado");
						System.exit(0);
					}	
			}
		} while ( opcao != 0 );
	}
	
	public static void exibirFaturamento(  ) {
		
		
	}

	public void imprimirCabecalho () {
		System.out.println("-- PLACA --  -- OPERAÇÃO --  -- MODELO E COR --  -- MARCA --  -- CATEGORIA --"
				+ "  -- DATA --  -- HORA ENTRADA --  -- HORA SAÍDA --  -- VALOR PAGO --  ");
	}

	public void imprimirRegistro () {
		System.out.println(	
				"  " +
				formatarString( placa, 16 ) + "  " +
				formatarString( Character.toString(tipoOperacao), 8) + "  " + 
				formatarString( modeloCor , 21) + "  " + 
				formatarString( codigoMarca , 14 ) + "  " +
				formatarString( categoriaMarca , 8 ) + "  " +
				formatarString( dataOperacao, 16 ) + "  " +
				formatarString( horaEntrada, 14 ) + "  " +
				formatarString( horaSaida, 20 ) + "  " +
				formatarString( String.valueOf(valorPago), 12 )
				); 
	}

	public static String formatarString (String texto, int tamanho) {	
		// retorna uma string com o numero de caracteres passado como parametro em TAMANHO
		
		if (texto.length() > tamanho) {
			texto = texto.substring(0,tamanho);
		}else{
			while (texto.length() < tamanho) {
				texto = texto + " ";
			}
		}
		return texto;
	}
}
