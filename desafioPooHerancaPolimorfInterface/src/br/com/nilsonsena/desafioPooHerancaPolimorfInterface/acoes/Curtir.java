package br.com.nilsonsena.desafiopooherancapolimorfinterface.acoes;

import br.com.nilsonsena.desafiopooherancapolimorfinterface.modelos.Audio;

public class Curtir extends Audio {
    private int curtidas = 0;
    public int curte(){
        curtidas =+ getCurtidas();
        return curtidas;
    }
}
