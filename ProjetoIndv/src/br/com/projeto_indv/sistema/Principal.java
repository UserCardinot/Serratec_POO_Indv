package br.com.projeto_indv.sistema;

import br.com.projeto_indv.io.LeituraEscrita;

public class Principal {
	public static void main(String[] args) throws Exception {

		LeituraEscrita.leitor("Banco");
		Menu menu = new Menu();
		menu.menu();	
	}
}