package Day1;

import java.util.Arrays;

public class BubbleSort {



    public static void BubbleSortArray(int arr[],int n){


        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }
        }

    }
    public static void main(String args[]){
        int arr[]={7,11,9,2,17,5};
        int n=arr.length;
        BubbleSortArray(arr, n);
        System.out.println(Arrays.toString(arr));
        // System.out.print(BubbleSortArray(arr,n));
         


    }
    
}
