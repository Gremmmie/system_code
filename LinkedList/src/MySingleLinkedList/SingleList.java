package MySingleLinkedList;

import java.util.List;

/**
 * @author Gremmie102
 * @date 2022/4/28 10:07
 * @purpose :单链表的实现
 */
// 1、无头单向非循环链表实现
public class SingleList {


//    节点静态内部类
    static class ListNode{
        int val;
        SingleList next;
        public ListNode(int val){
            this.val = val;
        }
    }
    //头插法
    public void addFirst(int data){

    }

    //尾插法
    public void addLast(int data){

    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){

    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){

    }
    //删除所有值为key的节点
    public void removeAllKey(int key){

    }
    //得到单链表的长度
    public int size(){
        return -1;
    }
    public void display(){

    }
    public void clear(){

    }
}

