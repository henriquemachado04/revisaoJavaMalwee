package br.com.senai.view;

import br.com.senai.controller.DadosController;

import java.util.Scanner;

public class ProgramaPrincipal {
    private static String anotherString;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DadosController dadosController = new DadosController();
        int opcao;
        String continuar = "s";

        do {
            System.out.println("Informe a opção desejada:");
            System.out.println("---------------------------------------");
            System.out.println("|-----  1) Cadastrar pessoa      ------|");
            System.out.println("|-----  2) Listar pessoas      --------|");
            System.out.println("|-----  3) Editar dados de pessoa  ----|");
            System.out.println("|-----  4) Excluir pessoa         -----|");
            System.out.println("|-----  9) Encerrar aplicação   -------|");
            System.out.println("----------------------------------------");
            System.out.print("--> ");

            opcao = in.nextInt();


            switch (opcao) {
                case 1:
                    dadosController.cadastrarPessoa();
                    break;
                case 2:
                    dadosController.listarPessoa();
                    break;
                case 3:
                    dadosController.editarPessoa();
                    break;
                case 4:
                    dadosController.deletarPessoa();
                    break;
                case 9:
                    System.out.println("Sistema finalizado.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
            System.out.print("Deseja realizar outra operação? [s/n]: ");
            continuar = in.next();
        }while (continuar.equalsIgnoreCase(  "s"));
    }
}
