package exercio02estrutura12;
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
        String binario = "A conversão fica: ";
        while(!pilha.isEmpty()){
            binario += pilha.get(sizePilha).toString();
            pilha.remove(sizePilha);
            sizePilha--;
        }
        
        return binario;
    }
}