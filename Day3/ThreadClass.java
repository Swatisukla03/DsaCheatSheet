package Day3;

class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
        int i=34;
        System.out.println("Thank You");
    }
}

public class ThreadClass {
    public static void main(String args[]){
        mythr t1=new mythr("Harry");
        mythr t2=new mythr("Swati Sukla");
        t1.start();
        t2.start();
        System.out.println("The id of thr thread is "+t1.getId());
        System.out.println("The name of the thread "+t1.getName());
        System.out.println("The id ");
    }
    
}
