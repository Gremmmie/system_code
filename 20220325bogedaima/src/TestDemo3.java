/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-25
 * Destination:
 */
class Cat {
    //这些被private修饰的 属性 或者 方法  只能在当前Cat当中使用  安全 类外不可见
    //对类的实现细节 进行隐藏
    private String name;
    private int age;
    private String color;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat() {
       /* this.name = "嘻嘻";
        this.age = 3;
        this.color = "灰色";*/
        System.out.println("不带参数的构造方法！");
    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void eat() {
        System.out.println(this.name+"正在吃饭！");
    }

    public void sleep() {
        System.out.println(this.name+" 正在睡觉！");
    }

    /**
     * 打印我们的属性
     */
    public void show() {
        System.out.println("姓名："+this.name+" 年龄："+this.age+" 颜色："+this.color);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Cat{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 颜色='" + color + '\'' +
                '}';
        ///return "gaobo is cool";
    }
}
public class TestDemo3 {

    //===================类的调用者===================
    public static void main(String[] args) {
        Cat cat3 = new Cat();
        //cat3.name = "嘻嘻";
        cat3.setName("嘻嘻");
        String name = cat3.getName();
        System.out.println(name);
        // cat3.age = 10;
        //cat3.color = "黄色";
        System.out.println(cat3);
    }

    public static void main2(String[] args) {
        Cat cat3 = new Cat();
        //cat3.show();
        Cat cat = null;
        System.out.println(cat3);
    }

    public static void main1(String[] args) {
        Cat cat1 = new Cat("咪咪",4,"橘黄色");
        cat1.show();
        cat1.sleep();

        Cat cat2 = new Cat("咪咪2",14,"橘黄色1");
        cat2.show();
        cat2.sleep();


        Cat cat3 = new Cat();
        cat3.sleep();
        cat3.show();
    }
}
