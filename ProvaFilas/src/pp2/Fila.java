package pp2;

import java.util.Arrays;

public class Fila {
    private Carro[] vetor = new Carro[5];
    public Fila(){
    }
    
    public void enfileirar(Carro novocarro){
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == null){
                vetor[i] = novocarro;
                break;
            }
        }
    }
    
   public void topo(){
       if(vetor[0] == null){
           System.err.println("A fila esta vazia, logo não tem como pegar o topo da pilha");
       }else{
           System.out.println(vetor[0].toString());
       }
   }
   
   public Carro desinfileirar(){
       if(vetor[0] == null){
           System.err.println("fila vazia");
           return null;
       }else{
           System.out.println(vetor[0].toString());
           Carro aux = vetor[0];
           vetor[0] = null;
           
           for(int i = 0; i < vetor.length -1; i++){
               if(vetor[i+1] != null && vetor[i] == null){
                   vetor[i] = vetor[i+1];
                   vetor[i+1] = null;
               }
           }
           return aux;
       }
   }
}
