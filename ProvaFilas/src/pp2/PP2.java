/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2;

import java.util.Arrays;

/**
 *
 * @author pp2mfpl2
 */
public class PP2 {

    private Carro f1 = new Carro("Onix", "General Motors", 2020, "FKD-4C73");
    private Carro f2 = new Carro("Camaro", "General Motors", 2020, "FKD-4A73");
    private Carro f3 = new Carro("Montana", "General Motors", 2020, "FKD-4B73");
    private Carro f4 = new Carro("Bolt", "General Motors", 2020, "FKD-4E73");
    private Carro f5 = new Carro("Cruze", "General Motors", 2020, "FKD-4J73");
  
    public static void main(String[] args) {
        new PP2();
    }
    
    public PP2() {
        //questao 1
            Fila fila = new Fila();
            fila.enfileirar(f1);
            fila.enfileirar(f2);
            fila.enfileirar(f3);
            fila.enfileirar(f4);
            fila.enfileirar(f5);

            fila.topo();
            System.out.println("\n");
        
        //questao 2
            System.out.println("\n");
            Carro[] vetor = new Carro[5];
            for(int i =0; i < vetor.length; i++){
                vetor[i] = fila.desinfileirar();
            }
        
        // questao 3
            System.out.println("\n");
            for(int i = 1; i < vetor.length; i++){
                Carro x = vetor[i];
                int pos = i;
                while(pos > 0 && x.getNome().compareToIgnoreCase(vetor[pos-1].getNome()) < 0){
                    vetor[pos] = vetor[pos - 1];
                    pos--;
                }
                vetor[pos] = x;
            }
            
            String itens_ordenados = "";
            for(int i = 0; i < vetor.length; i++){
                itens_ordenados += vetor[i].toString()  +  " \n";
            }
            
            System.out.println(itens_ordenados);
        
        // questao 4
            System.out.println("Luis Eduardo Souza Silva 21209375");
    }
    
}
