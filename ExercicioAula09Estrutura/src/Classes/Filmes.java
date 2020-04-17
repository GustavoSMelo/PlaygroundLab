package Classes;

import javax.swing.JOptionPane;

public final class Filmes implements Interfaces.FilaInterface{
    private String titulo;
    private String diretor;
    private String genero;
    private String pais;
    private int ano;
    private Filmes[] vetor = new Filmes[5];
    
    public Filmes(){}
    
    public Filmes(String titulo, String diretor, String genero, String pais, int ano){
        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
        this.pais = pais;
        this.ano = ano;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getDiretor(){
        return this.diretor;
    }
    
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return this.pais;
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
    public boolean enqueue(Filmes f) {
        if(isFull()){
            JOptionPane.showMessageDialog(null, "Error, this array is full! ");
            return false;
        }else{
            for(int i = 0; i < this.vetor.length; i++){
                if(this.vetor[i] == null){
                    this.vetor[i] = f;
                    break;
                }
            }
            return true;
        }
    }

    @Override
    public void dequeue() {
        if(isEmpty()){
            JOptionPane.showMessageDialog(null, "Error, this array is empty! ");
        }
        else{
            vetor[0] = null;
            int pos = 0;
            for(int i = 0; i < vetor.length; i++){
                if(vetor[i] == null){
                    pos = i;
                }else{
                    vetor[pos] = vetor[i];
                    vetor[i] = null;
                    pos = i;
                }
            }
        }
    }

    @Override
    public boolean isEmpty() {
        int count = 0;
        for(int i = 0; i < this.vetor.length; i++){
            if(this.vetor[i] == null){
                count++;
            }
        }
        
        if(count == 5){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean isFull() {
        int count = 0;
        for(int i = 0; i < this.vetor.length; i++){
            if(this.vetor[i] != null){
                count++;
            }
        }
        
        if(count == 5){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void peek() {
        JOptionPane.showMessageDialog(null, "Peek: [\nTitulo: " + this.vetor[0].getTitulo() + "\n"
                + "Diretor: "+this.vetor[0].getDiretor()+"\n"
                + "Ano: "+this.vetor[0].getAno()+"\n"
                + "Genero: "+this.vetor[0].getGenero()+"\n"
                + "pais: "+this.vetor[0].getPais()+"\n]\n");
    }
    
    @Override
    public String toString(){
        String info = "";
        
        for(int i = 0; i < this.vetor.length; i++){
            if(this.vetor[i] != null){
                info += "[\nTitulo: " + this.vetor[i].getTitulo() + "\n"
                + "Diretor: "+this.vetor[i].getDiretor()+"\n"
                + "Ano: "+this.vetor[i].getAno()+"\n"
                + "Genero: "+this.vetor[i].getGenero()+"\n"
                + "pais: "+this.vetor[i].getPais()+"\n]\n";
            }
        }
        
        return info;
    }
    
    public String ReturnActionFilms(){
        if(isEmpty()){
            return "This array is empty!";
        }
        else{
            String info = "";
            boolean search = true;
            
            while(search == true){
                if(this.vetor[0] == null){
                    info += " ";
                    search = false;
                }
                else if(this.vetor[0].getGenero().equalsIgnoreCase("ação")){
                    info += "\nTitulo: " + this.vetor[0].getTitulo() + "\n"
                    + "Diretor: "+this.vetor[0].getDiretor()+"\n"
                    + "Ano: "+this.vetor[0].getAno()+"\n"
                    + "Genero: "+this.vetor[0].getGenero()+"\n"
                    + "pais: "+this.vetor[0].getPais()+"\n]\n";
                    search = false;
                }else{
                    info += "\nTitulo: " + this.vetor[0].getTitulo() + "\n"
                    + "Diretor: "+this.vetor[0].getDiretor()+"\n"
                    + "Ano: "+this.vetor[0].getAno()+"\n"
                    + "Genero: "+this.vetor[0].getGenero()+"\n"
                    + "pais: "+this.vetor[0].getPais()+"\n]\n";
                    this.dequeue();
                }
            }
            return info;
        }
    }
}
