/**
 * @author Gremmie102
 * @date 2022/7/2 20:20
 * @purpose :
 */
public class TestHeap {
    public int [] elem;
    public int usedSize;

    public TestHeap(){
        this.elem = new int[10];
    }

    public void createHeap(int[] array){
        //这一步不算是必须的，这里只是我们准备数据
        for (int i=0;i<array.length;i++){
            elem[i] = array[i];
            usedSize++;
        }
        for (int p=(usedSize-1-1)/2;p>=0;p--){
            shiftDown(p,usedSize);//从下往上
        }
    }

    public static void main(String[] args) {
        System.out.println(judge("abaa"));
    }
    public static boolean judge (String str) {
        // write code here
        if(str.length() == 0 || str.length() == 1)
            return true;
        int left = 0;
        int right = str.length()-1;
        while(left<=right){
            if(str.charAt(left++) != str.charAt(right--))
                return false;
        }
        return true;
    }
    /**
     *
     * @param root 是每棵子树的根节点的下标
     * @param len 是每棵子树调整结束的限制条件，不能大于len
     */
    private void shiftDown(int root,int len){
        int parent = root;
        int child = 2*parent+1;
//        float f = 4.0F;
//        char s = '\u0639';
        while(child<len){
            //如果有右孩子，找到左右孩子的最大值
            if (elem[child]<elem[child+1]
                    && child+1<len){
                child++;
            }//到这里child下标一定保存的是左右孩子最大值的下标
            //接下来，孩子的最大值和根节点去比较大小
            if (elem[child]>elem[parent]){
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                parent = child;//开始更新，继续看下面的子树是不是大根堆
                child = 2*parent+1;

            }
        }
    }
}
