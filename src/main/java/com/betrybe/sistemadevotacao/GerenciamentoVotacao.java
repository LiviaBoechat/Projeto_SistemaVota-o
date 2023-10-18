package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * GerenciamentoVotacao.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaCandidata> pessoasCandidatas;
  private ArrayList<PessoaEleitora> pessoasEleitoras;
  private ArrayList<String> cpfsComputados;

  /**
   * construtor.
   */
  public GerenciamentoVotacao() {
    pessoasCandidatas = new ArrayList<>();
    pessoasEleitoras = new ArrayList<>();
    cpfsComputados = new ArrayList<>();
  }

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata candidata : pessoasCandidatas) {
      if ((candidata.getNumero()) == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }

    PessoaCandidata novaCandidata = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(novaCandidata);
  }

  /**
   * método1.
   */

  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora eleitora : pessoasEleitoras) {
      if (cpf.equals(eleitora.getCpf())) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }

    PessoaEleitora novaEleitora = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(novaEleitora);

  }

  /**
   * método2.
   */
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfsComputados.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
      return;
    }

    for (PessoaCandidata candidata : pessoasCandidatas) {
      if ((candidata.getNumero()) == numeroPessoaCandidata) {
        candidata.receberVoto();
        cpfsComputados.add(cpfPessoaEleitora);
        return;
      }
    }
  }

  /**
   * método3.
   */
  public void mostrarResultado() {
    if (cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
      return;
    }

    int totalVotos = cpfsComputados.size();

    for (PessoaCandidata candidata : pessoasCandidatas) {
      int votosRecebidos = candidata.getVotos();
      double percentualVotos = (votosRecebidos * 100.0) / totalVotos;

      System.out.printf("Nome: %s - %d votos ( %.2f%% )%n", candidata.getNome(),
          votosRecebidos, percentualVotos);
    }

    System.out.println("Total de votos: " + totalVotos);
  }
}