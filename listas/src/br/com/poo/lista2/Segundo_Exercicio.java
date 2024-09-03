package br.com.poo.lista2;

import java.util.Scanner;

public class Segundo_Exercicio {
    public static void main(String[] args) {
        int anoNascimento;
        int anoAtual = 2024;
        int idade;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        anoNascimento = sc.nextInt();

        idade = anoAtual - anoNascimento;

        System.out.println("Sua idade é: " + idade);
        sc.close();
    }
}
