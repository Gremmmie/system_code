package Experiment_4_Array;

/**
 * @author Gremmie102
 * @date 2022/5/5 8:40
 * @purpose : 三子棋
 */
//题目二
import java.util.*;
public class Answer_TicTacToe {
    public static final int SIZE =3;
    public static final int ROWS =8;

    public static void main(String[] args) {
        System.out.println("Let's play tic tac toe");
        System.out.println();
        Scanner console =new Scanner (System.in);
        do {
            char[][] board = initializeBoard();
            int moves=0;
            boolean userTurn = yesTo("Do you want to go first?",console);
            boolean done =false;
            while(!done && moves < SIZE * SIZE ) {
                moves++;
                if(userTurn) {
                    doUserMove(console,board);
                }else {
                    done=doComputerMove(board);
                }
                userTurn = !userTurn;
                printBoard(board);
            }
            if(moves== SIZE *SIZE) {
                System.out.println("Cat's game");
            }
            System.out.println();
        }while(yesTo("Want to paly again?",console));
    }
    public static char[][] initializeBoard(){
        char[][] result =new char[SIZE][SIZE];
        for(int i=0;i<SIZE;i++) {
            for (int j= 0;j<SIZE;j++) {
                result[i][j]=' ';
            }
        }
        return result;
    }
    public static void doUserMove(Scanner console,char[][]board) {
        boolean good =false;
        int row =-1;
        int col = -1;
        while(!good) {
            System.out.print("You move?");
            row=console.nextInt()-1;
            col=console.nextInt()-1;
            if (row<0||row>=SIZE || col<0 || col>=SIZE) {
                System.out.println("Numbers must be between 1 and"+SIZE);
            }else if (board[row][col]!=' ') {
                System.out.println("That squars is already taken");
            }else {
                good=true;
            }
        }
        board[row][col]='x';
    }
    public static int valueOf(char[]row) {
        int userCount=0;
        int myCount=0;
        for(int i =0;i<=SIZE;i++) {
            if (row[i]=='x') {
                userCount++;
            }else if (row[i]=='o') {
                myCount++;
            }
        }
        if (userCount>0 && myCount>0) {
            return 0;
        }if (userCount==SIZE-1) {
            return 2;
        }else if (myCount ==SIZE-1) {
            return 3;
        }else if (userCount==SIZE) {
            return 4;
        }else {
            return 1;
        }
    }
    public static boolean doComputerMove(char[][]board) {
        int maxPriority=0;
        char[] temp=new char[SIZE];
        int free =-1;
        int bestRow=-1;
        int bestCol=-1;
        for (int i=0;i<ROWS;i++) {
            for(int j=0;j<SIZE;j++) {
                if(i<3) {
                    temp[j]=board[i][j];
                }else if (i<6) {
                    temp[j]=board[j][i-SIZE];
                }else if (i==6) {
                    temp[j]=board[i][j];
                }else {
                    temp[j]=board[j][SIZE-1-j];
                }
                if (temp[j]==' ') {
                    free=j;
                }
            }
            int priority=valueOf(temp);
            if(priority>maxPriority) {
                maxPriority=priority;
                if(i<3) {
                    bestRow =i;
                }else {
                    bestRow=free;
                }
                if(i<3||i==6) {
                    bestCol=free;
                }else if (i<6) {
                    bestCol =i-SIZE;
                }else {
                    bestCol=SIZE+1-free;
                }
            }
        }
        if (maxPriority>=1&& maxPriority<=3) {
            System.out.println("I move to"+(bestRow+1)+","+(bestCol+1));
            board[bestRow][bestCol]='o';
        }
        if(maxPriority==0) {
            return true;
        }else if (maxPriority==3) {
            System.out.println("I win");
            return true;
        }else if (maxPriority==4) {
            System.out.println("You win");
            return true;
        }else {
            return false;
        }
    }
    public static void drawLine() {
        for (int i=0;i<=4*SIZE;i++) {
            System.out.print("_");
        }
        System.out.println();
    }

    public static void printBoard(char[][] board) {
        drawLine();
        for (int i=0;i<SIZE;i++) {
            for(int j=0;j<SIZE;j++) {
                System.out.print(" "+board[i][j]+" ");
            }
            System.out.println("|");
            drawLine();
        }
        System.out.println();
    }
    public static boolean yesTo(String prompt,Scanner console) {
        System.out.print(prompt+" ");
        String response = console.next().toLowerCase();
        while(!response.equals("y")&& !response.equals("n")) {
            System.out.println("Please answer y or n.");
            System.out.print(prompt+" ");
            response = console.next().toLowerCase();
        }
        return response.equals("y");
    }

}