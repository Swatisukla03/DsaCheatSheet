package COLLEGE;

import java.util.Scanner;

public class SpiralArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // int n = 4;
        // int m = 4;
        // int arr[][] =  {{1, 2, 3, 4},
        //            {5, 6, 7, 8},
        //            {9, 10, 11, 12},
        //            {13, 14, 15, 16}};
        spiralarray(arr, n, m);
        System.out.print("END");

    }
    public static void spiralarray(int arr[][],int n,int m){
          int i,k=0,l=0;
          while(k<m && l<n){
            for( i=l;i<n;i++){
                System.out.print(arr[k][i]+",");
            }
            k++;
            // check here
            for(i=k;i<m;i++){
                System.out.print(arr[i][n-1]+",");

            }
            n--;


            if(k<m){
                for( i=n-1;i>=l;i--){
                    System.out.print(arr[m-1][i]+",");
                }
                m--;

            }

            if(l<n){
                for(i=m-1;i>=k;i--){
                    System.out.print(arr[i][l]+",");
                }
                l++;

            }
          }

    }
    
}
