import java.util.ArrayList;
import java.util.List;

/**
 * @author Gremmie102
 * @date 2022/6/28 14:33
 * @purpose :
 */
public class StraightInsertSort {
    public static List<Integer> insertSort(ArrayList<Integer> arrayList){
        return null;
    }

    public static void main(String[] args) {
        int[] a = new int[]{7,8,32,5,67,65,21,2};
        insertSort(a);
        for (int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void insertSort(int[] array){
        int temp;
        for (int i = 1;i<array.length;i++){
            if (array[i]<array[i-1]){
                temp = array[i];
                for (int j=i;j>=0;j--){
                    if (j>0&&array[j-1]>temp){
                        array[j] = array[j-1];
                    }else{
                        array[j] = temp;
                        break;//很重要的一步
                    }
                }
            }

        }
    }
}
