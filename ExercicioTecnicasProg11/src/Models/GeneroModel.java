package Models;

public final class GeneroModel {
    private String genero;
    
    public GeneroModel(){}

    public GeneroModel(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public String toString(){
        return this.getGenero();
    }
}
