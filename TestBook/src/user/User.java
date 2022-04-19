package user;
import book.BookList;
import operation.IOperation;

/**
 * @ Author 12629
 * @ Date 2022/4/10 12:04
 * @ Description：user的抽象类，用来被继承
 */

abstract public class User {
    protected String name;
    protected IOperation[] IOperations;

    public User(String name) {
        this.name = name;
    }

    abstract public int menu();

    public void doOperation(int choice, BookList bookList) {
        IOperations[choice].work(bookList);
    }
}
