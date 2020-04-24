/*  @author Ledón   */
package pckescolanatacao;

import pcklinkedlist.Node;
import pcklinkedlist.TAD_LinkedList;

class LinkedList implements TAD_LinkedList {
	private Node head=null, tail=null;  // cabeça e cauda (início e final da lista)
        private int size = 0;  // quantidade de itens na lista	
                
        public LinkedList() { 
            head = null; tail = null; size = 0;
        }
                
        public boolean isEmpty() {
            if(head == null) return true; else return false; //ou: return (size == 0);
        }
        
        public int size() {
            return size;
        }
        
        public Object peekFirst() { //retorna o objeto no início da lista
            if(head == null) return null; else return head.getValue();
        }
                
        public Object peekLast() { //retorna o objeto no final da lista
            if(head == null) return null; else return tail.getValue();
        }

	public Object addFirst(Object x) {
            if(x == null)return null;
	    try { //para casos de memória insuficiente
                Node novo = new Node();
                novo.setValue(x);
                novo.setNext(null);
                if (head == null) {
                    head = novo;
                    tail = novo;
                }
                else {
                    novo.setNext(head);    
                    head = novo;
                }
                size++;   //ou: size = size + 1;  porque a lista tem agora mais um item 
                return x;
            } catch(Exception ex) {
                return null; //memória insuficiente
            }
	}
        
	public Object addLast(Object x) {
            if(x == null)return null;
	    try { //para casos de memória insuficiente
                Node novo = new Node();
                novo.setValue(x);
                novo.setNext(null);
                if (head == null) head = novo; else tail.setNext(novo);    
                tail = novo;
                size++;  //ou: size = size + 1;  porque a lista tem agora mais um item 
                return x;
            } catch(Exception ex) {
                return null; //memória insuficiente
            }
	}

        public Object removeFirst() {
            if (head == null) return null;   //ou:  if(size == 0)return null;
            Object value = head.getValue();
            Node temp = head; //opcional, ver depois
            head = head.getNext();
            if( head == null)tail=null;
            temp.setNext(null); temp = null; //opcional para liberação de memória
            size--;
            return value;
        }        

	//Retorna o conteúdo da lista dinâmica encadeada (LinkedList) no formato f: [ head, a, b, c, ..., tail ]
	public String toString (){ //retorna o conteúdo da lista dinâmica
		if( !isEmpty() ) {
			String saida = "\n";
                        Node aux = head;
			while( aux!=null ) { // o ponteiro aux percorre a lista
				saida += aux.getValue().toString();  
                                aux = aux.getNext();
                                if ( aux != null )  saida += "\n"; // ou separar os objetos com ,
			}
                        return ( "lista: [ " + saida + " \n]" );
		}
                else return ( "lista: [ ]" ); // lista vazia
        }
        
        public void clear () {
            Node aux = head;
            while(aux != null) {
                Node tmp = aux;
                aux = aux.getNext();
                // liberar memória:
                tmp.setNext(null); tmp = null;
            }
            head = null; tail = null; size = 0;            
        }
        
        public Object[] toArray() {
           if(isEmpty()) return null;
           try {
                Object[] vetor = new Object[size];
                int i = 0;
                Node aux = head;
                while (aux != null) {
                    vetor[i++] = aux.getValue();
                    aux = aux.getNext();
                }           
                return vetor;   
           }
           catch(Exception exc) { return null; }
        }
        
        public Object remove(int idx) { //eliminar e retornar o item na posição idx
            if(isEmpty() || idx < 0 || idx >= size) return null; //pré-condições
            int pos = 0;  Node next = head, prev = null; 
            //ciclo para avançar simultanemante os ponteiros prev e next até encontrar a posição desejada pos==idx
            while(pos != idx) { 
                prev = next;
                next = next.getNext();
                pos++;
            }
            Object value = next.getValue(); //guardamos o valor a ser retornado
            if(prev != null) prev.setNext(next.getNext()); //o nodo eliminado deixará de estar ligado na lista
            if(idx == 0) head = head.getNext(); //caso especial: foi eliminado o item na cabeça, avançar head
            if(idx == size-1) tail = prev;  //caso especial: foi eliminado o item na cauda, modificar tail
            if(head == null) tail = null;  //para manter os ponteiros com valores nulos
            next.setNext(null); next = null; //para liberar a memória do nodo eliminado
            size--; //ou  size = size - 1;  porque a lista tem agora um item a menos
            return value;
        }
        
        public Object add(int idx, Object x) {  //adicionar um item (nodo) na posição idx
            if(idx < 0 || idx > size || x == null) return null; //pré-condições
            if(idx == size) { //caso especial: inserção no final (depois do tail atual)
                Object res = addLast(x);  return res;
            }
            Node novo = null;
            try {
                novo = new Node();
                novo.setValue(x); novo.setNext(null);
            }
            catch (Exception ex) { return null; } //memória insuficiente
            int pos = 0;  Node next = head, prev = null; 
            //ciclo para avançar simultanemante os ponteiros prev e next até encontrar a posição desejada pos==idx
            while(pos != idx) { 
                prev = next; next = next.getNext(); pos++;
            }  
            if(isEmpty()) {
                head = novo; tail = novo; 
            }
            else if(idx == 0) { //caso especial: o novo nodo será inserido na cabeça da lista
                novo.setNext(head);  head = novo;
            }
            else { //caso geral
                prev.setNext(novo);  novo.setNext(next);
            }
            size++; //ou: size = size + 1;  porque a lista tem agora mais um item           
            return x; //retorna o mesmo objeto inserido na lista
        }
    
        //Elimina da lista o objeto especificado, se for encontrado. Retorna true se sucesso ou false caso contrário.
        public boolean remove(Object x) {
            if(isEmpty() || x == null) return false; 
            Node next = head, prev = null; boolean achou = false;
            //ciclo para avançar simultanemante os ponteiros prev e next até encontrar o item x
            while(next!=null && !achou) { 
                if(x.toString().equalsIgnoreCase(next.getValue().toString())) {
                    achou = true; break;
                }
                prev = next;
                next = next.getNext();
            }
            if(!achou) return false; 
            Object value = next.getValue(); //guardamos o valor a ser retornado
            if(prev != null) prev.setNext(next.getNext()); //caso geral: o nodo eliminado deixará de estar ligado na lista
            if(prev == null) head = head.getNext(); //caso especial: foi eliminado o item na cabeça, avançar head
            if(next.getNext() == null) tail = prev;  //caso especial: foi eliminado o item na cauda, modificar tail
            if(head == null) tail = null;  //para manter os ponteiros com valores nulos
            next.setNext(null); next = null; //para liberar a memória do nodo eliminado
            size--; //porque a lista tem agora um item a menos
            return true;
        }              
        
        //Procura um objeto dentro da lista.
        public boolean contains(Object x) {
            if(x == null)return false;
            Node aux = head; 
            boolean encontrado = false;
            while (aux!=null && !encontrado) {                
                if(x.toString().equalsIgnoreCase(aux.getValue().toString())) encontrado = true;
                // é menos seguro comparar as referências:  if(x == aux.getValue()) encontrado = true;
                aux = aux.getNext();
            }
            return encontrado;
        } 
            
}

