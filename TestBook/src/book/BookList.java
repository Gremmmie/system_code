package book;

/**
 * @ Author 12629
 * @ Date 2022/4/10 11:45
 * @ Description：书架类
 */
public class BookList {

    private Book[] books = new Book[10];//这个书架的大小

    private int usedSize;//数组中放了几本书

    public BookList() {
        books[0] = new Book(1,"三国演义","罗贯中",90,"小说");
        books[1] = new Book(2,"西游记","吴承恩",78,"小说");
        books[2] = new Book(3,"红楼梦","曹雪芹",89,"小说");
        this.usedSize = 3;
    }

    /**
     * 获取当前数组当中的元素的个数
     * @ return
     */
    public int getUsedSize() {
        return usedSize;
    }

    /**
     * 修改当前数组中元素的个数
     * @ param usedSize
     */
    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    //可以再这里面 写所有对数组的操作  借书   还书.......

    /**
     * 获取pos下标的书
     * @ param pos
     * @ return
     */
    public Book getPos(int pos) {
        return books[pos];
    }

    /**
     * 给数组的pos位置  放一本书
     * @param pos
     * @param book
     */
    public void setBooks(int pos,Book book) {
        books[pos] = book;
    }


    /* dpublic void work() {
        System.out.println("新增图书！");
    }*/

}