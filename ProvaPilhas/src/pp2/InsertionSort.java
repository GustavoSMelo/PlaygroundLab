package pp2;

import java.util.Arrays;

public final class InsertionSort {
    public InsertionSort(){}
    
    public void Factory(Carro arr[]){
        int cont = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == null){
                cont++;
            }
        }
        
        if(cont == 5){
            System.err.println("message ERROR: array is null ! ");;
        }else{
            for(int i = 1; i < arr.length; i++){
                Carro sentinel = arr[i];
                int pos = i;
                while(pos > 0 && sentinel.getNome().compareToIgnoreCase(arr[pos-1].getNome()) < 0){
                    arr[pos] = arr[pos - 1];
                    pos--;
                }
                arr[pos] = sentinel;
            }
            
            String msg = "\nLista de carros ordenados por insetionSort: \n";
            for(int i = 0; i < arr.length; i++){
                msg += arr[i].toString()  +  " | \n";
            }
            
            System.out.println(msg);
        }
    }
}
