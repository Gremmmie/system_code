package Experiment_4_Array.TicTacToe;

/**
 * @author Gremmie102
 * @date 2022/5/5 9:25
 * @purpose :
 */
public class ChessBoard {
    int row;
    int col;
    char[][] board;
    public ChessBoard(){
        row = 3;
        col = 3;
        board = new char[row][col];
    }
    public ChessBoard(int row, int col){
        this.row = row;
        this.col = col;
        board = new char[this.row][this.col];
    }
    public void initBoard(){
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                board[i][j]=' ';
            }
        }
    }
    public void showBoard(){
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("+---");
            }
            System.out.print("+"+"\n");
            for (int j=0;j<col;j++){
                System.out.print("| "+board[i][j]+" ");
            }
            System.out.print("|\n");
        }
        for (int i=0;i<row;i++){
            System.out.print("+---");
        }
        System.out.print("+\n");
    }
    public char isWin(){
// 判断同一行是否相同
        for (int i = 0; i < row; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return board[i][0];  // 返回该行的一个棋子
            }
        }
        // 判断同一列是否相同
        for(int i = 0; i < col; i++){
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                return board[i][0];  // 返回该列的一个棋子
            }
        }
        // 判断对角线是否相同
        if(board[0][0] == board[1][1] && board[1][1]  == board[2][2] && board[0][0] != ' ' || board[0][2] == board[1][1] && board[1][1] ==  board[2][0] && board[0][2] != ' '){
            return board[1][1];        // 返回对角线中间的棋子
        }

//        for (int i=0;i<row;i++){
//            for (int j=0;j<col;j++){
//                //判断行是否符合条件
//                if (board[i][j]=='*'&&board[i][j+1]=='*'&&board[i][j+2]=='*'){
//                    return 'P';//player赢了
//                }
//                if (board[i][j]=='#'&&board[i][j+1]=='#'&&board[i][j+2]=='#'){
//                    return 'C';//computer赢了
//                }
//                //判断列是否符合条件
//                if (board[i][j]=='*'&&board[i+1][j]=='*'&&board[i+2][j]=='*'){
//                    return 'P';//player赢了
//                }
//                if (board[i][j]=='#'&&board[i+1][j]=='#'&&board[i+2][j]=='#'){
//                    return 'C';//computer赢了
//                }
//                //判断对角线是否符合条件
//                if (board[i][j]=='*'&&board[i+1][j+1]=='*'&&board[i+2][j+2]=='*'){
//                    return 'P';//player赢了
//                }
//                if (board[i][j]=='#'&&board[i+1][j+1]=='#'&&board[i+2][j+2]=='#'){
//                    return 'C';//computer赢了
//                }
//            }
//        }
        return 'N';//没有人赢
    }
    public boolean isFull(){
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (board[i][j]==' '){
                    return false;
                }
            }
        }
        return true;
    }

    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
    public char[][] getBoard(){
        return this.board;
    }

//    public static void main(String[] args) {
//        ChessBoard chessBoard = new ChessBoard(4,4);
//        chessBoard.showBoard();
//    }
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