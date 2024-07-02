/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DS23244Week6;

/**
 *
 * @author hebergoncalves
 */
public class LinkedListDLL <T>{
    Node first;
    Node last;
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public int size(Node <T> node){
        if(node == null){
            return 0;
        }
        else{
            System.out.println("node.next = " + node.next);
            return size(node.next) + 1;
        }
    }
    
    public int size(){
        if(isEmpty()){
            return 0;
        }
        Node<T> current = last;
        int count = 1;
        while(current.prev != null){
            current = current.prev;
            count++;
        }  
        return count;
    }
    
    public void addFirst(T elem){
        if(first == null){
            first = new Node<T>(elem, null, null);
            first = last;
        }
        else{
            first = new Node<T>(elem, first, null); 
            first.prev = first;
        }       
    }
 
    /**
    *	This method adds an element to the end of the current list
    *
    **/
    public void add(T elem){
        // Check if the LL is already empty...if it is, then we add this element
        // as the one and only element.... so first = last
        if(first == null){
            first = new Node<T>(elem);
            last = first;    
        }
        // Else the LL is not empty... 
        // The current last node should point to this element and the newly 
        // inserted node, becomes the last element
        else{
            //System.out.println("Adding " + elem + " to end of existing list");
            last.next = new Node<T>(elem, last, null);
            last = last.next;        
        }
    }

    /**
    *	This method adds an element to a specific index of the current list
    *
    **/
    public void add(int index, T elem){
        // Check if the index is Out of Bounds, if so throw an Exception
        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            first.prev = new Node<T>(elem, null, first);
            first = first.prev;
            return;
        }
        else if(index == size()){
            add(elem);
        }
        else{
            Node <T> previous = first;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.next;  
            }
            Node <T> middle = new Node<T>(elem, previous, previous.next);
            Node <T> oldNext = previous.next;
            previous.next = middle;
            
            if(oldNext == null){
                last = middle;
            }else{
                oldNext.prev = middle;
            }        
        }
    }

    public void addKM(int index, T elem){
        // Check if the index is Out of Bounds, if so throw an Exception
        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            Node<T> p = first;
            first = new Node(elem, null, p);
            
            if(p != null){
                p.prev = first;
            }
            
            if(last == null){
                last = first;
            }
            return;
        }
        
        Node <T> pred = first; 
        for (int i = 0; i < index - 1; i++) {
            pred = pred.next;
        }
        Node<T> succ = pred.next;
        Node<T> middle = new Node(elem, pred, succ);
        
        pred.next = middle;
        if(succ == null){
            last = middle;
        }
        else{
            succ.prev = middle;
        }
    }
        
    /**
    *	This method adds an element to the start of the current list
    *
    **/
    public void prepend(T elem){
        if(isEmpty()){
            add(elem);
        }
        else{
            // We know there are element(s) in the list and we want to insert
            // this new element at the start of the list
            // first becomes this new node, it points to (old) first
            first = new Node <T>(elem, null, first);
            // ...create the backward link from the (old) first to the new first
            first.next.prev = first;
        }
    }

    /**
    *	This method removes an element from a specific index of the current list
    *
    **/    
    public void remove(int index){
        // If the index is less than 0 or greater than the size - 1, 
        // then throw exception
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        
        // Now check where in the list  the index is to be removed from
        // Is it the first? Re-org so that the old 2nd node becomes the first, 
        // and that the old 2nd prev link, is set to null 
        if (index == 0){
            //System.out.println("Remove last node........first = " + last.toString());
            //System.out.println("first.next.prev = " + first.next.prev.toString());

            // if there was only one element in the list,
            // then also set last = null
            if(first == last){
                System.out.println("Remove first node...first == last");
                first = null;
                last = null;
            }
            else{
                first.next.prev = null;
                first = first.next;            
            }
        }

        // Now check if node to be removed is the last in the list
        // If so then the old 2nd last becomes the last 
        // and old 2nd last next node is now null
        else if (index == (size() - 1)){
            last.prev.next = null;
            last = last.prev;
        }
        // otherwise it is an intermediate node that is to be removed
        else{    
            Node<T> pred = first;
            for (int i = 0; i < (index - 1); i++) {
                pred = pred.next;
            }
            // Now have the pointer to the pred of node to be removed
            // Now move links around
            // pred.next = index.next
            // pred.next.prev = pred
            pred.next = pred.next.next; //set forward link
            
            // pred.next is now (old) successor/index.next
            pred.next.prev = pred; //set backward link from (old) successor to pred           
        }  
    }
    
    public Node getFirst() {        
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    @Override
    public String toString() {
        String output;
        Node<T> p = first;
        output = "LinkedListDLL{";
        
        while(p != null) {
            output += " " + p.element;
            p = p.next;
        }
        return output + '}';
    }
}
