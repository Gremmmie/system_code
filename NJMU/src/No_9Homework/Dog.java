package No_9Homework;

/**
 * @author Gremmie102
 * @date 2022/5/31 9:07
 * @purpose :
 */
class  Animal {
    Animal() {
        System.out.print ("Animal--");
    }
}

public  class  Dog  extends  Animal {
    Dog() {
        System.out.print ("Dog --");
    }

    public static void main(String[] args) {
        Dog  snoppy= new  Dog();
    }

}