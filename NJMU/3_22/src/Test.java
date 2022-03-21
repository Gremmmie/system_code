/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-22
 * Destination:
 */
public class Test {

    int x(){
        char ch = 'a';
        return (int)ch;
    }


    public static void main(String[] args) {

        for (int i = 0, j = 1; j < 5; j += 3) {
            i = i + j;
            System.out.println(i);
        }//第一次循环：i=0,j=1,i=1;
        //第二次循环：i=0,j=4,i=4;
        //第三次循环：i=0,j=7,i=7;

        int count = 1;

        for (int i = 1; i <= 5; i++)

            count += i;

        System.out.println(count);


    }
}
