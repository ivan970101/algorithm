package structure;


class TreeNode {
    int val;
    TreeNode left, right;
}

class TreeNode1 {
    int val;
    TreeNode1[] child;
}

public class TreeOpt {
    private void traverseTwo(TreeNode treeNode) {
        System.out.println(treeNode.val);
        if (treeNode.left != null) {
            traverseTwo(treeNode.left);
        }
        if (treeNode.right != null) {
            traverseTwo(treeNode.right);
        }
    }

    private void traverseMany(TreeNode1 treeNode1) {
        for (TreeNode1 node1 : treeNode1.child) {
            System.out.println(node1.val);
            traverseMany(node1);
        }
    }
}
