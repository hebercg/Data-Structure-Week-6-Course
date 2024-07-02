/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DS23244Week6;

/**
 *
 * @author hebergoncalves
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println("Fibonacci with iteration ....");
        System.out.println("fib(0): " + fibNum(0));
        System.out.println("fib(1): " + fibNum(1));
        System.out.println("fib(2): " + fibNum(2));
        System.out.println("fib(3): " + fibNum(3));   
        
        System.out.println("Fibonacci with iteration/loop ....");
        for (int i = 0; i < 20; i++) {
            System.out.println("fib("+i+"): " + fibNum(i));
            
        }
        
        System.out.println("Fibonacci with recursion ....");
        System.out.println("fibRec(0): " + fibRec(0));
        System.out.println("fibRec(1): " + fibRec(1));
        System.out.println("fibRec(2): " + fibRec(2));
        System.out.println("fibRec(3): " + fibRec(3));

        System.out.println("Factorial numbers using iteration.....");
        System.out.println("factIter(0): " + factIter(0));
        System.out.println("factIter(1): " + factIter(1));
        System.out.println("factIter(2): " + factIter(2));
        System.out.println("factIter(3): " + factIter(3));

        System.out.println("Factorial numbers using iteration, looping");
        for (int i = 0; i < 10; i++) {
            System.out.println("factIter(" + i + ") is: " + factIter(i));
        }
        
        System.out.println("Factorial numbers using recursion.... ");
        for (int i = 0; i < 10; i++) {
            System.out.println("factIter(" + i + ") is: " + factIter(i));
        }
        
        System.out.println("Power using recursion...");
        System.out.println("power(2,4): " + power(2, 4)); // 16    
        System.out.println("power(2,10): " + power(2, 10)); // 1024
        System.out.println("power(3,3): " + power(3, 3)); // 27
        System.out.println("power(3,4): " + power(3, 4)); // 81
        
        System.out.println("Reverse a string using recursion");
        System.out.println("reverse(enda): " + reverse("enda"));
        
        LinkedListDLL linkedDL = new LinkedListDLL();
        System.out.println("*****Start of Linked List****");
        System.out.println("Is the DLL linkedDL empty? " + linkedDL.isEmpty());
        System.out.println("The size of DLL linkedDL = " + linkedDL.size());
        
        System.out.println("*****Add node \"Bill\" to the Linked List");
        Node bill = new Node("Bill");
        linkedDL.add(bill);
        
        System.out.println("DLL size = " + linkedDL.size());
        System.out.println("DLL.first = " + linkedDL.getFirst());
        System.out.println("DLL.last = " + linkedDL.getLast());
        System.out.println("DLL contents: " + linkedDL.toString());
        
        System.out.println("*****Add node \"Enda\" to the Linked List");
        Node enda = new Node("Enda");
        linkedDL.add(enda);
        
        System.out.println("DLL size = " + linkedDL.size());
        System.out.println("DLL.first = " + linkedDL.getFirst());
        System.out.println("DLL.last = " + linkedDL.getLast());
        System.out.println("DLL contents: " + linkedDL.toString());

        System.out.println("Add node \"Hermione\" to the Linked List");
        Node hermione = new Node("Hermione");
        linkedDL.add(hermione);

        System.out.println("DLL size = " + linkedDL.size());
        System.out.println("DLL.first = " + linkedDL.getFirst());
        System.out.println("DLL.last = " + linkedDL.getLast());
        System.out.println("DLL contents: " + linkedDL.toString()); 
        
        bill.setNext(enda);
        enda.setNext(hermione);
        enda.setPrev(bill);
        hermione.setPrev(enda);
           
        System.out.println("Check size of LL using recursion");
        System.out.println("DLL size = " + linkedDL.size(bill));
        
    }
    
    public static int fibNum(int n){
        if(n == 0){
            return 0;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        } 
        return b;
    }
    
    public static int fibRec(int n){
        // base case
        if(n == 0 || n == 1){
            return n;
        }
        // recursive call
        return fibRec(n-1) + fibRec(n-2);
    }
    
    public static int factIter(int n){
        // define the return variable and give it a default value
        int output = 1;
        // for loop to loop around until we get o n, the input variable
        for (int i = 1; i <= n; i++) {
            output *= i; // output = output * i 
        }
        return output;
    }
    
    public static int factRec(int n){
        // Base case
        if (n == 0) {
            return 1;
        }
        // Recursive call and progress to base case
        return (n * factRec(n-1));
    }
    
    public static int power(int n, int pow){
        if(pow == 0){
            return 1;
        }
        
        return n * power(n, pow - 1);
    }
    
    public static String reverse(String str){
        // base case
        if(str == null || str.length() <= 1){
            return str;
        }
        // recursive call and progress to base case
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
