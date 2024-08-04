package AtividadeI;

public class ProgramaBiblioteca {
    public static void main(String[] args) {
        // I. Instancie um objeto Livro
        Livro livro = new Livro(
                "O Senhor dos Anéis: A Sociedade do Anel",
                "J.R.R. Tolkien",
                1954,
                "Fantasia",
                "Martins Fontes",
                5,
                "1ª",
                "123-4567890123"
        );

        // II. Instancie um objeto Filme e preencha seus atributos públicos
        Filme filme = new Filme(
                "O Senhor dos Anéis: A Sociedade do Anel",
                "J.R.R. Tolkien",
                2001,
                "Fantasia",
                "New Line Cinema",
                3,
                "Peter Jackson",
                "Elijah Wood",
                "Um hobbit é escolhido para uma jornada a Mordor.",
                178
        );

        // III. Crie um array de duas posições para objetos Publicacao
        Publicacao[] publicacoes = new Publicacao[2];
        publicacoes[0] = livro; // Adicionando o objeto Livro
        publicacoes[1] = filme; // Adicionando o objeto Filme

        // IV. Faça um loop para percorrer o array de objetos Publicacao executando o método imprimeDados();
        for (Publicacao publicacao : publicacoes) {
            publicacao.imprimirDados();
        }
    }
}