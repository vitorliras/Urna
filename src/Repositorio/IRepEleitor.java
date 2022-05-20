package Repositorio;

import Model.Eleitor;

public interface IRepEleitor {
	
	public void Add(Eleitor eleitor);	
	public String mostrarEleitor(String titulo);
	public int numeroEscolhido(String titulo);
	
}
