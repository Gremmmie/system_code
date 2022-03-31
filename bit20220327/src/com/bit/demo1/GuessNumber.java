package com.bit.demo1; /**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-31
 * Destination:
 */
import java.util.*;
public class GuessNumber {
    public static final int MAX=10;
    public static void main(String[] args) {
        int a=1;

        introduce();
        Scanner console=new Scanner(System.in);
        Random r=new Random();
        int guess=r.nextInt(MAX)+1;

        for (int i=0;i<10;i++) {
            int guesscomputer=(int)(Math.random()*10)+1;
            System.out.print(guesscomputer);
        }

        System.out.println();

        System.out.print("Is it"+guess+"?");
        String response=console.next();

        while(response.equalsIgnoreCase("n")) {
            guess=r.nextInt(MAX)+1;
            System.out.print("Is it"+guess+"?");
            response=console.next();
            a++;
        }

        System.out.println();
        System.out.println("I got your number of "+guess+" in "+a+" guesses.");

    }
    public static void introduce() {
        System.out.println("This program has you,the user,choose a number");
        System.out.println("between 1 and"+MAX+",then I, the computer,will try my best to guess it.");
        System.out.println();
    }

}