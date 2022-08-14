package Day1;

import java.util.Scanner;

// Input: arr[] = {3, 1, 4, 6, 5} 
// Output: True 
// There is a Pythagorean triplet (3, 4, 5).

// Input: arr[] = {10, 4, 6, 12, 5} 
// Output: False 
// There is no Pythagorean triplet. 

public class PythogoreousTriplet {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        

        int max=a;

        if(b>=max){
            max=b;
        }
        if(c>=max){
            max=c;
        }


        if(max==a){
            boolean flag=((b*b+c*c)==(a*a));
            System.out.println(flag);
        }

        else if(max==b){
            boolean flag=((a*a+c*c)==(b*b));
            System.out.println(flag);
        }
        else{
            boolean flag=((a*a+b*b)==(c*c));
            System.out.println(flag);
        }




    }

    
    
}
