package br.com.poo.lista1;

import java.util.logging.Logger;

public class Quinto_Exercicio {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Quinto_Exercicio.class.getName());

        int expressao1;
        int expressao2;

        expressao1 = 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66;
        expressao2 = 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9;

        System.out.println("O resultado da expressão 1 é: " + expressao1);
        logger.info("O resultado da expressão 1 é: " + expressao1);
        System.out.println("O resultado da expressão 2 é: " + expressao2);
        logger.info("O resultado da expressão 2 é: " + expressao2);
    }
}