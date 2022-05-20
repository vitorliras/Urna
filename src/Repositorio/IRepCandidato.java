	package Repositorio;

	import Model.Candidato;

	public interface IRepCandidato {
		
		public void Add(Candidato C);	
		public String mostrarCandidato(int numero);
		public int numeroEscolhido(int numero);
		
	}


