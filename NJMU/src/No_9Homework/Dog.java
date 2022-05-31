package No_9Homework;

/**
 * @author Gremmie102
 * @date 2022/5/31 9:07
 * @purpose :
 */
class  Animal {
    Animal() {
//        System.out.print ("Animal--");
    }
    void eat(){
        System.out.println("吃东西");
    }
}

public  class  Dog  extends  Animal {
    Dog() {
//        System.out.print ("Dog --");
    }
    void eat(){
        System.out.println("吃狗粮");
    }

    public static void main(String[] args) {
        Dog  a= new  Dog();
        Animal b = new Dog();
        a.eat();
        b.eat();
//      左编译，右执行
    }

}