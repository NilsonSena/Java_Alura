import br.com.nilsonsena.desafiopooherancapolimorfinterface.acoes.Reproduzir;
import br.com.nilsonsena.desafiopooherancapolimorfinterface.modelos.Audio;

public class Main {
    public static void main(String[] args) {

        Audio bethoven = new Audio();

        bethoven.setTitulo("Bethoven");
        bethoven.setDuracao(7);
        bethoven.setTotalReproducao(1000);
        bethoven.setCurtidas(800);
        bethoven.setClassificacao(10);

        System.out.println(bethoven.getTitulo());
        System.out.println(bethoven.getDuracao());
        System.out.println(bethoven.getTotalReproducao());
        System.out.println(bethoven.getCurtidas());
        System.out.println(bethoven.getClassificacao());


        Reproduzir reproduzir = new Reproduzir();

        reproduzir.reproduz(bethoven);

        System.out.println("Mais uma reprodução: " + reproduzir.reproduz(bethoven));

    }
}