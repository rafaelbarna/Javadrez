package tabuleiro;

public class Mesa {

	// Atributos
	private int linhas;
	private int colunas;
	private Peca[][] pecas;

	// Métodos
	public Mesa(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			System.out.println("Erro ao gerar Tabuleiro");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public Peca peca(int linha, int coluna) {
		if (!posicaoExiste(linha, coluna)) {
			throw new MesaException("Posição invalida");
		}
		return pecas[linha][coluna];
	}

	public Peca peca(Posicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new MesaException("Posição invalida");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}

	public void inserePeca(Peca peca, Posicao posicao) {
		if(posicaoExistePeca(posicao)) {
			throw new MesaException("Já existe uma Peça nesta posição" + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}

	public boolean posicaoExiste(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}

	public boolean posicaoExiste(Posicao posicao) {
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
	}

	public boolean posicaoExistePeca(Posicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new MesaException("Posição invalida");
		}
		return peca(posicao) != null;
	}

	// Getters
	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	// Setters
}
