package Models;

public final class EstadoModel {
    private String sigla;
    private String nome;
    
    public EstadoModel(){}

    public EstadoModel(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "EstadoModel{" + "sigla=" + sigla + ", nome=" + nome + '}';
    }
    
    
}
