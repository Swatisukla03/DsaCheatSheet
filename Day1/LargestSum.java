package Day1;

public class LargestSum {
    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int n=arr.length;
        LargestSum(arr, n);

    }
    public static void LargestSum(int arr[],int n){
        int max_sum=arr[0];
        int curr_sum=arr[0];
        for(int i=0;i<n;i++){
            curr_sum+=arr[i];

            if(curr_sum<0)
            curr_sum=0;

            if(curr_sum>max_sum)
            max_sum=curr_sum;
        }
        System.out.println(max_sum);

    }
    
}
