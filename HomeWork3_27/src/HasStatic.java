/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-27
 * Destination:
 */
public class HasStatic {// 1

        static int cnt = 6;
        static{
            cnt += 9;
        }
        public static void main(String[] args){
            System.out.println("cnt =" + cnt);
        }
        static{
            cnt /=3;
        };

}
