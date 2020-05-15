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
        Pilha pilha = new Pilha();
        
        //1
        pilha.Push(f1);
        pilha.Push(f2);
        pilha.Push(f3);
        pilha.Push(f4);
        pilha.Push(f5);
        
        pilha.Top();
        System.out.println("\n");
        
        //2
        Carro[] vetor = new Carro[5];
        for(int i = 0; i < 5; i++){
            vetor[i] = pilha.Pop();
        }
        
        //3
        InsertionSort is = new InsertionSort();
        is.Factory(vetor);
        
        //4
        System.out.println("Nome: Gustavo Santos Melo \nRGM: 20644272 ");
    }
    
}
