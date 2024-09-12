package br.com.poo.lista2;

import java.util.Scanner;
import java.util.logging.Logger;

public class Setimo_Exercicio {
    public static void main(String[] args) {
        int qtdEstudantes;
        double porcentagemEstudantes1 = 0.35;
        double porcentagemEstudantes2 = 0.30;
        double mediaEstudantes = (porcentagemEstudantes1 + porcentagemEstudantes2) / 2;

        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger(Setimo_Exercicio.class.getName());

        System.out.println("Digite a quantidade de estudantes: ");
        logger.info("Digite a quantidade de estudantes: ");
        qtdEstudantes = sc.nextInt();

        double qtdEstudantesMadrugada = qtdEstudantes * mediaEstudantes;
        System.out.println("Quantidade de estudantes que estudam de madrugada: " + qtdEstudantesMadrugada);
        logger.info("Quantidade de estudantes que estudam de madrugada: " + qtdEstudantesMadrugada);
        sc.close();
    }
}
