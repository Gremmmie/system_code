/**
 * @author Gremmie102
 * @date 2022/7/2 19:36
 * @purpose : 优先级队列
 * 堆分为大根堆和小根堆
 * 小根堆：每个根节点都小于它的左孩子和右孩子
 * 大根堆：每个根节点都大于它的左孩子和右孩子
 * 向下调整的时间复杂度为O(log2(以2为底)n)
 */
public class Test {
    public static void main(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] array = {27,15,19,18,28,34,65,49,25,37};
        testHeap.createHeap(array);
        System.out.println("hahaha");
    }
}
