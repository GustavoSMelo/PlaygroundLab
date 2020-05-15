package Models;

public final class AlunoModel {
    private String RGM;
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    
    public AlunoModel(){}

    public AlunoModel(String RGM, String nome, String endereco, String cidade, String estado) {
        this.RGM = RGM;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRGM() {
        return RGM;
    }

    public void setRGM(String RGM) {
        this.RGM = RGM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "AlunoModel{" + "RGM=" + RGM + ", nome=" + nome + ", endereco=" + endereco + ", cidade=" + cidade + ", estado=" + estado + '}';
    }
    
}
