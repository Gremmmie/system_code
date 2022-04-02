/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:葛玉礼
 * Date: -04-03
 * Destination:实例内部类的演示
 */
public class OutClass {
    private int a;
    static int b;
    int c;
    public void methodA(){
        a = 10;
        System.out.println(a);
    }

    public static void methodB(){
        System.out.println(b);
    }

    //成员内部类:未被static修饰
    class InnerClass{
        int c;
        int d=10;
        public void methodInner(){
            //在内部类当中可以直接访问外部类中 任意访问限定符修饰的成员
            a = 100;
            b = 200;
            methodA();
            methodB();

            //如果外部类和内部类中具有相同名称成员时,优先访问内部类自己的成员
            c = 300;
            System.out.println(c);

            //如果要访问外部类同名成员的时候,必须要满足:外部类名称.this.同名成员名
            OutClass.this.c = 400;
            System.out.println(OutClass.this.c);
        }
    }

    public static void main(String[] args) {
        //外部类:对象创建以及成员的访问
        OutClass outClass = new OutClass();
        System.out.println(outClass.a);
        System.out.println(outClass.b);
        System.out.println(outClass.c);
        outClass.methodA();
        outClass.methodB();

        System.out.println("======内部类的访问=======");
        //要访问实例内部类中的成员,必须要创建实例内部类的对象
        //而实例内部类定义与外部类成员定义位置相同,因此创建实例内部类时必须要借助外部类

        //创建内部类
        OutClass.InnerClass innerClass1 = new OutClass().new InnerClass();

        //上面的写法又臭又长还特别怪,我们也可以先把外部类对象先创建出来,然后再建立内部类对象
        OutClass.InnerClass innerClass2 = outClass.new InnerClass();
//      这里的outClass是我们在上面已经创建好的一个外部类的对象,我们直接用
        innerClass2.methodInner();
    }
}
