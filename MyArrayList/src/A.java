/**
 * @author Gremmie102
 * @date 2022/4/26 9:53
 * @purpose :
 */
public class A <T>{
    T value;
    A(T value){
        this.value = value;
    }
    T get(){
        return value;
    }

    public static void main(String[] args) {
        A<String> stringA = new A<>("bit葛玉礼");
        System.out.println(stringA.get());
    }
}
