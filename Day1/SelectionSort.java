package Day1;

import java.util.Arrays;

public class SelectionSort {
    public static void SelectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++)
                if(arr[j]<arr[min_index])
                    min_index=j;


                    int temp;
                    temp=arr[min_index];
                    arr[min_index]=arr[i];
                    arr[i]=temp;

                
               
            }
          
          
        }

    
    public static void main(String args[]){
        int arr[]={9,3,5,78,43,79};
        // int n=arr.length-1;
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}
