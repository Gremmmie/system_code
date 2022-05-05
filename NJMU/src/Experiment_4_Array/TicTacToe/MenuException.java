package Experiment_4_Array.TicTacToe;

/**
 * @author Gremmie102
 * @date 2022/5/5 10:13
 * @purpose :
 */
public class MenuException extends RuntimeException{
    public MenuException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "菜单选项选择错误";
    }
}
