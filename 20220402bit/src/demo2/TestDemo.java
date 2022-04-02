package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-02
 * Destination:
 */
class Animal {
    public String name;
    public int age;

    public void eat(){
        System.out.println(this.name+"正在吃饭(父类)");
    }
}

class Cat extends Animal {
    public String fur;

    public void mew(){
        System.out.println(this.name+"正在叫");
    }
}


public class TestDemo {


    public static Animal func2(){
//        return new Animal();
        return new Cat();
    }


//    以传参的方式完成向上转移
    public static void func(Animal animal) {

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        func(new Cat());
    }



    public static void main2(String[] args) {
//        Cat cat = new Cat();
//        Animal animal = cat;
        Animal animal = new Cat();//向上转型
        animal.name = "mimi";
        animal.eat();
//        animal.mew();  只能访问父类特有的方法，父类中没有mew这个方法
    }
    public static void main1(String[] args) {
        Cat cat1 = new Cat();
        cat1.mew();

        Animal animal = new Animal();
//        animal.mew();//这里 通过父类引用 只能访问父类自己特有的方法
    }
}
