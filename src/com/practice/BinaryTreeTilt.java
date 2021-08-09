package com.practice;

public class BinaryTreeTilt {
	int sum=0;
	public int findTilt(TreeNode root) {
		myTree(root);
		return sum;
	}
	private int myTree(TreeNode root) {
		int left=0;
		int right=0;
		if(root==null) return 0;
		else {
			left=myTree(root.left);
			right=myTree(root.right);
			sum+=Math.abs(left-right);
		}
		return root.val+left+right;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeTilt tree = new BinaryTreeTilt();
		TreeNode root0=new TreeNode(7);
		TreeNode root1 = new TreeNode(15,root0,null);
		TreeNode root2 = new TreeNode(7);
		TreeNode root3 = new TreeNode(20, root1, root2);
		TreeNode root4 = new TreeNode(9);
		TreeNode root6 = new TreeNode(3, root4, root3);
		tree.findTilt(root6);
	}

}
