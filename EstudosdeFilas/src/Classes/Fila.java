package Classes;

import Classes.Filmes;

public final class Fila {
    public Fila(){}
    private Filmes list[] = new Filmes[10];
    
    public void enqueue(Filmes value){
        if(!isFull()){
            for(int i =0; i < list.length; i++){
                if(list[i] == null){
                    list[i] = value;
                    break;
                }
            }
            
            System.out.println("Item add with success! ");
        }else{
            System.out.println("Sorry, but this array is null ");
        }
    }
    
    public void dequeue(){
        if(!isEmpty()){
            int pos = 0;
            Filmes sentinel[] = new Filmes[10];

            list[0] = null;

            for(int i =0; i < list.length; i++){
                if(list[i] != null){
                    sentinel[pos] = list[i];
                    pos++;
                }
            }

            pos = 0;

            for(int i = 0; i < list.length; i++){
                list[i] = sentinel[i];
            }
            
            System.out.println("Item deleted with success! ");
        }else{
            System.out.println("Error, this array is empty ");
        }
        
    }
       
    public boolean isFull(){
        int qntd = 0;
        
        for(int i = 0; i < list.length; i++){
            if(list[i] != null){
                qntd++;
            }
        }
        
        if(qntd >= 10){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String peek(){
        return list[0].toString();
    }
    
    public boolean isEmpty(){
        int qntd = 0;
        
        for(int i = 0; i < list.length; i++){
            if(list[i] != null){
                qntd++;
            }
        }
        
        if(qntd > 0){
            return false;
        }else{
            return true;
        }
    }
    
    @Override
    public String toString(){
        String value = "";
        
        for(int i = 0; i < list.length; i++){
            if(list[i] != null){
                value += list[i].toString() + " \n";
            }
        }
        return value;
    } 
}
