import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        int valor = 555;

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.avalia(8);
        meuFilme.avalia(2);
        meuFilme.avalia(9);

        meuFilme.exibeFichaTecnica();
        //System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println("Media das Avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.mediaAvaliacoes());

        Serie lost = new Serie("Lost", 2000);
        lost.setTemporadas(10);
        lost.setDuracaoEmMinutos(60);
        lost.setEpisodiosPorTemporada(10);
        lost.setAtiva(false);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();

        System.out.println("Duração para maratonar serie " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);

        calculadora.inclui(lost);

        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalDeVisualizacoes(300);

        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme é " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());



    }
}