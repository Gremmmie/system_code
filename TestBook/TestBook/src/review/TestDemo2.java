package review;

/**
 * @Author 12629
 * @Date 2022/4/12 19:10
 * @Description：
 */
class Money implements Cloneable{
    public double money = 19.99;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public int age = 19;
    public Money m = new Money();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tmp = (Person)super.clone();
        tmp.m = (Money) this.m.clone();
        return tmp;
        //return super.clone();
    }
}
public class TestDemo2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();

       Person person2 = (Person) person1.clone();

        System.out.println(person1.m.money);
        System.out.println(person2.m.money);

        System.out.println("=========修改========");
        person2.m.money = 899.99;
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);


    }
}
