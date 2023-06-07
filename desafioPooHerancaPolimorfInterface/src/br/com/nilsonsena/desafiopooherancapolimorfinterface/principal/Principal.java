package br.com.nilsonsena.desafiopooherancapolimorfinterface.principal;

import br.com.nilsonsena.desafiopooherancapolimorfinterface.modelos.Audio;
import br.com.nilsonsena.desafiopooherancapolimorfinterface.modelos.Musicas;
import br.com.nilsonsena.desafiopooherancapolimorfinterface.modelos.MusicasPreferidas;
import br.com.nilsonsena.desafiopooherancapolimorfinterface.modelos.Podcasts;

public class Principal {
    public static void main(String[] args) {

        Musicas bethoven = new Musicas();

        bethoven.setTitulo("Sonata");
        bethoven.setCantor("Bethoven");
        bethoven.setGenero("Clássica");
        bethoven.setAlbum("As melhores de Bethoven");

        System.out.println(bethoven.getTitulo());
        System.out.println(bethoven.getCantor());
        System.out.println(bethoven.getAlbum());
        System.out.println(bethoven.getGenero());

        System.out.println(bethoven.getClassificacao());

        for (int i = 0; i < 2000; i++) {
            bethoven.curte();
            bethoven.reproduz();
        }

        Podcasts flow = new Podcasts();

        flow.setTitulo("Resenha com os inscritos");
        flow.setApresentador("Igor3k");
        flow.setDescricao("Podcast massa com convidados interessantes");

        System.out.println(flow.getApresentador());
        System.out.println(flow.getDescricao());
        System.out.println(flow.getTitulo());

        System.out.println(flow.getClassificacao());

        for (int i = 0; i < 500; i++) {
            flow.reproduz();
            flow.curte();
        }

        MusicasPreferidas musicasPreferidas = new MusicasPreferidas();

        musicasPreferidas.inclui(flow);
        musicasPreferidas.inclui(bethoven);

        //System.out.println("Mais uma reprodução: " + bethoven.reproduz());

    }
}