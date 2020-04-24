package pckescolanatacao;

public class Candidato {
    private String nomePessoa, sexoPessoa;
    private int idadePessoa;

    public Candidato(String nome, String sexo, int idade) {
        this.nomePessoa = nome;
        this.sexoPessoa = sexo;
        this.idadePessoa = idade;
    }

    @Override
    public String toString() {
        return "Pessoa {" + "nome=" + nomePessoa + ", sexo=" + sexoPessoa + ", idade=" + idadePessoa + "} ";
    }    
    
    public String getNome() {
        return nomePessoa;
    }

    public void setNome(String nome) {
        this.nomePessoa = nome;
    }

    public String getSexo() {
        return sexoPessoa;
    }

    public void setSexo(String sexo) {
        this.sexoPessoa = sexo;
    }

    public int getIdade() {
        return idadePessoa;
    }

    public void setIdade(int idade) {
        this.idadePessoa = idade;
    }

 }
