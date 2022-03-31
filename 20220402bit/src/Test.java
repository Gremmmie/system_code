/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-02
 * Destination:
 */
class Animal {
    private String name;
    private int age;


    static {
        System.out.println("animal的静态代码块");
    }
    {
        System.out.println("animal的实例代码块");
    }
    public Animal(){
        System.out.println("animal的不带参数的构造方法");
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("animal的带两个参数的构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println(this.name+"正在吃饭");
    }

}
class Cat extends Animal {
    public String fur;

    static {
        System.out.println("猫的静态代码块");
    }
    {
        System.out.println("猫的实例代码块");
    }
    public Cat() {
        super();
        System.out.println("猫的不带参数的构造函数");
    }

    public Cat(String name, int age, String fur){
        super(name,age);//显示调用父类的构造方法
        //来初始化子类从父类继承过来的东西
        this.fur = "black";
        System.out.println("猫的带三个参数的构造方法");
    }
    public void mew() {
//        System.out.println(this.name+"正在叫");不是没有被继承，而是不讷
        System.out.println(this.getName()+"正在叫");
    }
}


public class Test {


    public static void main(String[] args) {
        Cat cat1 = new Cat("mimi",8,"black");
        cat1.mew();
        cat1.eat();
    }
}
