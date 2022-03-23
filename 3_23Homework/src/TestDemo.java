import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-23
 * Destination:给定一个有序整型数组, 实现二分查找
 */
public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a4[]=new ArrayList[3];
        for(int i=0;i<a4.length;i++) {
            a4[i]=new ArrayList();
            a4[i].add(1);
            for(int j:a4[i])
                System.out.print(j+" ");
            System.out.println();
        }
    }
    public static int BinarySearch(int[] array,int key){
        int index,left,right;
        left = 0;
        right = array.length-1;
        return 1;
    }

}
