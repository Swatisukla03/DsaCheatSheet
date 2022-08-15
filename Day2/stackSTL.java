package Day2;
 

import java.util.Stack;

public class stackSTL {


    // Stack empty() Method in Java

    // public static void main(String args[]){
    //     Stack<String>STACK=new Stack<>();
    //     STACK.push("hello");
    //     STACK.push("Guys");
    //     STACK.push("Happy");
    //     STACK.push("Independence");
    //     STACK.push("Day");

    //     System.out.println(STACK);
    //     System.out.println("is the stack empty :"+ STACK.empty());
    //     STACK.pop();
    //     System.out.println(STACK);
    // }



//    search an element in the stack 

    // public static void main(String args[]){
    //     Stack<String>STACK=new Stack<>();
    //     STACK.push("hello");
    //     STACK.push("Guys");
    //     STACK.push("Happy");
    //     STACK.push("Independence");
    //     STACK.push("Day");


    //     System.out.println(STACK);
    //     System.out.println(STACK.search("Happy"));

    //     System.out.println(STACK.peek());

         
    // }


    // Removing the element 
        public static void main(String args[]){
        Stack<String>STACK=new Stack<>();
        STACK.push("hello");
        STACK.push("Guys");
        STACK.push("Happy");
        STACK.push("Independence");
        STACK.push("Day");


        System.out.println(STACK);
        // System.out.println(STACK.search("Happy"));


        System.out.println(STACK.pop());
        System.out.println(STACK);
        System.out.println(STACK.pop());
        System.out.println(STACK);

         
    }

    

    
}
