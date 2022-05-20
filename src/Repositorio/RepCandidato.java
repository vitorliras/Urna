package Repositorio;

	import java.util.ArrayList;
import java.util.List;

import Model.Candidato;
import Model.Partido;

	public class RepCandidato implements IRepCandidato {
		
		private List<Candidato> ListaCandidato = new ArrayList<>();
		private static RepCandidato instancia;
		
		public static RepCandidato getInstancia() {
	        if (instancia == null) {
	            instancia = new RepCandidato();
	        }
	        return instancia;
	    }
		
		@Override
		public void Add(Candidato C) {
			ListaCandidato.add(C);
	
		}

		@Override
		public String mostrarCandidato(int numero) {
			String msg="";
			Partido p = new Partido();
			
			for(Candidato c : ListaCandidato) {
				if(c != null && c.getPartido().getNumero() == numero) {
				msg +="Nome: "+c.getNome()+
					  "\nNome do Partido: "+c.getPartido().getNome()+
					  "\nNúmero do partido: "+c.getPartido().getNumero()+
					  "\n";	
				}			
			}
			if(msg == "") {
				msg = "Candidato inexistente";
			}
			return msg;
		}

		@Override
		public int numeroEscolhido(int numero) {
			// TODO Auto-generated method stub
			return 0;
		}	
}

	
