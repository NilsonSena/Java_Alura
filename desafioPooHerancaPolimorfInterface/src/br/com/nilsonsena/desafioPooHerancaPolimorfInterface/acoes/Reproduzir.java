package br.com.nilsonsena.desafiopooherancapolimorfinterface.acoes;

import br.com.nilsonsena.desafiopooherancapolimorfinterface.modelos.Audio;

public class Reproduzir extends Audio {
    private int vezesReproduzidas = 0;
    public int reproduz(Audio audio){
        if(vezesReproduzidas == 0) {
            vezesReproduzidas = audio.getTotalReproducao();
        }else {
            vezesReproduzidas++;
        }
        return vezesReproduzidas;
    }
}
