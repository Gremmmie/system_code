package operation;
import book.BookList;

/**
 * @ Author 12629
 * @ Date 2022/4/10 11:54
 * @ Description：增加图书
 */

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("新增一本书籍!");
        System.out.println("请输入书籍的ID");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        System.out.println("请输入新增书籍的书名: ");
        String name = scanner.next();

        System.out.println("请输入新增书籍的作者: ");
        String author = scanner.next();

        System.out.println("请输入新增书籍的类型: ");
        String type = scanner.next();

        System.out.println("请输入新增书籍的价格: ");
        int price = scanner.nextInt();

        Book book = new Book(id,name,author, price,type);
        bookList.setBooks(bookList.getUsedSize(), book);
        bookList.setUsedSize(bookList.getUsedSize() + 1);
    }
}
