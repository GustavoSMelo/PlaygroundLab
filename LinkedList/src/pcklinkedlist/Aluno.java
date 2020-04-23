package pcklinkedlist;

public class Aluno {
    private String rgm, nome; 
    private int idade;
    private char sexo;

    public Aluno(String rgm, String nome, int idade, char sexo) {
        this.rgm = rgm;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return rgm + ", " + nome + ", idade: " + idade + ", sexo: " + sexo; 
    }

    
    /**
     * @return the rgm
     */
    public String getRgm() {
        return rgm;
    }

    /**
     * @param rgm the rgm to set
     */
    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
}
