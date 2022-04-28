/**
 * @author Gremmie102
 * @date 2022/4/27 15:44
 * @purpose : 类型擦除的实验
 */
class MyGeneric<T> {
    T value;
    public MyGeneric(){

    }
    public MyGeneric(T val){
        value = val;
    }
    public T getValue(){
        return value;
    }
    public void setValue(T val){
        value = val;
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        MyGeneric<String> generic1 = new MyGeneric<>("Gremmie");
        MyGeneric<Integer> generic2 = new MyGeneric<>(19);

        if (generic1.getClass()==generic1.getClass()){
            System.out.println("Their class is same");
        }else {
            System.out.println("Their class is different");
        }
    }
}
