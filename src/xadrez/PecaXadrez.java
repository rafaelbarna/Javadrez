package xadrez;

import tabuleiro.Mesa;
import tabuleiro.Peca;

public class PecaXadrez extends Peca{

	private Cor cor;

	public PecaXadrez(Mesa mesa, Cor cor) {
		super(mesa);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
}
