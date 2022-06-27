package dailycodingproblems;

import org.junit.jupiter.api.Test;

public class Depthoftree_27_06_2022test {
    @Test
    public void test1(){
        Depthoftree_27_06_2022.Node root = new Depthoftree_27_06_2022.Node(1);
        root.left = new Depthoftree_27_06_2022.Node(2);
        root.right = new Depthoftree_27_06_2022.Node(3);
        root.left.left = new Depthoftree_27_06_2022.Node(4);
        root.right.left = new Depthoftree_27_06_2022.Node(5);
        root.right.right = new Depthoftree_27_06_2022.Node(6);
        root.right.left.right = new Depthoftree_27_06_2022.Node(7);
        root.right.right.right = new Depthoftree_27_06_2022.Node(8);
        root.right.left.right.left = new Depthoftree_27_06_2022.Node(9);
        System.out.println(Depthoftree_27_06_2022.deepestNode(root));
    }
}
