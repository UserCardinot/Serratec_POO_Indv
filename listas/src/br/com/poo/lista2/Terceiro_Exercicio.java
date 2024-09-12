package br.com.poo.lista2;

import java.util.Scanner;
import java.util.logging.Logger;

public class Terceiro_Exercicio{
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Terceiro_Exercicio.class.getName());
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        String[] produtos = {"Arroz", "Feijão", "Macarrão", "Carne", "Frango"};
        int[] estoque = {10, 0, 5, 0, 3};

        System.out.println("1 - Listar Produtos com estoque");
        logger.info("1 - Listar Produtos com estoque");
        System.out.println("2 - Listar Produtos sem estoque");
        logger.info("2 - Listar Produtos sem estoque");
        System.out.println("3 - Sair");
        logger.info("3 - Sair");
        System.out.print("Digite a opção desejada: ");
        logger.info("Digite a opção desejada: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\n\nProdutos com estoque:");
                logger.info("Produtos com estoque:");
                for (int i = 0; i < produtos.length; i++) {
                    if (estoque[i] > 0) {
                        System.out.println(produtos[i]);
                    }
                }
                break;
            case 2:
                System.out.println("\n\nProdutos sem estoque:");
                logger.info("Produtos sem estoque:");
                for (int i = 0; i < produtos.length; i++) {
                    if (estoque[i] == 0) {
                        System.out.println(produtos[i]);
                    }
                }
                break;
            case 3:
                System.out.print("\n\nDeseja realmente sair? (S/N) ");
                logger.info("Deseja realmente sair? (S/N) ");
                String resposta = sc.next();
                if (resposta.equalsIgnoreCase("S")) {
                    System.out.println("Saindo...");
                    logger.info("Saindo...");
                } else {
                        opcao = 0;
                }
                break;
            default:
                System.out.println("\n\nOpção inválida");
                logger.info("Opção inválida");
                break;
        }
        sc.close();
    }
}