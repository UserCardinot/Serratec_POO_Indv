package br.com.poo.lista1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Primeiro_Exercicio {
	
		public static void main(String[] args) {
			Logger logger = Logger.getLogger(Primeiro_Exercicio.class.getName());
		
			Scanner sc = new Scanner(System.in);
			
			String nome;
			String sobrenome;
			
			logger.info("Escreva seu nome: ");
			nome = sc.nextLine();

			logger.info("Escreva seu sobrenome: ");
			sobrenome = sc.nextLine();

			logger.info("Olá " + nome + " " + sobrenome + ". Seja bem-vindo ao mundo de POO");
			sc.close();
		}
}
