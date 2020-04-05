package Models;

public final class ProdutoModel {
    
    private int id;
    private String name_prod;
    private float price_prod;
    private int cod_bar;
    private String productor_prod;
    
    public ProdutoModel(){}
    
    public ProdutoModel(int id, String name_prod, float price_prod, int cod_bar, String productor_prod){
        this.id = id;
        this.name_prod = name_prod;
        this.price_prod = price_prod;
        this.cod_bar = cod_bar;
        this.productor_prod = productor_prod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_prod() {
        return this.name_prod;
    }

    public void setName_prod(String name_prod) {
        this.name_prod = name_prod;
    }

    public float getPrice_prod() {
        return this.price_prod;
    }

    public void setPrice_prod(float price_prod) {
        this.price_prod = price_prod;
    }

    public int getCod_bar() {
        return this.cod_bar;
    }

    public void setCod_bar(int cod_bar) {
        this.cod_bar = cod_bar;
    }

    public String getProductor_prod() {
        return this.productor_prod;
    }

    public void setProductor_prod(String productor_prod) {
        this.productor_prod = productor_prod;
    }

    @Override
    public String toString() {
        return "ProdutoModel{" + "id=" + id + ", name_prod=" + name_prod + ", price_prod=" + price_prod + ", cod_bar=" + cod_bar + ", productor_prod=" + productor_prod + '}';
    }
    
    
}
