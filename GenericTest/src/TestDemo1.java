/**
 * @author Gremmie102
 * @date 2022/4/27 14:52
 * @purpose :
 */
class MyObjectArray<E extends Number>{
    public Object[] array = new Object[3];

    public Object get(int index){
        return this.array[index];
    }
    public void set(int index, int value){
        this.array[index] = value;
    }
    public void set(int index, String value){
        this.array[index] = value;
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        MyObjectArray myArray= new MyObjectArray();
        myArray.set(0,10);
        myArray.set(1,"Gremmie");
        String ret = (String) myArray.get(1);
        System.out.println(ret);
    }
}
