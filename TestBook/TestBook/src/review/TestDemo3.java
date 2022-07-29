package review;

/**
 * @Author 12629
 * @Date 2022/4/12 21:28
 * @Description：
 */
//包访问权限
interface A {
  public static final String name = "faa";
}
public class TestDemo3 {

   public static void main(String[] args) {
    String str = "hello";//我们暂且不讨论他的内存
    String str2 = new String("world");
    char[] chars = {'a','b','c'};
    String str3 = new String(chars);
    System.out.println(str3);
   }
}
