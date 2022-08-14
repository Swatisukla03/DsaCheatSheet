package Day1;

// Given an array arr of N integers, write a function that returns
//  true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2, otherwise false

public class PythgoreousTripletArray {
   static boolean  checkTriplet(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int x=arr[i]*arr[i],y=arr[j]*arr[j],z=arr[k]*arr[k];
                

                    if(x+y==z || y+z==x ||x+z==y)
                    return true;

                }
            }
        }
        return false;

    }
    public static void main(String args[]){
        int arr[]={3,2,8,4,5,6};
        int n=arr.length;

        if(checkTriplet(arr,n)==true)
        System.out.println("Yes");

        else{
            System.out.println("No");
        }
    



    }

}
