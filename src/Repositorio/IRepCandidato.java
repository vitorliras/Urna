	package Repositorio;

	import Model.Candidato;

	public interface IRepCandidato {
		
		public void Add(Candidato C);	
		public String mostrarCandidatoPorNumero(int numero);
		public String mostrarTodosCandidato();
		public void acrescentarVoto(int numero);
		
	}


