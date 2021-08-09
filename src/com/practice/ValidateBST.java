package com.practice;

public class ValidateBST {
	public boolean isValidBST(TreeNode root) {
		return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
		if (root == null)
			return true;
		if (root.val >= maxVal || root.val <= minVal)
			return false;
		return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
	}

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(2);
		TreeNode root2 = new TreeNode(4);
		TreeNode root3 = new TreeNode(3, root1, root2);
		TreeNode root4 = new TreeNode(6);
		TreeNode root5 = new TreeNode(8);
		TreeNode root6 = new TreeNode(7, root4, root5);
		TreeNode root7 = new TreeNode(5, root3, root6);
		ValidateBST bst = new ValidateBST();
		bst.isValidBST(root7);
	}

}
