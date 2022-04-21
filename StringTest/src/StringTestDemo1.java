/**
 * @author Gremmie102
 * @date 2022/4/21 15:49
 * @purpose : 比较字符串引用
 */
public class StringTestDemo1 {


    public static void main(String[] args) {
        String str = "   hello Gremmie  " ;
        System.out.println("["+str+"]");
        System.out.println("["+str.trim()+"]");
    }
    public static void main10(String[] args) {
        String str = "helloGremmie" ;
        System.out.println(str.substring(5));//是从下标为5截到最后的
        System.out.println(str.substring(0, 5));//下标索引范围左闭右开，[0,5)
    }

    public static void main9(String[] args) {
        String str = "name=Gremmie&age=19" ;
        String[] result = str.split("&") ;
        for (int i = 0; i < result.length; i++) {
            String[] temp = result[i].split("=") ;
            System.out.println(temp[0]+" = "+temp[1]);
        }
    }
    public static void main8(String[] args) {
        String str = "106.14.57.10" ;
        String[] result = str.split("\\.") ;
        for(String s: result) {
            System.out.println(s);
        }
    }
    public static void main7(String[] args) {
        String str = "hello world hello Gremmie" ;
        String[] result = str.split(" ",2) ;
        for(String s: result) {
            System.out.println(s);
        }
    }
    public static void main6(String[] args) {
        String str = "helloworld" ;
        System.out.println(str.replaceAll("l", "_"));
        System.out.println(str.replaceFirst("l", "_"));
    }

    public static void main5(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("ac");
        String s3 = new String("Abc");
        String s4 = new String("abcdef");
        System.out.println(s1.compareToIgnoreCase(s2));//不同，输出字符差值-1
        System.out.println(s1.compareToIgnoreCase(s3));//相同，输出0
        System.out.println(s1.compareToIgnoreCase(s4));//前k个字符完全相同，输出长度差-3

    }

    public static void main4(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("ac");
        String s3 = new String("abc");
        String s4 = new String("abcdef");
        System.out.println(s1.compareTo(s2));//不同，输出字符差值-1
        System.out.println(s1.compareTo(s3));//相同输出0
        System.out.println(s1.compareTo(s4));//前k个字符完全相同，输出长度差值-3
    }


    public static void main3(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = new String("HELLO");

        //s1,s2,s3引用的是三个不同的对象，因此==的比较结果都是false
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//false

        //equals比较：String对象中的逐个字符
        //虽然s1和s2引用的不是同一个对象，但是两个对象中放置的内容，所以输出true
        //s1与s3引用的不是同一个对象，而且两个对象中内容也不同，因此输出false
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//false


    }

//    public boolean equals(Object anObject){
//        //1.先检测this和anObject是否为同一个对象比较，如果是的化则返回true
//        if(this == anObject){
//            return true;
//        }
//
//        //2.检测anObject是否为String类型的对象，如果是的话那就继续比较
//        //不是的话那就返回false
//        if (anObject instanceof String){
//            String anotherString = (String)anObject;
//            int n = value.length;

            //3.判断调用对象的this和anObject两个字符串的长度是否相同
//            if (n == anotherString.value.length){
//                char v1[] = value;
//                char v2[] = anotherString.value;
//                int i = 0;

//                //4.按照字典顺序，从前往后逐个字符进行比较
//                while(n-- != 0){
//                    if (v1[i] != v2[i])
//                        return false;
//                    i++;
//                }
//                return true;
//            }
//        }
//        return false;
//    }



    public static void main2(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;

        //对于基本类型变量，==比较两个变量中存储的值是否相同
        System.out.println(a==b);//false
        System.out.println(a==c);//true
        //对于引用型变量，==比较两个引用变量引用的是否为同一个对象
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = new String("world");
        String s4 = s1;
        s4.equals(s1);
        System.out.println(s1==s2);//false
        System.out.println(s2==s3);//false
        System.out.println(s1==s4);//true
    }


    public static void main1(String[] args) {
        //s1和s2引用的是不同的对象，s1和s3引用的是同一个对象
        String s1 = new String("hello");
        String s2 = new String("world");
        String s3 = s1;

        System.out.println(s1.length());
        //获取字符串长度--输出5
        System.out.println(s1.isEmpty());
        //判断字符串长度是否为0，即是否为空
    }
}
