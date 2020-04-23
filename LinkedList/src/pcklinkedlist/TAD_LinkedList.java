/*  @author Ledón   */
package pcklinkedlist;

public interface TAD_LinkedList {  // Tipo abstrato de dado que descreve a Lista Ligada Dinâmica.    
        //Verifica se a Lista está vazia.
        public boolean isEmpty(); 
	       
        //Retorna o tamanho (quantidade de itens) da lista.
        public int size(); 
	       
	//Retorna o conteúdo (todos os elementos) da Lista.
	public String toString(); // O(n)
        
        //Adiciona o item como o primeiro da lista.
        public Object addFirst(Object item);  // O(1)
        
        //Adiciona o item como o último da lista.
        public Object addLast(Object item);  // O(1)
        
        //Remove e retorna o item na cabeça da lista, o primeiro (retorna null se lista vazia).
        public Object removeFirst(); // O(1)
        
        //Retorna (sem eliminar) o primeiro item da lista (retorna null se lista vazia).
        public Object peekFirst();  // O(1)
        
        //Retorna (sem eliminar) o último item da lista (null se lista vazia).
        public Object peekLast();  // O(1)
        
        //Retorna um vetor de objetos com os itens da lista encadeada dinâmica.
        public Object[] toArray();    // O(n)
        
        //Limpa o conteúdo da lista:
        public void clear();   // O(n)

        //Outras operações que dependem da iteração pelos itens da lista.   
        
        //Adiciona o valor item na lista na posição idx.
        public Object add(int idx, Object item);   // O(n)
        
        //Remove o item da posição idx. Retorna o item se sucesso ou null, caso contrário.
        public Object remove(int idx);   // O(n)        
        
        //Elimina da lista o objeto especificado, se for encontrado. Retorna verdadeiro ou falso.
        public boolean remove(Object x);  // O(n) 

        //Procura um objeto dentro da lista. Retorna verdadeiro ou falso.
        public boolean contains(Object x); // O(n)   
        
        //Retorna o elemento da posição idx. Erro se idx < 0 || idx >= size()
        //public Object get(int idx);   // O(n)
        
        //Altera o item da posição idx da lista. Erro se idx < 0 || idx >= size()   
        //public Object set(int idx, Object item);   // O(n)
}
