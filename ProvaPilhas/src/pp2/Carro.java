/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2;

/**
 *
 * @author pp2mfpl2
 */
public class Carro {
    private String nome;
    private String marca;
    private int  ano;
    private String placa;

    public Carro(String nome, String marca, int ano, String placa) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.placa = placa;
    }

@Override
    public String toString() {
        return "Carro{" + "Nome=" + nome + ", Marca =" + marca + ", ano =" + ano + ", Placa=" + placa + '}';
    }
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
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
}