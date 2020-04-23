package pcklinkedlist;

public final class Livro {
    private String titulo;
    private String autor;
    private int ano_lancamento;
    private String editora;
    
    public Livro(){}
    
    public Livro(String titulo, String autor, int ano_lancamento, String editora){
        this.titulo = titulo;
        this.autor = autor;
        this.ano_lancamento = ano_lancamento;
        this.editora = editora;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno_lancamento() {
        return this.ano_lancamento;
    }

    public void setAno_lancamento(int ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", ano_lancamento=" + ano_lancamento + ", editora=" + editora + '}';
    }
    
    
}
