package niuke;

import apple.laf.JRSUIUtils;
import niuke.domain.TreeNode;

/**
 * 1。对二叉树进行前序，中序，后序遍历，
 * 2。找出二叉树的深度和每一层的宽度
 */
public class TreeRoad {

    public static String preTreeStr = "";   //前序遍历字符串
    public static String inTreeStr = "";    //中序遍历字符串
    public static String posTreeStr = "";  //后序遍历字符串

    public static void main(String[] args) {
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

        preTreeRoad(treeNode);
        System.out.println(preTreeStr);
        inTreeRoad(treeNode);
        System.out.println(inTreeStr);
        posTreeRoad(treeNode);
        System.out.println(posTreeStr);

        System.out.println(deepOfTree(treeNode));
    }

    //二叉树的前序遍历
    public static void preTreeRoad(TreeNode treeNode){
        if (null != treeNode){
            preTreeStr = preTreeStr + " " + treeNode.getVal();
            preTreeRoad(treeNode.left);
            preTreeRoad(treeNode.right);
        }
    }
    //二叉树的中序遍历
    public static void inTreeRoad(TreeNode treeNode){
        if (null != treeNode){
            inTreeRoad(treeNode.left);
            inTreeStr = inTreeStr + " "  + treeNode.getVal();
            inTreeRoad(treeNode.right);
        }
    }
    //二叉树的后序遍历
    public static void posTreeRoad(TreeNode treeNode){
        if (null != treeNode){
            posTreeRoad(treeNode.left);
            posTreeRoad(treeNode.right);
            posTreeStr = posTreeStr + " "  + treeNode.getVal();
        }
    }

    //二叉树的深度
    public static int deepOfTree(TreeNode treeNode){
        if (null == treeNode){
            return 0;
        }
        int leftDeep = deepOfTree(treeNode.left);
        int rightDeep = deepOfTree(treeNode.right);
        return Math.max(leftDeep, rightDeep) + 1;
    }

    //二叉树的宽度
    public static int widthOfTree(TreeNode treeNode){

    }
}
