package pp2;

import java.util.Arrays;

public final class Pilha {
    private Carro[] arr = new Carro[5]; 
    
    public Pilha(){
        //System.out.println(Arrays.toString(arr));
    }
    
    public void Push(Carro newCar){
        if(isFull()){
            System.err.println("Message ERROR: you cant add more cars inside stack, because the stack is full ");
        }else if(isEmpty()){
            arr[0] = newCar;
        }else{
            for(int i =0; i < arr.length;i++){
                if(arr[i] == null){
                    arr[i] = newCar;
                    break;
                }
            }
        }
    }
    
    public Carro Pop(){
        if(isEmpty()){
            System.err.println("Message ERROR: stack is empty ! ");
            return null;
        }else if(isFull()){
            System.out.println(arr[4].toString());
            Carro sentinel = arr[4];
            arr[4] = null;
            return sentinel;
        }else{
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i+1] == null){
                    System.out.println(arr[i].toString());
                    Carro sentinel = arr[i];
                    arr[i] = null;
                    return sentinel;
                }
            }
        }
        
        return null;
    }
    
    public void Top(){
        if(isFull()){
            System.out.println(arr[4].toString());
        }else{
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i+1] == null){
                    System.out.println(arr[i].toString());
                }
            }
        }
    }
    
    public boolean isEmpty(){
        int cont = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null){
                cont++;
            }
        }
        
        if(cont > 0){
            return false;
        }else{
            return true;
        }
    }
    
    public boolean isFull(){
        int cont = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null){
                cont++;
            }
        }
        
        if(cont == 5){
            return true;
        }else{
            return false;
        }
    }
    
}
