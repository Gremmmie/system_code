package Experiment_4_Array.TicTacToe;

import java.util.Scanner;

import static Experiment_4_Array.TicTacToe.Tool.readLetterSelection;
import static Experiment_4_Array.TicTacToe.Tool.readMenuSelection;

/**
 * @author Gremmie102
 * @date 2022/5/5 9:21
 * @purpose :
 */
public class TicTacToe {
    public static void main(String[] args) {

        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to play TicTacToe?");
            showMenu();
            if (!readMenuSelection()){
                System.exit(0);
            }
            System.out.println("请规定棋盘的大小");
            System.out.print("Row: \n");
            int row = scanner.nextInt();
            System.out.print("Col: \n");
            int col = scanner.nextInt();
            ChessBoard chessBoard = new ChessBoard(row,col);
            Player player = new Player();
            Computer computer = new Computer();
            chessBoard.initBoard();
            while(true){
                chessBoard.showBoard();
                System.out.println("You want to play first?(Y/N)");
                if (readLetterSelection()){
                    while(true){
                        if (chessBoard.isFull()){
                            System.out.println("棋盘已满，本局游戏结束");
                            break;
                        }
                        player.moveChess(chessBoard);
                        chessBoard.showBoard();
                        char flag = chessBoard.isWin();
                        if (flag == 'P'){
                            System.out.println("玩家获胜！");
                            break;
                        }else if (flag == 'C'){
                            System.out.println("人工智障获胜！");
                            break;
                        }

                        computer.moveChess(chessBoard);
                        chessBoard.showBoard();
                        if (flag == 'P'){
                            System.out.println("玩家获胜！");
                            break;
                        }else if (flag == 'C'){
                            System.out.println("人工智障获胜！");
                            break;
                        }

                    }
                }else {
                    while(true){
                        if (chessBoard.isFull()){
                            System.out.println("棋盘已满，本局游戏结束");
                            break;
                        }

                        char flag = chessBoard.isWin();
                        computer.moveChess(chessBoard);
                        chessBoard.showBoard();
                        if (flag == '*'){
                            System.out.println("玩家获胜！");
                            break;
                        }else if (flag == '#'){
                            System.out.println("人工智障获胜！");
                            break;
                        }
                        player.moveChess(chessBoard);
                        chessBoard.showBoard();

                        if (flag == '*'){
                            System.out.println("玩家获胜！");
                            break;
                        }else if (flag == '#'){
                            System.out.println("人工智障获胜！");
                            break;
                        }
                    }
                }
            }
        }
    }
    public static void showMenu(){
        System.out.println("============================================");
        System.out.println("==========        1. play        ===========");
        System.out.println("==========        2. exit        ===========");
        System.out.println("============================================");
        System.out.print("请输入选择:>");
    }
}




//void print_chessBoard(char chessBoard[ROW][COL], int row, int col)
//{
//	int i, j;
//	for (i = 0; i < row; i++)
//	{
//		for (j = 0; j < col; j++)
//		{
//			printf("+---");
//		}
//		printf("+\n");
//		for (j = 0; j < col; j++)
//		{
//			printf("|   ");
//		}
//		printf("|\n");
//	}
//	for (i = 0; i < col; i++)
//	{
//		printf("+---");
//	}
//	printf("+\n");
//}