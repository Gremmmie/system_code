/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-25
 * Destination:
 */
public class MyDate {

    public int year;
    public int month;
    public int day;

    /**
     * 设置日期：
     */
    public void setDate(int year,int month,int day) {
        this.year = year;
        this.month = month ;
        this.day = day;
    }

    public void printDate() {
        System.out.println("年："+this.year+"月："+this.month+"日："+this.day);
    }

    public static void main(String[] args) {

        // this.printDate();

        MyDate myDate = new MyDate();

        myDate.setDate(2022,3,25);

        myDate.printDate();

        MyDate myDate2 = new MyDate();

        myDate2.setDate(2022,3,28);
        myDate2.printDate();

    }
}