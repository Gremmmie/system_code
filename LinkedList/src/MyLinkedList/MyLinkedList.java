package MyLinkedList;

import org.w3c.dom.ls.LSException;

/**
 * @author Gremmie102
 * @date 2022/5/12 14:23
 * @purpose :
 */
public class MyLinkedList {
    static class ListNode {
        public int val;
        public ListNode prev;//前驱
        public ListNode next;//后驱

        public ListNode(int val){
            this.val = val;
        }
    }
    public ListNode head;//标记头
    public ListNode last;//标记尾
//    public int usedSize;//链表长度
    public void display(){
        ListNode cur = head;
        while(cur!=null) {
            System.out.println(cur.val+" ");
            cur = cur.next;
        }
    }

    //头插法
    public void addFirst(int val){
        ListNode listNode = new ListNode(val);
        if (head==null){
            head = listNode;
            last = listNode;
        }else {
            head.prev = listNode;
            listNode.next = head;
            head = head.prev;
        }
        return;
    }

    //尾插法
    public void addLast(int val){
        ListNode listNode = new ListNode(val);
        if (head == null){
            head = listNode;
        }else{
            last.next = listNode;
            listNode.prev = last;
        }
        last = listNode;
        return;
    }

    public int size(){
        ListNode cur = head;
        int count=0;
        while(cur!=null){
            cur = cur.next;
            count++;
        }
        return count;
    }


    //任意位置插入
    /**
     * 往指定下标处添加元素
     * @param index 索引，从0开始
     * @param value 要添加的值
     */
    public void addIndex(int index,int value){
        if (index<0||index>size()-1){
            throw new RuntimeException("下标输入异常");
        }
        if (index==0){
            addFirst(value);
            return;
        }
        if (index == size()-1){
            addLast(value);
            return;
        }
        ListNode node = new ListNode(value);
        //cur拿到了index下标的节点
        ListNode cur = searchIndex(index);
        node.prev = cur.prev;
        node.next = cur;
        cur.prev.next = node;
        cur.prev = node;
        return;

    }
    private ListNode searchIndex(int index){
        ListNode cur = head;
        while (index!=0){
            cur = cur.next;
            index--;
        }
        return cur;
    }
    public boolean contain(int key){
        ListNode cur = head;
        while(cur!=null){
            if (cur.val == key){
                return true;
            }else{
                cur = cur.next;
            }
        }
        return false;
    }

    /**
     * 删除第一次出现的key节点
     * @param key
     */
    public void remove(int key){
//        if (head.val == key){
//            head = head.next;
//            head.prev = null;
//        return;
//        }
        ListNode cur = head;
        while(cur!=null){
            if (cur.val == key){
                if (cur == head){
                    head = head.next;
                    head.prev = null;
                }else {
//                  中间和尾巴的情况
                    cur.prev.next = cur.next;
                    if (cur.next!=null){
                        cur.next.prev = cur.prev;
                    }else{
                        last = last.prev;
                    }
                }
                return;
            }else {
                cur = cur.next;
            }
        }
    }
    public void removeAll(int key){
//        if (head.val == key){
//            head = head.next;
//            head.prev = null;
//        return;
//        }
        ListNode cur = head;
        while(cur!=null){
            if (cur.val == key){
                if (cur == head){
                    head = head.next;
                    head.prev = null;
                }else {
//                  中间和尾巴的情况
                    cur.prev.next = cur.next;
                    if (cur.next!=null){
                        cur.next.prev = cur.prev;
                    }else{
                        last = last.prev;
                    }
                }
                cur = cur.next;
            }else {
                cur = cur.next;
            }
        }
    }
}




















