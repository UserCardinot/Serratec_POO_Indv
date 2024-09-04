package br.com.poo.lista2;

import java.util.Scanner;

public class Quarto_Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro ângulo: ");
        int angulo1 = sc.nextInt();
        System.out.println("Digite o segundo ângulo: ");
        int angulo2 = sc.nextInt();
        System.out.println("Digite o terceiro ângulo: ");
        int angulo3 = sc.nextInt();

        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            System.out.println("Triângulo Retângulo");
        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
            System.out.println("Triângulo Obtusângulo");
        } else {
            System.out.println("Triângulo Acutângulo");
        }
        sc.close();
    }
}
