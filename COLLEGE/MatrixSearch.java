package COLLEGE;

import java.util.Scanner;

public class MatrixSearch {


public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int arr[][]=new int[n][m];
   
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
    }


    int key=sc.nextInt();
   

    if(n==0 ||m==0){
        System.out.println("-1");
    }
     


    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr[i][j]==key){
                System.out.println("1");
                break;
            }else{
                System.out.println("0");
                break;
            }
        }
    }

}
    
}
