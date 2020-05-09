package exercicio03estrutura12;

import java.util.ArrayList;
public final class Pilha  {
    ArrayList<String> pilha = new ArrayList<>();
    
    public Pilha(){}
    
    public void push(String valor){
        pilha.add(valor);
    }
    
    public String pop(){
        if(pilha.isEmpty()){
            return "Error, you dont access any URL yet";
        }else{
            int sizePilha = pilha.size();
            sizePilha--;
            String URLS = "Todas as URLS que você acessou foram as seguintes: \n ";
            while(!pilha.isEmpty()){
                URLS += pilha.get(sizePilha).toString() + "\n";
                pilha.remove(sizePilha);
                sizePilha--;
            }

            return URLS;
        }
        
    }
    
    public String top(){
        if(pilha.isEmpty()){
            return "Error, you dont access any URL yet";
        }else{
            int sizePilha = pilha.size();
            sizePilha--;
            String valor_retirado = "O Website "+pilha.get(sizePilha).toString() + " foi removido da pilha! \n";
            pilha.remove(sizePilha);

            return valor_retirado;
        }
    }
}