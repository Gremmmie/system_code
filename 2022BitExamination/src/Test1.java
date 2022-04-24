import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int i,j=0;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] ch = str.toCharArray();
        char[] ch1 = new char[ch.length];
        ch1[0]=ch[0];
//        str.length()*j
        for(i=1;i<str.length();i++){
            int k =0;
            for (int n = 0; n <= j; n++){
                if (ch[i]==ch1[j]){
                    break;
                }
                 k=1;
            }
            if (k==0){
                continue;
            }else{
                j++;
                ch1[j]=ch[i];
            }
        }
        boolean sort = false;
//        Math.sqrt(ch1.length)*ch1.length-1
        for (int a = 0;a<Math.sqrt(ch1.length);a++){

            for (int b = 1;b<ch1.length-1;b++) {
                if (ch1[b - 1] > ch1[b]) {
                    int temp = ch1[b - 1];
                    ch1[b - 1] = ch1[b];
                    ch1[b] = (char) temp;
                } else if (b == ch1.length - 1) {
                    sort = true;
                }
            }
            if (sort == true){
                break;
            }
        }
        System.out.println(ch1);
    }
}
//Arrays.sort(ch1,0,ch1.length-1)