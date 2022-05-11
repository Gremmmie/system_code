package DoubleNode;

/**
 * @author Gremmie102
 * @date 2022/5/9 17:3
 * @purpose :
 */
public class DoubleNode {
    private int index;
    private String name;
    private DoubleNode next;
    private DoubleNode front;
    private DoubleNode hear;

    public DoubleNode() {
    }

    public DoubleNode(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public DoubleNode crateHeard() {
        this.hear=new DoubleNode(-1,"heard");
        return hear;
    }
    //添加元素到链表尾部
    public void addNextNode(DoubleNode next) {
        DoubleNode empt = hear.next;
        DoubleNode frontNode=hear;
        while (empt != null) {
            frontNode=empt;
            empt = empt.next;
        }
        frontNode.next=next;
        next.front=frontNode;
        System.out.println("添加成功到尾部");

    }

    //添加到链表头部
    public void addFront(DoubleNode front) {
        DoubleNode empt = hear.next;
        front.front=hear;
        hear.next=front;
        front.next=empt;
        empt.front=front;
        System.out.println("添加成功到头部");
    }

    //删除指定链表
    public void deletedNode(int index) {
        DoubleNode empt = hear.next;
        while (empt != null) {
            if (empt.index == index) {
                empt.front.next = empt.next;
                if( empt.next!=null){
                    empt.next.front = empt.front;
                    break;
                }
                break;
            }
            empt=empt.next;
        }
        System.out.println("删除成功");

    }

    /**
     * 从前遍历
     */
    public void beforList(){
        DoubleNode empt = hear.next;
        while (empt!=null){
            System.out.println(empt);
            empt=empt.next;

        }

    }
    public void  afterList(){
        DoubleNode empt = hear.next;
        DoubleNode lastNode=null;
        while (empt!=null){
            lastNode=empt;
            empt=empt.next;
        }
        while (lastNode!=null){
            if(lastNode.index!=-1) {
                System.out.println(lastNode);
            }
            lastNode=lastNode.front;
        }
    }

    //插入指定位置后边如果没有找到插入最后
    public void  addAndIndex(int index,DoubleNode node){
        DoubleNode empt = hear.next;
        boolean flag=true;
        while (empt!=null){
            if(index==empt.index){
                node.next=empt.next;
                empt.next.front=node;
                empt.next=node;
                node.front=empt;
                flag=false;
                break;
            }
            empt=empt.next;
        }
        if(flag){
            addNextNode(node);
        }
        System.out.println("添加成功");
    }


    @Override
    public String toString() {
        return "DoubleNode{" +
                "index=" + index +
                ", name='" + name +
                '}';
    }
}

