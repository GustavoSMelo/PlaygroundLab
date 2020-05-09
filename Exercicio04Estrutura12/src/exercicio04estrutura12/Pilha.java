package exercicio04estrutura12;

import java.util.ArrayList;
public final class Pilha  {
    ArrayList<Integer> pilha = new ArrayList<>();
    
    public Pilha(){}
    
    public void push(int valor){
        pilha.add(valor);
    }
    
    public String pop(){
        int sizePilha = pilha.size();
        sizePilha--;
        String rngs = "Todos os ultimos numeros gerados foram: \n ";
        while(sizePilha >= 0){
            rngs += pilha.get(sizePilha) + "\n";
            pilha.remove(sizePilha);
            sizePilha--;
        }

        return rngs;
        
    }
    
    public boolean top(){
        if(pilha.isEmpty()){
            return true;
        }else{
            int sizePilha = pilha.size();
            sizePilha--;
            pilha.remove(sizePilha);
            return false;
        }
    }
   
}