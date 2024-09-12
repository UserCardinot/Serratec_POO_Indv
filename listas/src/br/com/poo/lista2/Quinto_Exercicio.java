package br.com.poo.lista2;

import java.util.Scanner;
import java.util.logging.Logger;

public class Quinto_Exercicio {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Quinto_Exercicio.class.getName());
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as horas: ");   
        logger.info("Digite as horas: ");
        double horas = sc.nextDouble();
        double minutos = horas * 60;
        double segundos = minutos * 60;
        System.out.println(horas + " horas equivalem a " + minutos + " minutos e " + segundos + " segundos.");
        logger.info(horas + " horas equivalem a " + minutos + " minutos e " + segundos + " segundos.");
        sc.close();
    }
}
