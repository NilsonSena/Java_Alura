package br.com.nilsonsena.desafiopooherancapolimorfinterface.modelos;

public class Podcasts extends Audio{

    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getClassificacao() {
        if (getTotalCurtidas() >= 500){
            setClassificacao(10);
        }else{
            setClassificacao(7);
        }
        return 0;
    }
}
