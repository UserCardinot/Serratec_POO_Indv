package br.com.poo.lista1;

import java.util.Scanner;

public class Segundo_Exercicio {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	        int idade1;
	        int idade2;
	        int idade3;
	        int idade4;
	        int idade5;
	        int idade6;
	
	        System.out.println("Digite a idade da primeira pessoa: ");
	        idade1 = sc.nextInt();
	        System.out.println("Digite a idade da segunda pessoa: ");
	        idade2 = sc.nextInt();
	        System.out.println("Digite a idade da terceira pessoa: ");
	        idade3 = sc.nextInt();
	        System.out.println("Digite a idade da quarta pessoa: ");
	        idade4 = sc.nextInt();
	        System.out.println("Digite a idade da quinta pessoa: ");
	        idade5 = sc.nextInt();
	        System.out.println("Digite a idade da sexta pessoa: ");
	        idade6 = sc.nextInt();
	
	        int soma = idade1 + idade2 + idade3 + idade4 + idade5 + idade6;
			
		System.out.println("A soma das idades é: " + soma);
		sc.close();
	}
}