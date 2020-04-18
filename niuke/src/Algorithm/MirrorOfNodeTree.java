package Algorithm;

import Algorithm.domain.TreeNode;

public class MirrorOfNodeTree {
    public static void main(String[] args) {
        //主树
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left =  new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.left.right.left = new TreeNode(8);
        treeNode.left.right.right = new TreeNode(9);
        treeNode.left.right.right.left = new TreeNode(10);
        treeNode.right.left =  new TreeNode(6);
        treeNode.right.right =  new TreeNode(7);

    }

    public static void Mirror(TreeNode root) {
        if (null!=root.left){
            Mirror(root.left);
        }
        if (null!=root.right){
            Mirror(root.right);
        }
        TreeNode tree = null;

    }
}
