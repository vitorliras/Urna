package UI;

import java.util.Random;
import java.util.Scanner;

import Model.Candidato;
import Model.Eleitor;
import Model.Partido;
import Repositorio.RepCandidato;
import Repositorio.RepEleitor;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		criandoCandidatos();
		
		int opcao, aux=0;
		do {
			
			if(aux == 0) {
				CadastrarEleitor(0);
			}
			aux++;
			opcao = menu();
			

		} while (opcao != 0);
		resultado();		
	}

	private static void resultado() {		
		
	}

	private static void CadastrarEleitor(int n) {
		
		Eleitor e = new Eleitor();
		if(n == 1) {
			sc.nextLine();
		}
		
		System.out.println("Digite o nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite o titulo de elitor: ");
		String titulo = sc.nextLine();
		
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
		
		System.out.println("Selecione o número do candidato para consulta:");
		
		int opcaoCandidato = sc.nextInt();
		limparConsole();
		System.out.println(RepCandidato.getInstancia().mostrarCandidato(opcaoCandidato));
		
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
		int aux=0;
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			consultarCandidatos();
			break;
		case 2:
			votar();
			CadastrarEleitor(1);
			aux++;
			break;
		case 3:
			if(aux != 0)
				ApuracaoDeVotos();
			else
				System.out.println("Não houve votação");
			break;
		case 0:
			break;
		default:
			System.out.println("Digite uma opção válida.");
			break;
		}
		return opcao;
	}
	private static int aux(int n) {
		int aux = n;
		return aux;
	}
	private static void criandoCandidatos() {
		Candidato c = new Candidato();
		Partido P = new Partido();
		c.setNome("João Barbosa Filho");
		c.setIdade(48);
		P.setNome("MNJS");
		P.setNumero(1);
		c.setPartido(P);
		
		RepCandidato.getInstancia().Add(c);
		
		Candidato c1 = new Candidato();
		Partido P1 = new Partido();
		
		c1.setNome("Marco Silva Paiva");
		c1.setIdade(32);
		P1.setNome("ABCD");
		P1.setNumero(2);
		c1.setPartido(P1);	
		RepCandidato.getInstancia().Add(c1);
		
		
		Candidato c2 = new Candidato();
		Partido P2 = new Partido();
		c2.setNome("Melissa Alves França");
		c2.setIdade(25);
		P2.setNome("SGTY");
		P2.setNumero(3);
		c2.setPartido(P2);
		
		RepCandidato.getInstancia().Add(c2);
		
	}
	
	

}
