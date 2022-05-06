package Experiment_4_Array.TicTacToe;

import java.util.Scanner;

/**
 * @author Gremmie102
 * @date 2022/5/5 10:07
 * @purpose :
 */
public class Player {
    char chess;
    public Player(){
        chess = '*';
    }

    public char getChess() {
        return chess;
    }
    public void moveChess(ChessBoard chessBoard){
        System.out.print("输入坐标X：");
        int x = new Scanner(System.in).nextInt()+1;
        System.out.print("输入坐标Y：");
        int y = new Scanner(System.in).nextInt()+1;

        if (Tool.readPosition(x,y,chessBoard)){
            chessBoard.board[x][y] = chess;
        }else{
            throw new moveException("坐标填写错误");
        }
    }
}
