
package exercicio04estrutura12;

import java.util.Random;
import exercicio04estrutura12.Pilha;

public class Exercicio04Estrutura12 {


    public static void main(String[] args) {
        Random rng = new Random();
        Pilha p1 = new Pilha();
        Pilha p2 = new Pilha();
        
        for(int i = 0; i < 31; i++){
            int valor = rng.nextInt(101);
            
            if(valor <= 50){
                p1.push(valor);
            }else{
                p2.push(valor);
            }
        }
        boolean repeat = true;
        boolean top1 = false;
        boolean top2 = false;
        while(repeat){
            top1 = p1.top();
            top2 = p2.top();
            
            if(top1 || top2){
                repeat = false;
                break;
            }
        }
        
        if(top1 && top2){
            System.out.println("Sorteio invalido! ");
        }else if(top1 && !top2){
            System.out.println("A pilha 1 foi a ganhadora !\n");
            System.out.println(p1.pop());
        }else{
            System.out.println("A pilha 2 foi a ganhadora !\n");
            System.out.println(p2.pop());
        }
    }
    
}
