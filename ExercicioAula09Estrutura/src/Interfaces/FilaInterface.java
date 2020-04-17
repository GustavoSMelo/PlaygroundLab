package Interfaces;

import Classes.Filmes;

public interface FilaInterface {
    public boolean enqueue(Filmes f);   
    public void dequeue();
    public boolean isEmpty();
    public boolean isFull();
    public void peek();

}
