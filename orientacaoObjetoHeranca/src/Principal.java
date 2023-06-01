import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        int valor = 555;

        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.avalia(8);
        meuFilme.avalia(2);
        meuFilme.avalia(9);

        meuFilme.exibeFichaTecnica();
        //System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println("Media das Avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.mediaAvaliacoes());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setDuracaoEmMinutos(60);
        lost.setEpisodiosPorTemporada(10);
        lost.setAtiva(false);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();

        System.out.println("Duração para maratonar serie " + lost.getDuracaoEmMinutos());
    }
}