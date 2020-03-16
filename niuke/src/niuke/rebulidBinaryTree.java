package niuke;

import niuke.domain.TreeNode;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @author mactupe
 *
 */
public class rebulidBinaryTree {
	
	public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode treeNode = reConstructBinaryTree(pre, in);
	}
	
	public static TreeNode reConstructBinaryTree(int[] pre,int[] in) {
		TreeNode treeNode = new TreeNode(5);
		int preIndex = pre[0];	//根结点
		int[] leftInTree = new int[10];
		for (int i = 0; i < in.length; i++) {
			leftInTree[i] = in[i];
			if (preIndex == in[i]) {
				break;
			}
		}
//		System.out.println(java.util.Arrays.toString(preIndex));
		return treeNode;
    }
}
