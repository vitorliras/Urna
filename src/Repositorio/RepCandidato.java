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
		public String mostrarCandidatoPorNumero(int numero) {
			String msg="";
			if(numero != 0) {
				for(Candidato c : ListaCandidato) {
					if(c != null && c.getPartido().getNumero() == numero) {
					msg +="Nome: "+c.getNome()+
						  "\nPartido: "+c.getPartido().getNome()+
						  "\nNúmero do partido: "+c.getPartido().getNumero()+
						  "\n";	
					}			
				}
				if(msg == "") {
					msg = "Candidato inexistente";
				}
			}else {
				msg = "Branco";
			}
			return msg;
		}
		
		@Override
	    public void acrescentarVoto(int numero) {
			for(int i = 0; i < ListaCandidato.size(); i++) {
				if(ListaCandidato.get(i) != null && ListaCandidato.get(i).getPartido().getNumero() == numero) {
					
					ListaCandidato.get(i).setQuantidadeVotos(ListaCandidato.get(i).getQuantidadeVotos()+1);
				}
			}

	    }
}

	
