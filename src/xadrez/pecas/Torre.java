package xadrez.pecas;

import tabuleiro.Mesa;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez {

	public Torre(Mesa mesa, Cor cor) {
		super(mesa, cor);
		
	}

	@Override
	public String toString() {
		return "♖";
	}
	
}
