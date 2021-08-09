package com.practice;

public class Bloomberg_FindBottomLeftTreeValue {
	int maxDepth = 0;
	int nodeVal;
	public int findBottomLeftValue(TreeNode root) {
		if (root.left == null && root.right == null)
			return root.val;
		nodeVal = root.val;
		helper(root, 0);
		return nodeVal;
	}

	public void helper(TreeNode root, int depth) {
		if (root.left == null && root.right == null)
			return;
		if (root.left != null) {
			helper(root.left, depth + 1);
			if (depth + 1 > maxDepth) {
				maxDepth = depth + 1;
				nodeVal = root.left.val;
			}
		}
		if (root.right != null) {
			helper(root.right, depth + 1);
			if (depth + 1 > maxDepth) {
				maxDepth = depth + 1;
				nodeVal = root.right.val;
			}
		}
	}

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(1);
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3, root1, null);
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(5, root2, null);
		TreeNode root6 = new TreeNode(6, root4, root5);
		TreeNode root7 = new TreeNode(7, root3, root6);
		Bloomberg_FindBottomLeftTreeValue bl = new Bloomberg_FindBottomLeftTreeValue();
		bl.findBottomLeftValue(root7);
	}
}
