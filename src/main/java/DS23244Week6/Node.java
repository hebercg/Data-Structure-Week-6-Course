/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DS23244Week6;

/**
 *
 * @author hebergoncalves
 */
public class Node <T>{
    T element; // Value to be stored in this Node
    Node prev; // Pointer to the previous Node in the DLL
    Node next; //Pointer to the next Node in the DLL
    
    public Node (T el){
        element = el;
        prev = null;
        next = null;
    }
    
    public Node(T el, Node <T> p, Node <T> n){
        element = el;
        prev = p;
        next = n;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    
    @Override
    public String toString() {
        return "Node{" + "element=" + element + '}';
    }

}
