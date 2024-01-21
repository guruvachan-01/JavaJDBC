package DSA_Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack02 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(22);
        st.push(23);
        st.push(24);
        st.push(25);


        System.out.print(st);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());


//        Queue<Integer> qu=new LinkedList<>();
//        qu.add(2);
//        qu.add(22);
//        qu.add(23);
//        qu.add(24);
//        qu.add(25);
//
//        System.out.println(qu.remove());
//        System.out.println(qu.remove());
//        System.out.println(qu.remove());
//        System.out.println(qu.remove());
//        System.out.println(qu.remove());



    }
}
