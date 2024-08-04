package AtividadeI;

class Filme extends Publicacao {
    //Atributos
    private String diretor;
    private String atorPrincipal;
    private String sinopse;
    private int tempoDuracao; // em minutos

    //Construtor
    public Filme(String titulo, String autor, int anoPublicacao, String genero, String editora, int quantidadeDisponivel, String diretor, String atorPrincipal, String sinopse, int tempoDuracao) {
        super(titulo, autor, anoPublicacao, genero, editora, quantidadeDisponivel);
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.sinopse = sinopse;
        this.tempoDuracao = tempoDuracao;
    }

    // Implementação do método abstrato
    @Override
    public void imprimirDados() {
        System.out.println("Filme: " + getTitulo() +
                ", Diretor: " + diretor +
                ", Autor: " + getAutor() +
                ", Ano: " + getAnoPublicacao() +
                ", Gênero: " + getGenero() +
                ", Editora/Produtora: " + getEditora() +
                ", Disponível: " + getQuantidadeDisponivel() +
                ", Ator Principal: " + atorPrincipal +
                ", Sinopse: " + sinopse +
                ", Duração: " + tempoDuracao + " minutos");
    }

    //Get e Set
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAtorPrincipal() {
        return atorPrincipal;
    }

    public void setAtorPrincipal(String atorPrincipal) {
        this.atorPrincipal = atorPrincipal;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }
}