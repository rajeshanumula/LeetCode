package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevel {
	List<List<Integer>> listofLists = new ArrayList<List<Integer>>();

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		mylevelOrderBottom(root, 0);
		Collections.reverse(listofLists);
		return listofLists;
	}

	// List<List<Integer>> listofLists=new ArrayList<List<Integer>>();
	public void mylevelOrderBottom(TreeNode root, int depth) {
		if (root == null)
			return;
		if (listofLists.size() == depth)
			listofLists.add(new ArrayList<Integer>());
		listofLists.get(depth).add(root.val);
		mylevelOrderBottom(root.left, depth+1);
		mylevelOrderBottom(root.right, depth+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeLevel tree = new BinaryTreeLevel();
		TreeNode root1 = new TreeNode(2);
		TreeNode root2 = new TreeNode(3);
		TreeNode root3 = new TreeNode(1, root1, root2);
		TreeNode root4 = new TreeNode(2);
		TreeNode root5 = new TreeNode(3);
		TreeNode root6 = new TreeNode(1, root4, root5);
		TreeNode root7 = new TreeNode(3, root3, root6);
		tree.levelOrderBottom(root7);
	}

}
