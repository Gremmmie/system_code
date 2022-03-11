import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User: Gremmie
 * Date: 2022-03-11
 * Destination:
 */
public class ComputerGuess {
    public static void main(String[] args) {
        Random generation = new Random();
        Scanner scan = new Scanner(System.in);
        String human = null;
        int num=0;
        int truePC=0;
        do{int PC = generation.nextInt(10)+1;
            System.out.println("Is it "+ PC+"?");
            human=scan.next();
            scan.nextLine();
            num++;
            truePC = PC;
        }while(human.equals("n"));
        System.out.println("I got your number of "+truePC+" in "+num+" guesses");
    }
}
