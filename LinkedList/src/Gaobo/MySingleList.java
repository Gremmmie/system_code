package Gaobo;

import java.util.List;

/**
 * @author Gremmie102
 * @date 2022/4/28 9:24
 * @purpose :单链表的实现
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
        ListNode l1 = new ListNode(12);
        ListNode l2 = new ListNode(12);
        ListNode l3 = new ListNode(13);
        ListNode l4 = new ListNode(14);
        ListNode l5 = new ListNode(12);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
//        ListNode listNode1 = new ListNode(12);
//        ListNode listNode2 = new ListNode(23);
//        ListNode listNode3 = new ListNode(34);
//        ListNode listNode4 = new ListNode(45);
//        ListNode listNode5 = new ListNode(56);
//
//        listNode1.next = listNode2;
//
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
        this.head = l1;
    }


    public void display() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    public static void display(ListNode head){
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

    public void reverse() {
        ListNode prev = head.next;
        ListNode cur = prev.next;
        head.next = null;
        while (cur != null) {
            prev.next = head;
            head = prev;
            prev = cur;
            cur = cur.next;
        }
        prev.next = head;
        head = prev;
    }


    public ListNode midNode(){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode KthNode(int k){
        ListNode slow = head;
        ListNode fast = head ;
        while(k>1){
            fast = fast.next;
            k--;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }

    public static ListNode merge(ListNode list1,ListNode list2){
//        ListNode newHead = list1.head.val<=list2.head.val?list1.head:list2.head;
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
//        if (newHead==list1.head){
//            list1.head = list1.head.next;
//        }else{
//            list2.head = list2.head.next;
//        }
        while(list1!=null&&list2!=null){
            if (list1.val<=list2.val){
                tmp.next = list1;
                list1 = list1.next;
            }else{
                tmp.next = list2;
                list2 = list2.next;
            }
            tmp = tmp.next;
        }
        tmp.next = list1 == null ? list2 : list1;
//        if (list1.head==null){
//            tmp.next = list2.head;
//        }else{
//            tmp.next = list1.head;
//        }
        return newHead.next;
    }

    public static void main(String[] args) {
        MySingleList list1 = new MySingleList();
        MySingleList list2 = new MySingleList();
        list1.addIndex(0,1);
        list1.addIndex(1,3);
        list1.addIndex(2,4);
        list1.addIndex(3,5);
        list1.addIndex(4,7);
        list1.display();
        list2.addIndex(0,2);
        list2.addIndex(1,4);
        list2.addIndex(2,6);
        list2.display();
//        ListNode newHead = MySingleList.mergeTwoLists(list1.head,list2.head);
        ListNode newHead2 = MySingleList.merge(list1.head,list2.head);
//        while(newHead!=null){
//            System.out.print(newHead.val+" ");
//            newHead = newHead.next;
//        }
//        System.out.println();
        while(newHead2!=null){
            System.out.print(newHead2.val+" ");
            newHead2 = newHead2.next;
        }
        System.out.println();
    }

    /**
     * 根据给定的X分隔当前的链表
     * @param x
     * @return
     */
    public ListNode partition(int x){
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;

        ListNode cur = head;
        while(cur!=null){
            if (cur.val<x){
                //判断是否第一次插入
                if (bs==null){
                    bs=cur;
                    be=cur;
                }else{
                    be.next=cur;
                    be=be.next;
//                    进行尾插
                }
            }else{
                if (as==null){
                    as=cur;
                    ae=cur;
                }else{
                    ae.next=cur;
                    ae=ae.next;
                }
            }
            cur=cur.next;
        }
        if (bs==null){
//            说明第一个区间没有数据
            return as;
        }

        //让最后一个节点为null
        be.next = as;
        if (as != null) {
            //如果第二区间开头不为空，那结尾的next就要为空
            ae.next=null;
        }
        return bs;

    }

    public static void main4(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.createList();
        mySingleList.display();
        System.out.println(mySingleList.KthNode(2).val);
    }

    public static void main3(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.createList();
        mySingleList.display();
        System.out.println(mySingleList.midNode().val);
    }
    public static void main2(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.createList();
        mySingleList.display();
        mySingleList.reverse();
        mySingleList.display();
    }
    public static void main1(String[] args){
        MySingleList mySingleList = new MySingleList();
        mySingleList.createList();
//        ListNode l1 = new ListNode(12);
//        ListNode l2 = new ListNode(12);
//        ListNode l3 = new ListNode(13);
//        ListNode l4 = new ListNode(14);
//        ListNode l5 = new ListNode(12);
//        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;
//        ListNode head = l1;
        mySingleList.display();
        removeAllKey(12,mySingleList);
        mySingleList.display();
    }
    //删除链表中等于给定值 val 的所有节点
    public static void removeAllKey(int key,MySingleList mySingleList){

        ListNode cur = mySingleList.head.next;
        ListNode sub = mySingleList.head;
        while(mySingleList.head.val==key){
            mySingleList.head=mySingleList.head.next;
//                sub.next=null;
//                cur.next = null;
                cur=mySingleList.head.next;
                sub=mySingleList.head;
        }
        while(cur!=null){
            if (cur.val==key){
                cur=cur.next;
                sub.next=cur;
            }else{
                sub=sub.next;
                cur=cur.next;
            }
        }


//        这个方法时间复杂度有点高
//        while(true){
//            remove(key);
//            if (this.contains(key)){
//                continue;
//            }else break;
//        }
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
        this.head = null;
    }

}