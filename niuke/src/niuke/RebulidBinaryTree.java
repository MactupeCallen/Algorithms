package niuke;

import niuke.domain.TreeNode;

import java.util.Arrays;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @author mactupe
 *
 */
public class RebulidBinaryTree {
	
	public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode treeNode = reConstructBinaryTree(pre, in);
	}
	
	public static TreeNode reConstructBinaryTree(int[] pre,int[] in) {

		//数组长度为0的时候要处理
		if(pre.length == 0){
			return null;
		}

		int rootVal = pre[0];

		//数组长度仅为1的时候就要处理
		if(pre.length == 1){
			return new TreeNode(rootVal);
		}
		TreeNode treeNode = new TreeNode(rootVal);
		int rootIndex = 0;
		for (int i = 0; i < in.length; i++) {
			if (rootVal == in[i]) {
				rootIndex = i;
				break;
			}
		}

		treeNode.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,rootIndex+1), Arrays.copyOfRange(in,0,rootIndex));
		treeNode.right = reConstructBinaryTree(Arrays.copyOfRange(pre,rootIndex+1,pre.length),Arrays.copyOfRange(in,rootIndex+1,in.length));

//		System.out.println(java.util.Arrays.toString(preIndex));
		return treeNode;
    }
}
