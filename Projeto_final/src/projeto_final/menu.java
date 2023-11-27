package projeto_final;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

import projeto_final.controller.CategoriaController;
import projeto_final.model.Categoria;
import projeto_final.model.CategoriaMaior;
import projeto_final.model.categoriaMenor;
import projeto_final.util.Cores;

public class menu {
	static Scanner leia = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		CategoriaController jogador = new CategoriaController();
				
		int idade, opcao, categoria, cpf,  numero;
		String nome, nomeDaMae;
		
		
		
		categoriaMenor jogador1= new categoriaMenor (jogador.gerarNumero(),15,2,"bruno", "Marisa" );
		jogador.cadastrar(jogador1);
		
		
		while(true){
			System.out.println(Cores.texto_azul + Cores.ANSI_BLACK_BACKGROUND + "******************************************");
			System.out.println("                                          ");
			System.out.println("Seja Bem vindo a Industria do futsal      ");
			System.out.println("                                          ");
			System.out.println("Por favor Digite uma das seguintes opções ");
			System.out.println("                                          ");
			System.out.println("1 : Cadastrar Jogador                     ");
			System.out.println("2 : Listar todos os Jogadores             ");
			System.out.println("3 : Buscar jogador por número             ");
			System.out.println("4 : Alterar dados de um jogador           ");
			System.out.println("5 : Excluir Conta                         ");
			System.out.println("0 : sair                                  ");
			System.out.println("                                          ");
			System.out.println("******************************************");
			System.out.println(Cores.reset_texto);
			
			try {
				opcao =  leia.nextInt();
				
				}catch(InputMismatchException e ){
					System.out.println("Digite valores de inteiros !");
					leia.nextLine();
					opcao = 10;
				}	
				
				if(opcao == 0) {
					System.out.println(Cores.TEXT_WHITE_BOLD + "Industria do futsal : o melhor lugar pra se tornar jogador");
					sobre();
					System.exit(0);
					}
				
				switch(opcao) {
				
				case 1 :
					System.out.println("Cadastrar jogador\n\n");
					
					System.out.println("Digite o nome do jogador.");
					leia.skip("\\R");
					nome= leia.nextLine();
					
					System.out.println("Digite a idade do jogador");
					idade = leia.nextInt();
					
					System.out.println("Digite a categoria do Jogador. 1 para jogadores acima de 18 Anos, 2 para jogadores Menores de 18 anos.");
					categoria = leia.nextInt();
					
					switch(categoria) {
					case 1 -> {
						System.out.println("Qual o CPF do jogador.");
						cpf=leia.nextInt();
						jogador.cadastrar(new CategoriaMaior(jogador.gerarNumero() , idade, categoria, nome, cpf));
						}
					case 2 -> {
						System.out.println("Qual é o nome da mãe do Jogador.");
						leia.skip("\\R");
						nomeDaMae=leia.nextLine();
						jogador.cadastrar(new categoriaMenor(jogador.gerarNumero() , idade, categoria, nome, nomeDaMae));
						}
					}
					keyPress();
					break;
					
				case 2 :	
					System.out.println("Listar todos os Jogadores\n\n");
					jogador.listarTodas();
					keyPress();
					break;
					
				case 3 :
					System.out.println("Buscar jogador por número\n\n");
					
					System.out.println("Digite o número do Jogador");
					numero = leia.nextInt();
					
					jogador.procurarPorNumero(numero);
					keyPress();
					break;
					
				case 4:
					System.out.println("Alterar dados de um jogador\n\n");
					
					System.out.println("Digite o número do Jogador");
					numero = leia.nextInt();
					
					System.out.println("Digite a idade do Jogador");
					idade = leia.nextInt();
					
					System.out.println("Digite o nome do Jogador");
					leia.skip("\\R");
					nome = leia.nextLine();
					
					Optional< Categoria > categorias = jogador.buscarNaCollection(numero);
					if(categorias.isPresent()) {
												
						categoria = categorias.get().getSub();
						
						switch(categoria) {
						case 1 -> {
							System.out.println("Qual é o nome da mãe.");
							leia.skip("\\R");
							nomeDaMae=leia.nextLine();
							jogador.atualizar(new categoriaMenor(numero , idade, categoria, nome, nomeDaMae));
							}
						case 2 -> {
							System.out.println("Qual é o CPF do jogador");
							cpf=leia.nextInt();
							jogador.atualizar(new CategoriaMaior(jogador.gerarNumero() , idade, categoria, nome, cpf));
							}
						
						}
					}
					keyPress();
					break;
				case 5 :
					System.out.println("Excluir jogador\n\n");
					
					System.out.println("digite o número da conta : ");
					numero = leia.nextInt();
					
					jogador.deletar(numero);
					keyPress();
					break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "Escolha uma opção valida!!\n\n" + Cores.reset_texto);
				keyPress();
				break;
				}
				
		}
				
	}
		public static void sobre() {
			System.out.println("\n****************************");
			System.out.println("Projeto desenvolvido por : ");
			System.out.println("Bruno Cesar");
			System.out.println("github.com/Coxadmal");
			System.out.println("\n****************************");
		}
	
		public static void keyPress() {
			try {
				System.out.println("\n\npressione a tecla Enter para continuar ...");
				System.in.read();
				
			}catch(IOException e){
				
				System.out.println("você pressionou uma tecla invalida");
				
			}
		}
}