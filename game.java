package System_tron;

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        System.out.println("0 for rock | 1 for paper | 2 for scissor");
        Scanner sc=new Scanner(System.in);
        int playmove=sc.nextInt();
        System.out.println("Players is move "+playmove);
        Random rn=new Random();
        int computermove=rn.nextInt(3);
        System.out.println("Computer is move "+computermove);
        if (computermove==playmove){
            System.out.println("The match is Draw ");
        } else if (playmove==0 && computermove==1 || playmove==1 && computermove==2 || playmove==2 && computermove==0) {
            System.out.println("you lost the match....try again");
        }else {
            System.out.println("you win the match");
        }
        System.out.println("Thnku for playing game");
    }
}
