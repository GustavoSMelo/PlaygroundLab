package models;

public final class alunos {
    private String RGM;
    private String nome;
    private int idade;
    private String curso;
    
    public alunos(){}
    
    public alunos(String RGM, String nome, int idade, String curso){
        this.RGM = RGM;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
    
    public String getRGM(){
        return this.RGM;
    }
    
    public void setRGM(String RGM){
        this.RGM = RGM;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "alunos{" + "RGM=" + this.getRGM() + ", nome=" + this.getNome() + ", idade=" + this.getIdade() + ", curso=" + this.getCurso() + '}';
    }
    
    
}
