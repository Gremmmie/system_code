package Experiment_7_ArrayList;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
/**
 * @author Gremmie102
 * @date 2022/6/22 16:13
 * @purpose :
 */
public class Test1 {
    public static void main (String[] args)throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("E:\\JAVAcode\\gyljava\\NJMU\\src\\Experiment_7_ArrayList\\Vocabulary1"));
        ArrayList<String> arrayList = new ArrayList<>();
        int maxLength = 0;
        while(scanner.hasNext()){
            String str = scanner.next();
            if (str.length()>maxLength){
                maxLength = str.length();
            }
            arrayList.add(str);
        }
        function(arrayList,maxLength);
//        int[] a = new int[maxLength];
//        Iterator<String> iterator= arrayList.iterator();
//        while(iterator.hasNext()){
//            a[iterator.next().length()-1]++;
//        }
//        for (int i=1;i<=a.length;i++){
//            System.out.print(i+":");
//            for (int j=1;j<=a[i-1];j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
    public static void function(ArrayList<String> arrayList,int maxLength){
        int[] a = new int[maxLength];
        Iterator<String> iterator= arrayList.iterator();
        while(iterator.hasNext()){
            a[iterator.next().length()-1]++;
        }
        for (int i=1;i<=a.length;i++){
            System.out.print(i+":");
            for (int j=1;j<=a[i-1];j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
