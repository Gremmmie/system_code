import java.util.Arrays;

/**
 * @author Gremmie102
 * @date 2022/4/18 16:40
 * @purpose :
 */
public class Test2 {
    int a = 1;
    int b = 2;

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int[] c = new int[2];
        c[0] = a;
        c[1] = b;
        System.out.println(Arrays.toString(c));
        swap(c,a,b);
        System.out.println(Arrays.toString(c));
    }

    public static void swap(int[] c,int a,int b){
        c[0] = b;
        c[1] = a;
    }
}
