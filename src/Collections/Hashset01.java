package Collections;

import java.util.HashSet;
import java.util.Set;

public class Hashset01 {
    public static void main(String[] args) {

        Set<Integer> hs=new HashSet<>();
        hs.add(12);
        hs.add(23);
        hs.add(78);
        hs.add(44);

        System.out.println(hs);
        System.out.println("contain: "+hs.contains(12));

        System.out.println(hs.remove(12));
        System.out.println(hs);

    }
}
