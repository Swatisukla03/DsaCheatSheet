package Day1;

public class SpanArray {
    public static void spanArray(int arr[],int n){
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min)
            min=arr[i];

            else if(arr[i]>max){
                max=arr[i];
            }

        }
        int span=max-min;
        System.out.println(span);

    }
    public static void main(String args[]){
        int arr[]={2,4,1,20,89};
        int n=arr.length;
        spanArray(arr, n);

    }
    
}
