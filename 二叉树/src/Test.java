import java.util.ArrayList;
import java.util.List;

/**
 * @author Gremmie102
 * @date 2022/5/14 12:26
 * @purpose :
 */
public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createTree();
        List<Character> list = binaryTree.preorderTraversal_1(binaryTree.root);
        System.out.println(list.toString());
        binaryTree.size(binaryTree.root);
        System.out.println(binaryTree.nodeSize);
    }
}
