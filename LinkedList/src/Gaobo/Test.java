package Gaobo;

/**
 * @author Gremmie102
 * @date 2022/4/28 9:27
 * @purpose :
 */
public class Test {


    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();//这就是一个单链表
       /* mySingleList.addFirst(12);
        mySingleList.addFirst(23);
        mySingleList.addFirst(34);
        mySingleList.addFirst(45);
        mySingleList.addFirst(56);
        mySingleList.display();
*/
        mySingleList.addLast(997);
        mySingleList.display();
        System.out.println("==============");

        mySingleList.remove(997);

        mySingleList.display();

        /*try {
            mySingleList.addIndex(1,8888);
        }catch (MySingleListIndexOutOfException e) {
            e.printStackTrace();
        }
        mySingleList.display();*/
    }

    public static void main1(String[] args) {
        MySingleList mySingleList = new MySingleList();//这就是一个单链表
        mySingleList.createList();
        System.out.println("========");
        mySingleList.display();
        System.out.println("========");

        boolean ret = mySingleList.contains(561);
        if(ret) {
            System.out.println("存在这个节点的！");
        }else {
            System.out.println("不存在这个节点的！");
        }
        System.out.println("========");
        int len = mySingleList.size();
        System.out.println(len);
        System.out.println("========");

        mySingleList.addFirst(99);
        mySingleList.display();

    }
}