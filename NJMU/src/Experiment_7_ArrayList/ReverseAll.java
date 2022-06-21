package Experiment_7_ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Gremmie102
 * @date 2022/5/8 15:11
 * @purpose : 反转文件
 */
public class ReverseAll {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(new File("E:\\JAVAcode\\gyljava\\NJMU\\NJMU.iml"));
        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            Scanner scanner1 = new Scanner(string);
            ArrayList<String> arrayList1 = new ArrayList<String>();
            while (scanner1.hasNext()) {
                arrayList1.add(scanner1.next());
            }
//            ReverseAll.reverse(arrayList1);
            for (int i=0;i<arrayList1.size()/2;i++){
                String tmp= arrayList1.get(i);
                arrayList1.set(i,arrayList1.get(arrayList1.size()-i-1));
                arrayList1.set(arrayList1.size()-i-1,tmp);
            }
            arrayList.add(arrayList1);
        }
//        ReverseAll.reversePlus(arrayList);
        for (int i=0;i<arrayList.size()/2;i++){
            ArrayList<String> tmp= arrayList.get(i);
            arrayList.set(i,arrayList.get(arrayList.size()-i-1));
            arrayList.set(arrayList.size()-i-1,tmp);
        }
        for (int i =0;i<arrayList.size();i++){
            for (int j=0;j<arrayList.get(i).size();j++){
                System.out.print(arrayList.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static void reverse(ArrayList<String> arrayList){
        for (int i=0;i<arrayList.size()/2;i++){
            String tmp= arrayList.get(i);
            arrayList.set(i,arrayList.get(arrayList.size()-i-1));
            arrayList.set(arrayList.size()-i-1,tmp);
        }
    }
    public static void reversePlus(ArrayList<ArrayList<String>> arrayList){
        for (int i=0;i<arrayList.size()/2;i++){
            ArrayList<String> tmp= arrayList.get(i);
            arrayList.set(i,arrayList.get(arrayList.size()-i-1));
            arrayList.set(arrayList.size()-i-1,tmp);
        }
    }
}
