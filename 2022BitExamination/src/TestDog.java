/**
 * @author Gremmie102
 * @date 2022/4/21 8:34
 * @purpose :
 */
class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
}
class Dog extends Animal{
    public void move(){
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}
public class TestDog{
    public static void main(String[] args) {
        char myChar = 'g';
        String myStr = Character.toString(myChar);
        System.out.println("String is: "+myStr);
        myStr = String.valueOf(myChar);
        System.out.println("String is: "+myStr);
    }
//    public static void main(String args[]){
//        Animal a = new Animal();
//        Animal b = new Dog();
//        a.move();
//        b.move();
//        if (b instanceof Dog){
//            ((Dog) b).bark();
//        }
//
//    }
}