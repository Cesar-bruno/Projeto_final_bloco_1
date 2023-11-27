package projeto_final;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import projeto_final.model.Categoria;
import projeto_final.util.Cores;

public class menu {
	static Scanner leia = new Scanner(System.in); 
	
	public static void main(String[] args) {
		int idade, opcao, categoria, cpf;
		String nome, nomeDaMae;
		
		
		
		
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
					keyPress();
					break;
					
				case 2 :	
					System.out.println("Listar todos os Jogadores\n\n");
					keyPress();
					break;
				case 3 :
					System.out.println("Buscar jogador por Categoria\n\n");
					keyPress();
					break;
				case 4:
					System.out.println("Alterar dados de um jogador\n\n");
					keyPress();
					break;
				case 5 :
					System.out.println("Excluir jogador\n\n");
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