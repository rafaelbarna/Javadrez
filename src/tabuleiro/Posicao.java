package tabuleiro;

public class Posicao {

	// Atributos
	private int linha;
	private int coluna;
	
	// Métodos
	public Posicao(int linha, int coluna) {
		super();
		this.linha = linha;
		this.coluna = coluna;
	}

	// Getters and Setters
	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
}
