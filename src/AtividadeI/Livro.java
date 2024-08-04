package AtividadeI;

class Livro extends Publicacao {
    //Atributos
    private String edicao;
    private String isbn;

    //Construtor
    public Livro(String titulo, String autor, int anoPublicacao, String genero, String editora, int quantidadeDisponivel, String edicao, String isbn) {
        super(titulo, autor, anoPublicacao, genero, editora, quantidadeDisponivel);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    // Implementação do método abstrato
    @Override
    public void imprimirDados() {
        System.out.println("Livro: " + getTitulo() +
                ", Autor: " + getAutor() +
                ", Ano: " + getAnoPublicacao() +
                ", Gênero: " + getGenero() +
                ", Editora: " + getEditora() +
                ", Disponível: " + getQuantidadeDisponivel() +
                ", Edição: " + edicao +
                ", ISBN: " + isbn);
    }

    //Get e Set
    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
