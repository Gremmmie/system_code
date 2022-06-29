import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Gremmie102
 * @date 2022/5/14 11:08
 * @purpose : 二叉树的实现
 */
public class BinaryTree {
    static class TreeNode {
        public char val;
        public TreeNode left;//左孩子的引用
        public TreeNode right;//右孩子的引用
        public TreeNode father;//父节点的引用

        public TreeNode(char val){
            this.val = val;
        }
    }
    public TreeNode root;
    public int nodeSize;
    public void createTree(){
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');

        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        B.father =A;
        C.left = F;
        C.right = G;
        C.father = A;
        E.right = H;
        E.father = B;
        root = A;
    }
    // 前序遍历:遇到就打印A B D E H C F G
    //口诀:根左右
    void preOrder(TreeNode root){
        if (root == null) {
            return;
        }
        System.out.print(root.val + " -> ");
        list.add((int) root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    /**
     * 前序遍历（有返回值版本）
     */
    List<Integer> list;
    public List<Integer> preorderTraversal1(TreeNode root){
        list = new LinkedList<>();
        preOrder(root);
        return list;
    }
    public List<Integer> preorderTraversal2(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        list.add((int)root.val);

        List<Integer> leftTree = preorderTraversal2(root.left);
        list.addAll(leftTree);

        List<Integer> rightTree = preorderTraversal2(root.right);
        list.addAll(rightTree);

        return list;

    }



    /**
     * 层序遍历
     * @param root
     */
    void levelOrder(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            System.out.println(cur.val+" ");
            if (cur.left != null) queue.offer(cur.left);
            if (cur.right != null) queue.offer(cur.right);
        }
    }

    public List<List<Character>> levelOrder_2(TreeNode root){
        List<List<Character>> ret = new ArrayList<>();
        if (root == null) return ret;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Character> list = new ArrayList<>();
            while(size != 0){
                TreeNode cur = queue.poll();
                list.add(cur.val);
                size--;
                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
            }
            ret.add(list);
        }
        return ret;
    }





    /**
     * 子问题思路
     * @param root
     * @return
     */
    public List<Character> preorderTraversal_2(TreeNode root){
        List<Character> ret = new ArrayList<>();
        if (root == null) return ret;
        ret.add(root.val);

        List<Character> leftTree = preorderTraversal_2(root.left);
        ret.addAll(leftTree);

        List<Character> rightTree = preorderTraversal_2(root.right);
        ret.addAll(rightTree);

        return ret;
    }

    /**
     * 遍历思路
     * @param root
     */
    public static int leafSIze = 0;
    void getLeafNode_1(TreeNode root){
//        TreeNode curLeft = root.left;
//        TreeNode curRight = root.right;
        if (root == null) return ;
        if (root.left == null && root.right == null){
            leafSIze++;
        }
        getLeafNode_1(root.left);
        getLeafNode_1(root.right);

    }
    /**
     *获取叶子节点的个数：子问题
     */
    int getLeafNode_2(TreeNode root) {
        if (root == null){
            return 0;
        }
        if (root.left==null&&root.right==null){
            return 1;
        }
        return getLeafNode_2(root.left)+getLeafNode_2(root.right);
    }

    int getKthLevelNodeCount(TreeNode root,int k){
        if (root == null) return 0;
        if (k == 0) return 1;
        return getKthLevelNodeCount(root.left,k-1) +
                getKthLevelNodeCount(root.right,k-1);
    }

    /**
     * 我的版本
     * @param root
     * @return
     */
    int getHeight_1(TreeNode root){
        if (root==null) return 0;
        if (root.left == null&&root.right == null){
            return 1;
        }
        int leftH = getHeight_1(root.left);
        int rightH = getHeight_1(root.right);
        return Math.max(leftH,rightH)+1;
    }

    /**
     * 博哥的版本
     * @param root
     * @return
     */
    int getHeight_2(TreeNode root){
        if (root==null) return 0;
        int leftH = getHeight_2(root.left);
        int rightH = getHeight_2(root.right);
        return leftH > rightH ? leftH+1 : rightH+1;
    }

