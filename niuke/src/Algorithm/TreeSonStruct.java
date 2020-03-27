package Algorithm;

import Algorithm.domain.TreeNode;
import apple.laf.JRSUIUtils;

/**
 *@Auther:Mactupe
 *@Date:2020/3/24-14:18
 *@Description:输入两棵二叉树A，B，判断B是不是A的子结构
 */
public class TreeSonStruct {
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

        //子树1
        TreeNode sonTreeNode1 = new TreeNode(5);
        sonTreeNode1.left = new TreeNode(8);
        sonTreeNode1.right = new TreeNode(9);
        sonTreeNode1.right.left = new TreeNode(10);
        //子树2
        TreeNode sonTreeNode2 = new TreeNode(1);
        sonTreeNode2.left = new TreeNode(2);
        sonTreeNode2.right = new TreeNode(3);
        //非相关树
        TreeNode othTreeNode = new TreeNode(2);
        othTreeNode.left = new TreeNode(3);
        othTreeNode.right = new TreeNode(4);
        System.out.println("匹配结果为" + HasSubtree(sonTreeNode2, treeNode));
    }
    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (null == root2){ //如果父树为空，则返回false；
            return false;
        }
        if (null == root1 && null != root2){    //如果子树为空，并且父树不为空，也返回false；
            return false;
        }
        boolean flag = false;
        if (root1.val == root2.val){
            flag =  isSubTree(root1, root2);
        }
        if (!flag){
            flag = HasSubtree(root1.left, root2);
            if (!flag){
                flag = HasSubtree(root1.right, root2);
            }
        }
        return flag;
    }
    public static boolean isSubTree(TreeNode root1, TreeNode root2){
        if (null == root2){ //如果父树为空，则返回false；
            return true;
        }
        if (null == root1 && null != root2){    //如果子树为空，并且父树不为空，也返回false；
            return false;
        }
        if (root1.val == root2.val){
            return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
        }else{
            return false;
        }
    }
}
