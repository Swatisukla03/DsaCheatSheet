package Day1;

import java.util.Vector;

public class VectorSTL {

    // Vector add() Method in Java


    // public static void main(String args[]){
    //     // int arr[]=new int[]{1,2,3,4};
    //     Vector<String>vector=new Vector<>();
    //     vector.add("Hello");
    //     vector.add("Everyone");
    //     vector.add("Coding ");
    //     vector.add("is");
    //     vector.add("Life");
    //     System.out.println(vector);
    //     vector.add("Marathon");
    //     System.out.println(vector);

    // }


    // Vector clear() Method in Java  


    // public static void main(String args[]){
    //     // int arr[]=new int[]{1,2,3,4};
    //     Vector<String>vector=new Vector<>();
    //     vector.add("Hello");
    //     vector.add("Everyone");
    //     vector.add("Coding ");
    //     vector.add("is");
    //     vector.add("Life");
    //     System.out.println(vector);
    //     vector.clear();
    //     System.out.println(vector);

    // }

    // Vector set() Method in Java

    public static void main(String args[]){
        // int arr[]=new int[]{1,2,3,4};
        Vector<String>vector=new Vector<>();
        vector.add("Hello");
        vector.add("Everyone");
        vector.add("Coding ");
        vector.add("is");
        vector.add("Life");
        System.out.println(vector);
        // vector.clear();
        System.out.println(vector.set(0, "Hi"));
        System.out.println(vector);

    }


    
    
}
