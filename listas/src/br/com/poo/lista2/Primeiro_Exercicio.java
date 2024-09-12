package br.com.poo.lista2;

import java.util.logging.Logger;

public class Primeiro_Exercicio {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Primeiro_Exercicio.class.getName());
        final int UNIVERSO = 42;
        System.out.println("O número do universo é: " + UNIVERSO);
        logger.info("O número do universo é: " + UNIVERSO);
    }
}