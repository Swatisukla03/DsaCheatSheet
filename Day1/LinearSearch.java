package Day1;

public class LinearSearch {
    public static void SearchEle(int arr[],int key){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
            index=i;
            break;
            }
        }
        System.out.println(index);

    }
    public static void main(String args[]){
        int arr[]={2,7,8,3,4,1,3};
        int key=1;
        SearchEle(arr, key);

    }
    
}
