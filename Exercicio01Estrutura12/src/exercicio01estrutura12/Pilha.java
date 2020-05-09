
package exercicio01estrutura12;

import java.util.ArrayList;
import java.util.Dictionary;
import javax.swing.JOptionPane;

public final class Pilha {
    private ArrayList<Dictionary> pilha = new ArrayList<Dictionary>();
    public Pilha(){}
    
    public void push(Dictionary valor){
        if(pilha.isEmpty()){
            pilha.add(valor);
        }
    }
    
    public Dictionary top(){
        if(pilha.isEmpty()){
            JOptionPane.showMessageDialog(null, "Error ao retirar um elemento de uma pilha vazia! ");
        }
        int sizePilha = pilha.size();
        sizePilha--;
        Dictionary valor = pilha.get(sizePilha);
        pilha.remove(sizePilha);
        
        return valor;
    }
    
    @Override
    public String toString(){
        int sizePilha = pilha.size();
        sizePilha--;
        String msg="";
        while(sizePilha >= 0){
            msg += pilha.get(sizePilha) + "\n";
            sizePilha--;
        }
        
        return msg;
    }
}
