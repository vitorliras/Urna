package UI;

import java.util.Random;
import java.util.Scanner;

import Model.Eleitor;
import Repositorio.RepEleitor;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcao, resp;
		do {
			System.out.println("Deseja votar: 1-Sim 0-Não");
		    resp = sc.nextInt();
			if(resp == 0) 
				opcao=0;
			else {			
				CadastrarEleitor();
				opcao = menu();
			}

		} while (opcao != 0);
		resultado();		
	}

	private static void resultado() {		
		
	}

	private static void CadastrarEleitor() {
		limparConsole();
		Eleitor e = new Eleitor();
		sc.nextLine();
		System.out.println("Digite o nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite o titulo de elitor: ");
		int titulo = sc.nextInt();
		
		Random r = new Random(); 
		int idade = r.nextInt(65);
		if(idade < 16) {
			idade = idade + 16;
		}
		e.setNome(nome);
		e.setTitulo(titulo);
		e.setIdade(idade);
		
		RepEleitor.getInstancia().Add(e);
		System.out.println(RepEleitor.getInstancia().mostrarEleitor(titulo));
		limparConsole();
	}

	private static void ApuracaoDeVotos() {
		// TODO Auto-generated method stub
		
	}

	private static void votar() {
		// TODO Auto-generated method stub
		
	}

	private static void consultarCandidatos() {
		
		
	}
	
	private static void limparConsole() {
		for(int i =0; i < 400; i++)
			System.out.println();
	}
	
	public static int menu() {
		System.out.println("================================");
		System.out.println("| Consultar candidato, digite 1|"); //ellen
		System.out.println("| Votar, digite 2              |");//alisson
		System.out.println("| Apuração de votos, digite 3  |");//lucas
		System.out.println("| Para sair, digite 0          |");
		System.out.println("================================");
		
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			consultarCandidatos();
			break;
		case 2:
			votar();
			break;
		case 3:
			ApuracaoDeVotos();
			break;
		case 0:
			break;
		default:
			System.out.println("Digite uma opção válida.");
			break;
		}
		limparConsole();
		return opcao;
	}
	
	

}
