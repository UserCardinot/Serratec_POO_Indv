package br.com.poo.lista1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Quarto_Exercicio {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Quarto_Exercicio.class.getName());
        Scanner sc = new Scanner(System.in);

        float celsius;
        float fahrenheit;

        System.out.println("Digite a temperatura em graus Celsius: ");
        logger.info("Digite a temperatura em graus Celsius: ");
        celsius = sc.nextFloat();

        fahrenheit = ((celsius * 9/5) + 32);

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        logger.info("A temperatura em Fahrenheit é: " + fahrenheit);
        sc.close();
    }
}