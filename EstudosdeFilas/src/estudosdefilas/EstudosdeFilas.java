package estudosdefilas;

import Classes.Fila;
import Classes.Filmes;

public class EstudosdeFilas {
    public static void main(String[] args) {
        Fila f = new Fila();
        Filmes f01 = new Filmes("Senhor dos aneis", "token", "rpg", "inglaterra", 1970);
        Filmes f02 = new Filmes("Harry Potter", "j.k rolling", "rpg", "inglaterra", 1999);
        Filmes f03 = new Filmes("Percy Jackson", "um cara ai", "rpg", "eua", 1970);
        Filmes f04 = new Filmes("IT", "aql cara mo famoso", "terror", "inglaterra", 1970);
        Filmes f05 = new Filmes("malitu", "zeze", "aventura", "brasil", 1970);
        
        
        f.enqueue(f01);
        f.enqueue(f02);
        f.enqueue(f03);
        f.enqueue(f04);
        f.enqueue(f05);
        f.dequeue();
        System.out.println(f.toString());
        System.out.println("\n \n"+ f.peek());
    }
}
