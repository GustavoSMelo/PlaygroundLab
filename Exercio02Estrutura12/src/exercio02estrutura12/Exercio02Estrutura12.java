
package exercio02estrutura12;

import java.util.Scanner;

public class Exercio02Estrutura12 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Digite um numero para converte-lo em binario:  ");
        int valor = Input.nextInt();
        
        Pilha p = new Pilha();
        boolean repeat = true;
        while(repeat){
            if(valor > 1){
                int tmp = valor / 2;
                System.out.println(tmp);
                p.push(valor % 2);
                valor = tmp;
            }else{
                repeat = false;
            }
        }
        
        String msg = p.pop();
        System.out.println(msg);
    }
}
