package Model;

public class Eleitor extends Pessoa {
	private int titulo;
	private int votoEscolhido;
	
	

	public int getVotoEscolhido() {
		return votoEscolhido;
	}

	public void setVotoEscolhido(int votoEscolhido) {
		this.votoEscolhido = votoEscolhido;
	}

	public int getTitulo() {
		return titulo;
	}

	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}
	
}
