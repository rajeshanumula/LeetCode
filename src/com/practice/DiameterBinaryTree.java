package com.practice;

public class DiameterBinaryTree {
	int min=0;
	public int diameterOfBinaryTree(TreeNode root) {
		if((root==null)||(root.left==null && root.right==null)) return 0;
		int result=diameterOfBinaryTree1(root);
		if(min==0)	return result;
		else return result+min;
	}
	public int diameterOfBinaryTree1(TreeNode root) {
		if (root.left == null && root.right == null)
			return 0;
		int left=0,right=0;
		if (root.left != null) {
			left = diameterOfBinaryTree1(root.left) + 1;
		}
		if (root.right != null) {
			right = diameterOfBinaryTree1(root.right) + 1;
		}
		min=Math.min(left, right);
		return Math.max(left, right);
	}

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(1);
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3, root1, root2);
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(5,null,root1);
		TreeNode root6 = new TreeNode(6, root4, root5);
		TreeNode root7 = new TreeNode(7, root3, root6);
		DiameterBinaryTree bt = new DiameterBinaryTree();
		bt.diameterOfBinaryTree(root7);
	}

}
