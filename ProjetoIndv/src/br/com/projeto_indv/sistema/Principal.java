package br.com.projeto_indv.sistema;

import br.com.projeto_indv.io.LeituraEscrita;
import br.com.projeto_indv.io.Relatorio;
import br.com.projeto_indv.utils.Util;
import java.util.Scanner;
import java.util.logging.Level;


public class Principal {
	public static void main(String[] args) {

		int opcao;
		char opcaoMenu;

		Scanner sc = new Scanner(System.in);

		LeituraEscrita.leitor("Banco");

		Util.setupLogger().log(Level.INFO, () -> "Bem-vindo(a), ");
		Util.setupLogger().log(Level.INFO,"Menu:\n[1]\tRelatorio Impresso\n[2]\tRelatorio na Tela\n[3]\tSair\n\nDigite a opcao: ");
		opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			opcaoMenu = 'i';
			Relatorio.relatorioMaterias(opcaoMenu);
			break;
		case 2:
			opcaoMenu = 't';
			Relatorio.relatorioMaterias(opcaoMenu);
			break;
		case 3:
			Util.setupLogger().log(Level.INFO, "Volte sempre!");
			break;
		default:
			Util.setupLogger().log(Level.INFO, "Opção invalida, tente novamente!");
			break;
		}
		sc.close();
	}
}
