package exercicio03estrutura12;

import java.util.Scanner;

public class Exercicio03Estrutura12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pilha p = new Pilha();
        String URL = "";
        boolean repeat = true;
        while(repeat){
            System.out.print("Digite a URL: ");
            URL = input.nextLine();
            
            if(URL.equalsIgnoreCase("voltar")){
                System.out.println(p.top());
            }else if(URL.equalsIgnoreCase("sair")){
                System.out.println(p.pop());
                repeat = false;
            }else{
                p.push(URL);
            }
        }
    }
}
