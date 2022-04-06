package AnimalTest;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-07
 * Destination:
 */
////////////////分割线/////////////////////
public class TestAnimal {
    //编译器在编译代码的时候，并不知道要调用Dog还是Cat中eat的方法
    //等程序运行起来之后，形参a引用的具体对象确定后，才知道调用哪个方法
    //此时要注意：此处的形参类型必须是父类类型才可以，也就是向上转型
    public static void eat(Animal animal){
        animal.eat();
    }
    public static void main(String[] args){
        Cat cat = new Cat("元宝",2);
        Dog dog = new Dog("小七",1);

        eat(cat);
        eat(dog);
    }
}
