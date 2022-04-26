/**
 * @author Gremmie102
 * @date 2022/4/26 10:11
 * @purpose :
 */
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        int count =0;
        int[] array = new int[127];
        scanner.nextLine();
        ArrayList<String> stringList = new ArrayList<>(line);
        while(line!=0){
            String string = scanner.nextLine();
            ArrayList<String> string1 = new ArrayList<>();
            count++;
//            string1.add(string);
            stringList.add(string);
            for (int i =0;i<stringList.get(count-1).length();i++){
//                char[] chars = stringList.get(line-1).toCharArray();
                array[(int)(stringList.get(count-1).charAt(i))]++;
            }
            for (int i =0;i<array.length;i++){
                if (array[i]>3) {
                    array[i] = 2;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i=0;i<array.length;i++){
                stringBuilder.append((char)(array[i]));
            }
            stringBuilder.trimToSize();
            System.out.println(stringBuilder);
//            for (int i = ;)

            line--;
        }
        System.out.println(stringList);
    }
}
