import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] array = s.split(" ");
            for (int i=0;i<array.length;i++){
                set.add(array[i]);
            }
        }
        System.out.println(set.size());
    }
}
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNextInt()) {
//            int n = scanner.nextInt();
//            func(n);
//        }
////        int N = scanner.nextInt();
////        System.out.print(solution(N));
//    }
//    public static void func(int n){
//        int f1 = 0;
//        int f2 = 1;
//        int f3 = -1;
//        while (f3 < n){
//            f3 = f1 + f2;
//            f1 = f2;
//            f2 = f3;
//        }
//        System.out.println(Math.min(n-f1,f2-n));
//    }
//    public static int solution(int N){
//        int[] F = new int[1000];
//        F[0] = 0;
//        F[1] = 1;
//        for (int i = 2;i<F.length;i++){
//            F[i] = F[i-1] + F[i-2];
//        }
//        int j = 0;
//        while(N>F[j]&&N<F[j+1]){
//            j++;
//        }
//        if(N==F[j]) return 0;
//        if (N-F[j]>=F[j+1]-N){
//            return F[j+1]-N;
//        }else return N-F[j];
//
//    }