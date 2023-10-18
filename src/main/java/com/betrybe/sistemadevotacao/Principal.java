package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Principal.
 */
public class Principal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();

    while (true) {
      System.out.println("Menu Principal:");
      System.out.println("1 - Cadastro de Pessoas Candidatas");
      System.out.println("2 - Cadastro de Pessoas Eleitoras");
      System.out.println("3 - Votação");
      System.out.println("4 - Resultado Final");
      System.out.println("5 - Sair");
      System.out.print("Escolha uma opção: ");

      int opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          cadastrarPessoaCandidata(scanner, gerenciamentoVotacao);
          break;
        case 2:
          cadastrarPessoaEleitora(scanner, gerenciamentoVotacao);
          break;
        case 3:
          votacao(scanner, gerenciamentoVotacao);
          break;
        case 4:
          gerenciamentoVotacao.mostrarResultado();
          break;
        case 5:
          System.out.println("Saindo do programa.");
          return;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    }
  }

  private static void cadastrarPessoaCandidata(Scanner scanner, GerenciamentoVotacao gerenciamentoVotacao) {
    while (true) {
      System.out.println("Cadastro de Pessoa Candidata:");
      System.out.print("Nome da Pessoa Candidata (ou '0' para voltar): ");
      String nome = scanner.next();
      if (nome.equals("0")) {
        return;
      }

      System.out.print("Número da Pessoa Candidata: ");
      int numero = scanner.nextInt();

      gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
    }
  }


  }

}
