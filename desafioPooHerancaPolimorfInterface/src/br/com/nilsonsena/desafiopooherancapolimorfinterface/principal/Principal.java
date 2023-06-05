package br.com.nilsonsena.desafiopooherancapolimorfinterface.principal;

import br.com.nilsonsena.desafiopooherancapolimorfinterface.modelos.Audio;
import br.com.nilsonsena.desafiopooherancapolimorfinterface.modelos.Musicas;
import br.com.nilsonsena.desafiopooherancapolimorfinterface.modelos.Podcasts;

public class Principal {
    public static void main(String[] args) {

        Musicas bethoven = new Musicas();

        bethoven.setTitulo("Sonata");
        bethoven.setCantor("Bethoven");

        System.out.println(bethoven.getTitulo());
        System.out.println(bethoven.getCantor());


        for (int i = 0; i < 2000; i++) {
            bethoven.curte();
            bethoven.reproduz();
        }

        Podcasts flow = new Podcasts();

        flow.setTitulo("Resenha com os inscritos");
        flow.setApresentador("Igor3k");
        flow.setDescricao("Podcast massa com convidados interessantes");

        for (int i = 0; i < 500; i++) {
            flow.reproduz();
            flow.curte();
        }


        //System.out.println("Mais uma reprodução: " + bethoven.reproduz());

    }
}