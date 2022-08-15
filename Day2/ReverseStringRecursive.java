package Day2;

import java.util.Stack;

public class ReverseStringRecursive {

    static Stack<Character>st=new Stack<>();

    public static void insert_bottom(char  x){
        if(st.isEmpty()){
            st.push(x);
        }

        else{
            char a=st.peek();
            st.pop();
            insert_bottom(x);
            st.push(a);
        }
        // st.add(e)(x);
        


    }


    public static void reverse(){
        if(st.size()>0){
            char x=st.peek();
            st.pop();
            reverse();


            insert_bottom(x);
        }
    }




    public static void main(String args[]){
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        System.out.println("Original Stack");
        System.out.println(st);


        reverse();
        System.out.println(st);

    }
    
}
