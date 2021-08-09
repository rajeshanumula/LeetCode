package com.practice;

public class SortedArraytoBinaryTree {
	public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, left, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, right);
        return root;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedArraytoBinaryTree tree=new SortedArraytoBinaryTree();
		int[] nums= {-10,-3,0,5,9};
		tree.sortedArrayToBST(nums);
	}

}
