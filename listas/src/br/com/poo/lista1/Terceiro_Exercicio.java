package br.com.poo.lista1;

import java.util.Scanner;

public class Terceiro_Exercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float num1;
        float num2;        

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextFloat();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextFloat();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));
        sc.close();
    }

}
