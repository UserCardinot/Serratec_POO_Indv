package br.com.poo.lista2;

import java.util.Scanner;

public class Quinto_Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as horas: ");
        double horas = sc.nextDouble();
        double minutos = horas * 60;
        double segundos = minutos * 60;
        System.out.println(horas + " horas equivalem a " + minutos + " minutos e " + segundos + " segundos.");
        sc.close();
    }
}
