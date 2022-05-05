package Experiment_4_Array.TicTacToe;

import java.util.Scanner;

/**
 * @author Gremmie102
 * @date 2022/5/5 14:56
 * @purpose :电脑类
 */
public class Computer {
    char chess;
    public Computer(){
        chess = '#';
    }
    public char getChess() {
        return chess;
    }
    public void moveChess(ChessBoard chessBoard){
        Scanner sc = new Scanner(System.in);
        while(true){
            int x = (int)(Math.random() * 3);
            int y = (int)(Math.random() * 3);
            boolean isFlag = Tool.readPosition(x+1,y+1,chessBoard);
            if(isFlag){
                chessBoard.getBoard()[x][y] = chess;
                return;
            }
        }

    }
}
