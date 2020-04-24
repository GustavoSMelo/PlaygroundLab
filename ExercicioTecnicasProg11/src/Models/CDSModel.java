package Models;

public final class CDSModel {
    private int codigo;
    private String titulo;
    private String interprete;
    private GeneroModel genero;
    private float preco;
    
    public CDSModel(){}

    public CDSModel(int codigo, String titulo, String interprete, GeneroModel genero, float preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.interprete = interprete;
        this.genero = genero;
        this.preco = preco;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInterprete() {
        return this.interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public GeneroModel getGenero() {
        return this.genero;
    }

    public void setGenero(GeneroModel genero) {
        this.genero = genero;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
