package Day1;

public class FrequencyDigit {
    public static int FindFrequency(int n,int d){
        int rv=0;
        while(n>0){
        int digit=n%10;
        n=n/10;
        if(digit==d){
        rv++;
        }
        }
        // System.out.println(rv);
        return rv;
        

    }
    public static void main(String args[]){
        int n=12113;
        int d=1;
        System.out.println(FindFrequency(n, d));


    }
    
}
