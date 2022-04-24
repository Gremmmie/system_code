/**
 * @author Gremmie102
 * @date 2022/4/22 12:56
 * @purpose :
 */
public class daxia{
    String name;
    String bangpai;
    int age;
    public daxia(String name,String bangpai,int age){
        this.name=name;
        this.bangpai=bangpai;
        this.age=age;
    }

    @Override
    public String toString() {
        return "daxia{" +
                "name='" + name + '\'' +
                ", bangpai='" + bangpai + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args){
        daxia dx=new daxia("dahua","hauhua",18);
        System.out.println(dx);
    }
}