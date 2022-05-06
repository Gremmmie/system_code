package Experiment_4_Array.TicTacToe;

import java.util.Scanner;

/**
 * @author Gremmie102
 * @date 2022/5/5 10:10
 * @purpose : 工具类
 */
public class Tool {
    public static boolean readMenuSelection() {
        int i = new Scanner(System.in).nextInt();
        if (i==1){
            return true;
        }else if (i==2){
            return false;
        }
        throw new MenuException("选择了错误的菜单选项。");//TODO:规定一下这个菜单异常的信息
    }
    public static boolean readLetterSelection(){
        String i = new Scanner(System.in).next();
        if (i.equals("Y")||i.equals("y")){
            return true;
        }else if (i.equals("N")||i.equals("n")){
            return false;
        }
        throw new LetterException("输入了错误的字母选择");
    }

    //判断位置是否符合要求
    public static boolean readPosition(int x,int y,ChessBoard board){
        if(2 <= x && x <= board.getRow()-2 && 2 <= y && y <= board.getCol()-2 && board.getBoard()[x][y] == ' '){
            return true;
        }
        return false;
    }
}
