package Day3;
class mythread extends Thread{
    public void run(){
        int i=1;
        while(i<=20){
        System.out.println("This is my first thread !");
        i++;
        }
    }
}
class mythread1 extends Thread{
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("This is 2nd thread !");
            i++;
        }
    }
}

     class mythreadclass{

    public static void main(String args[]){
        mythread t1=new mythread();
        mythread1 t2=new mythread1();
        t1.start();
        t2.start();

    }

}



    


// class Multi extends Thread{  
//     public void run(){  
//     System.out.println("thread is running...");  
//     }  
//     public static void main(String args[]){  
//     Multi t1=new Multi();  
//     t1.start();  
//      }  
//     }  



