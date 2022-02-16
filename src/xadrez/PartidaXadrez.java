package xadrez;

import tabuleiro.Mesa;
import tabuleiro.Posicao;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {

	private Mesa mesa;
	
	public PartidaXadrez() {
		mesa = new Mesa(8, 8);
		iniciaPartida();
	}
	
	public PecaXadrez[][] getPecasXadrez(){
		PecaXadrez[][] matriz = new PecaXadrez[mesa.getLinhas()][mesa.getColunas()];
		for(int i = 0; i < mesa.getLinhas(); i++) {
			for(int j = 0; j < mesa.getColunas(); j++) {
				matriz[i][j] = (PecaXadrez) mesa.peca(i, j);
			}
		}
		return matriz;
	}
	
	private void novaPeca(char coluna, int linha, PecaXadrez peca ) {
		mesa.inserePeca(peca, new XadrezPosicao(coluna, linha).paraPosicao());
	}
	
	private void iniciaPartida() {
		mesa.inserePeca(new Torre(mesa, Cor.BRANCO), new Posicao(2, 1));
		mesa.inserePeca(new Rei(mesa, Cor.PRETO), new Posicao(0, 4));
	}
}
