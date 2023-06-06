package br.com.nilsonsena.desafiopooherancapolimorfinterface.modelos;

public class Musicas extends Audio{

    private String album;
    private String cantor;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public double getClassificacao() {
        if (getTotalReproducao() >= 2000){
            setClassificacao(10);
        }else{
            setClassificacao(8);
        }
        return 0;
    }
}
