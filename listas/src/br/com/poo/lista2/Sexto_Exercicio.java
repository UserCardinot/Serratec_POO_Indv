package br.com.poo.lista2;

public class Sexto_Exercicio {
    public static void main(String[] args) {
        int soma = 0;
        int[] multiplos = new int[6];
        int[] intervalo = {101, 200};
        for (int i = 0; i < 6; i++) {
            multiplos[i] = intervalo[1] - i * 6;
            soma += multiplos[i];
        }
        System.out.println("Os múltiplos de 6 são: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(multiplos[i]);
        }
        System.out.println("A soma dos múltiplos de 6 é: " + soma);
    }
}
