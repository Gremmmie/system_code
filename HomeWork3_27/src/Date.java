/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-28
 * Destination:
 */
public class Date {
    public int year;
    public int month;
    public int day;

    public static void main(String[] args) {
        Date d = new Date();
        d.setDay(2020,9,15);
        d.printDate();
    }

    public void setDay(Date this,int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void printDate(Date this){
        System.out.println(this.year+"/"+this.month+"/"+this.day);
    }
}
