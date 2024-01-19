package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> in=new ArrayList<>();
        in.add(3);
        in.add(5);
        in.add(8);
        in.add(2);
        System.out.println("before"+in);
       // Arrays.sort(in);  not a aray class support
        Collections.sort(in);
        System.out.println("after:"+in);
        Collections.sort(in,Collections.reverseOrder());
        System.out.println("after reverse:"+in);
    }
}
