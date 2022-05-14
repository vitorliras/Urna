package Repositorio;

import Model.Eleitor;

public interface IRepEleitor {
	
	public void Add(Eleitor eleitor);	
	public String mostrarEleitor(int titulo);
	public int numeroEscolhido(int titulo);
	
}
