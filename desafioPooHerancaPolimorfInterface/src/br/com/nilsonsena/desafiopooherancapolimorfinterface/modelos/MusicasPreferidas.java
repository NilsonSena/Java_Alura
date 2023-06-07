package br.com.nilsonsena.desafiopooherancapolimorfinterface.modelos;

public class MusicasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() > 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos!");
        }else {
            System.out.println(audio.getTitulo() + " está em alta no momento!");
        }
    }
}
