package Classes;

public final class Filmes {
    private String titulo;
    private String diretor;
    private String genero;
    private String pais;
    private int ano;
    
    public Filmes(){}
    
    public Filmes(String titulo, String diretor,String genero, String pais, int ano){
        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
        this.pais = pais;
        this.ano = ano;
    }
    
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    @Override
    public String toString(){
        return "[ "+ "Titulo: " + this.getTitulo()
                +"\nDiretor: " + this.getDiretor() 
                +"\nGenero: " + this.getGenero() 
                +"\nPais: "+ this.getPais()
                +"\nAno: "+this.getAno() +" ] \n";
    }
}
