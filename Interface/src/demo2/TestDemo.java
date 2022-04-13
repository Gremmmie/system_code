package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:Gremmie
 * Date: -04-13
 * Destination:利用Clonable的接口实现clone方法，克隆含对象的对象
 */
class Money implements Cloneable{
    public double money = 19.9;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public int id = 1234;
    public Money m = new Money();

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tmp = (Person) super.clone();
        tmp.m = (Money) this.m.clone();
        return tmp;
        //return super.clone();
    }

}
public class TestDemo {

    public static void main(String[] args) {
        Object o = new Person();

        Object o2 = new Money();


    }

    public static void main1(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person)person1.clone();
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
        System.out.println("=========================");
        person2.m.money = 99.99;
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
    }
}