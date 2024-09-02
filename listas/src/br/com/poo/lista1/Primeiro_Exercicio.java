package br.com.poo.lista1;

import java.util.Scanner;

public class Primeiro_Exercicio {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String nome;
			String sobrenome;

			System.out.println("Digite seu nome: ");
			nome = sc.nextLine();
			System.out.println("Digite seu sobrenome: ");
			sobrenome = sc.nextLine();
			System.out.println("Seu nome é:  " + nome + " " + sobrenome);
			sc.close();
		}
}
