
package exercicio01estrutura12;

import java.util.ArrayList;
import java.util.Dictionary;

public class Fila {
    private ArrayList<Dictionary> fila = new ArrayList<>();
    
    public Fila(){}
    
    public void push(Dictionary valor){
        fila.add(valor);
        
    }
    
    public Dictionary top(){
        Dictionary tmp = fila.get(0);
        fila.remove(0);
        return tmp;
    }
    
    public boolean isEmpty(){
        if(fila.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        String msg = "As pessoas que estão em espera são: ";
        for(int i = 0; i < fila.size(); i++){
            msg += fila.get(i) + "\n";
        }
        return msg;
    }
}
