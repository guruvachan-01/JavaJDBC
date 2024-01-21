package DSA_task_01;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();

        if (s1.length()==s2.length()){
            char[] a1=s1.toCharArray();
            char[] a2=s2.toCharArray();

          Arrays.sort(a1);
          Arrays.sort(a2);

            boolean result=Arrays.equals(a1,a2);
            if (result){
                System.out.println("Anagram string");
            }else {
                System.out.println("Not anagram string");
            }
        }
    }
}
