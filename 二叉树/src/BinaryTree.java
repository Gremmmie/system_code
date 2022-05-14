import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

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
        preOrder(root.left);
        preOrder(root.right);
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
        return Math.max(getHeight_1(root.left),getHeight_1(root.right))+1;
    }
    int getHeight_2(TreeNode root){
        if (root==null) return 0;
        int leftH = getHeight_2(root.left);
        int rightH = getHeight_2(root.right);
        return leftH > rightH ? leftH+1 : rightH+1;
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





    //TODO:非递归遍历
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
            }else{

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

}