    /**
     * 查找指定的元素是否在二叉树中
     * @param root
     * @param val
     * @return
     */
    TreeNode find(TreeNode root,char val){
        if (root == null) return null;
        if (root.val == val) return root;

        TreeNode ret = find(root.left,val);

        if (ret!=null) return ret;

        ret = find(ret.right,val);

        if (ret!=null) return ret;

        return null;
    }



    /**
     * 子问题 思路
     * @param root
     */
    void size(TreeNode root){
        if (root == null) return;
        nodeSize++;
        size(root.left);
        size(root.right);
    }





    //左视图
    public List<Character> preorderTraversal_1(TreeNode root){
        List<Character> ret = new ArrayList<>();
        if (root == null) return ret;
        TreeNode cur = root;
        while(cur!=null){
            ret.add(cur.val);
            if (cur.left!=null){
                cur = cur.left;
            }else if (cur.right!=null){
                cur = cur.right;
            }else if(cur != root){
                cur = cur.father;
            }
        }
        return ret;
    }

    // 中序遍历:D B E H A F C G
    void inOrder(TreeNode root){
        if (root == null) {
            return;
        }

        preOrder(root.left);
        System.out.print(root.val + " -> ");
        preOrder(root.right);
    }

    // 后序遍历
    void postOrder(TreeNode root){
        if (root == null) {
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.val + " -> ");
    }

    boolean isSameTree(TreeNode root1,TreeNode root2){
        if (root1!=null&&root2==null) return false;

        if (root1==null&&root2!=null) return false;

        if (root1==null&&root2==null) return true;

        if (root1.val != root2.val) return false;

        return isSameTree(root1.left,root2.left)
                &&isSameTree(root1.right,root2.right);
    }

    /**我们设root的为s ,subRoot的为t，每经过root上的一个节点，都要遍历一遍
     * subRoot，所以时间复杂度为s*t
     * 是不是子树 时间复杂度
     */
    boolean isSubTree(TreeNode root,TreeNode subRoot){
        if (root == null) return false;

        if (isSameTree(root,subRoot)) return true;

        if (isSubTree(root.left,subRoot)) return true;

        if (isSubTree(root.right,subRoot)) return true;

        return false;
    }


    boolean isCompleteTree(TreeNode root){
        if (root==null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if (cur!=null){
                queue.offer(cur.left);
                queue.offer(cur.right);
            }else{
                break;
            }
        }
        //判断队列中是否含有非空的元素
        while (!queue.isEmpty()){
            TreeNode cur = queue.peek();
            if (cur == null){
                queue.poll();
            }else {
                return false;
            }
        }
        return true;
    }

    //求高度
    public int height(TreeNode root){
        if (root!=null){
            return 0;
        }
        int leftH = height(root.left);
        int rightH = height(root.right);

        //判断条件添加一个
        if (leftH>=0 && rightH >= 0
                && Math.abs(leftH-rightH)<=1){
            return Math.max(rightH,leftH)+1;
        }else {
         return -1;
        }
    }

    //所有左树和右树的高度差之小于等于1
    public boolean isBalanced(TreeNode root){
      if (root == null) return true;
//      这种写法时间复杂度太高了
//      int leftH = height(root.left);
//      int rightH = height(root.right);
//        return Math.abs(leftH - rightH) <= 1
//                && isBalanced(root.left) &&
//                isBalanced(root.right);
        return height(root) >= 0;
    }

    //对称二叉树
    public boolean isSymmetricChild(TreeNode leftTree,TreeNode rightTree){
        if (leftTree==null&&rightTree==null) return true;
        if ((leftTree!=null&&rightTree==null)
            ||(leftTree==null&&rightTree!=null)) return false;
        if (leftTree.val != rightTree.val) return false;
        else return isSymmetricChild(leftTree.left,rightTree.right)
                    &&isSymmetricChild(leftTree.right,rightTree.left);
    }
    public boolean isSymmetric(TreeNode root){
        if (root == null) return true;
        return isSymmetricChild(root.left,root.right);
    }


    public static int i = 0;
    public static TreeNode createTree(String string){
        TreeNode root = null;

        if (string.charAt(i) != '#'){
            root = new TreeNode(string.charAt(i));
            i++;
            root.left = createTree(string);
            root.right = createTree(string);
        }else {
            i++;
        }
        return root;
    }
    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.val+" ");
        inorder(root.right);
    }
}














