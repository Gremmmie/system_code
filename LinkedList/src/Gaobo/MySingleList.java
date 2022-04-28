package Gaobo;
/**
 * @author Gremmie102
 * @date 2022/4/28 9:24
 * @purpose :
 */
//import com.sun.org.apache.xpath.internal.objects.XNodeSet;
//import org.omg.CORBA.DATA_CONVERSION;

import java.util.LinkedList;

/**
 * @Author 12629
 * @Date 2022/4/27 19:45
 * @Description：
 */
public class MySingleList {

    static class ListNode {
        public int val;//数值域
        public ListNode next;//存储下一个节点的地址

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;//代表单链表的头结点的引用

    /**
     * 这里只是简单的进行，链表的构造。
     */
    public void createList() {
        ListNode listNode1 = new ListNode(12);
        ListNode listNode2 = new ListNode(23);
        ListNode listNode3 = new ListNode(34);
        ListNode listNode4 = new ListNode(45);
        ListNode listNode5 = new ListNode(56);

        listNode1.next = listNode2;

        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        this.head = listNode1;
    }


    public void display() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    /**
     * 头插法
     * O(1)
     */
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        /*if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }*/
        node.next = this.head;
        this.head = node;
    }

    //尾插法 O(n)
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if(head == null) {
            head = node;
        }else {
            ListNode cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            //cur.next == null;
            cur.next = node;
        }
    }

    /**
     * 任意位置插入,第一个数据节点为0号下标
     * 指定位置插入
     */

    public void addIndex(int index,int data) throws MySingleListIndexOutOfException{
        checkIndexAdd(index);
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size()) {
            addLast(data);
            return;
        }
        ListNode node = new ListNode(data);
        ListNode cur = findIndexSubOne(index);
        node.next = cur.next;
        cur.next = node;
    }

    /**
     * 找到index-1位置的节点
     * @param index
     * @return 该节点的地址
     */
    private ListNode findIndexSubOne(int index) {
        ListNode cur = this.head;
        while (index-1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    private void checkIndexAdd(int index) {
        if(index < 0 || index > size()) {
            throw new MySingleListIndexOutOfException("任意位置插入的时候，index不合法！");
        }
    }

    //查找是否包含关键字key是否在单链表当中  314
    public boolean contains(int key) {
        //head == null
        ListNode cur = this.head;
        //cur != null 说明 没有遍历完 链表
        while (cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){

        if(this.head == null) {
            System.out.println("此时链表为空，不能进行删除！");
            return;
        }

        if(this.head.val == key) {
            //判断 第一个节点是不是等于我要删除的节点
            this.head = this.head.next;
            return;
        }

        ListNode cur = this.head;
        while (cur.next != null) {
            if(cur.next.val == key) {
                //进行删除了
                ListNode del = cur.next;
                cur.next = del.next;
                return;
            }
            cur = cur.next;
        }
    }



    //删除所有值为key的节点
    public void removeAllKey(int key){

    }

    //得到单链表的长度
    public int size(){
        int count = 0;
        ListNode cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void clear(){

    }

}