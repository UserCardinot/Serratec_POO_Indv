package br.com.poo.lista2;

import java.util.Scanner;
import java.util.logging.Logger;

public class Segundo_Exercicio {
    public static void main(String[] args) {
        int anoNascimento;
        int anoAtual = 2024;
        int idade;
        
        Logger logger = Logger.getLogger(Segundo_Exercicio.class.getName());
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        logger.info("Digite o ano de nascimento: ");
        anoNascimento = sc.nextInt();

        idade = anoAtual - anoNascimento;

        System.out.println("Sua idade é: " + idade);
        logger.info("Sua idade é: " + idade);
        sc.close();
    }
}
