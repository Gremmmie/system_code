package DoubleNode;

/**
 * @author Gremmie102
 * @date 2022/5/11 15:22
 * @purpose :双链表的实现
 */
public class DoubleLinkedList<T> implements LinearTable<T>{
    private Node head;//头节点
    private Node tail;//尾节点
    private int usedSize;

    class Node{
        Node prev;
        T data;
        int data2;
        Node next;

        public Node(Node prev,T data,Node next){
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
        public Node(T data){
            this.data = data;
        }
        public Node(int data){
            this.data2 = data;
        }
    }

    @Override
    public void add(T data) {//增加的方法，默认尾插法
        Node newNode = new Node(data);
        if (this.head==null){
            head = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        usedSize++;
    }

    @Override
    public void removeIndex(int index) {
        if (head==null){
            throw new RuntimeException("没东西可删了抱歉哈哈哈");
        }
        ensureIndex(index);
        Node cur = node(index);//将当前下标的节点赋给cur
        Node next = cur.next;
        Node prev = cur.prev;
        if (prev == null){//判断删除的节点是否为第一个节点
            head = next;
        }else {
            prev.next = next;
            prev = null;
            //TODO:这里的null似乎有些问题
        }
        if (next == null){
            tail=null;
        }else{
            next.prev = null;
            next = null;
        }
        usedSize--;
    }


    public  void create(){
        Node l1 = new Node(1);
        Node l2 = new Node(2);
        Node l3 = new Node(2);
        l1.next = l2;
        l2.prev = l1;
        l2.next = l3;
        l3.prev = l2;
        head = l1;
        tail = l3;
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();
        doubleLinkedList.create();

    }
    public void display(){
//        for (int i=0;i<)TODO:这里的展示还没写
    }
//    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        linkedList.removeAll()
//    }

    @Override
    public void removeKey(T key) {
        Node pre = head;
        Node cur = head;
        while(head.data!=key){
            head = head.next;
            head.prev = null;
        }
        cur = cur.next;
        while(cur!=null){
            if (cur.next==null){
                return;
            }
            if (cur.data==key){
                cur = cur.next;
            }else{
                pre.next = cur;
            }
        }

    }

    @Override
    public void removeAll(T key) {

    }

    public Node node(int index){
        //采用从前到后或从后到前的方法寻找某下标节点
        //查找指定下标节点，因双链表可从前至后遍历也可从后至前遍历，
        //故我们可从中间下标划分，之前的从前至后遍历，
        // 之后的从后至前遍历，减少遍历次数
        if (index<usedSize>>1){//usedSize向右移位，也可以认为是usedSized/2
            Node cur = head;
            for (int i=0;i<index;i++){
                cur = cur.next;
            }
            return cur;
        }else {
            Node cur = tail;
            for (int i=usedSize-1;i>index;i++){
                cur = cur.prev;
            }
            return cur;
        }
    }
    public void ensureIndex(int index){
        if (index<0||index>=usedSize){
            throw new RuntimeException("下标越界异常");
        }
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public boolean contains(T data) {
        return false;
    }

    @Override
    public Object set(int index, T newData) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public T[] toArray() {
        return null;
    }
}
