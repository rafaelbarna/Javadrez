package Aplicacao;

import xadrez.PartidaXadrez;

public class Programa {

	public static void main(String[] args) {
		
		PartidaXadrez partidaXadrez = new PartidaXadrez();
		UI.exibeMesa(partidaXadrez.getPecasXadrez());
	}
}
