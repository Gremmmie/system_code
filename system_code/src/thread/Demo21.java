package thread;

/**
 * @author Gremmie102
 * @date 2022/7/28 10:44
 * @purpose :
 */
class MyBlockingDeque{
    //假定最大是1000个元素,当然也可以设定成可配置的
    private int[] items = new int[1000];
    //队首的位置
    private int head = 0;
    //队尾的位置
    private int tail = 0;
    //队列的元素个数
    private int size = 0;

    //入队列
    public void put(int value) {
        if (size == items.length) {
            //队列已满,无法插入
            return;
        }
        items[tail] = value;
        tail++;
        if (tail == items.length) {
            //注意,如果tail达到数组末尾a
            tail = 0;
        }
        size++;
    }

    //出队列
    public Integer take(){
        if (size == 0){
            //队列为空,无法出队列
            return null;
        }
        int ret = items[head];
        head++;
        if(head == items.length){
            head = 0;
        }
    }
}
public class Demo21 {
}
