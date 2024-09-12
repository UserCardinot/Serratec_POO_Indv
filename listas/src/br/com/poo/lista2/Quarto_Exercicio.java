package br.com.poo.lista2;

import java.util.Scanner;
import java.util.logging.Logger;

public class Quarto_Exercicio {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Quarto_Exercicio.class.getName());
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro ângulo: ");
        logger.info("Digite o primeiro ângulo: ");
        int angulo1 = sc.nextInt();
        System.out.println("Digite o segundo ângulo: ");
        logger.info("Digite o segundo ângulo: ");
        int angulo2 = sc.nextInt();
        System.out.println("Digite o terceiro ângulo: ");
        logger.info("Digite o terceiro ângulo: ");
        int angulo3 = sc.nextInt();

        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            System.out.println("Triângulo Retângulo");
            logger.info("Triângulo Retângulo");
        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
            System.out.println("Triângulo Obtusângulo");
            logger.info("Triângulo Obtusângulo");
        } else {
            System.out.println("Triângulo Acutângulo");
            logger.info("Triângulo Acutângulo");
        }
        sc.close();
    }
}
