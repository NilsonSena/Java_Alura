package br.com.nilsonsena.desafiopooherancapolimorfinterface.modelos;

import br.com.nilsonsena.desafiopooherancapolimorfinterface.acoes.Reproduzir;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalReproducao;
    private int curtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public void setTotalReproducao(int totalReproducao) {
        this.totalReproducao = totalReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }


}
