package com.practice;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
	List<List<Integer>> resultList = new ArrayList<List<Integer>>();
	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		List<Integer> list = new ArrayList<Integer>();
		if(root!=null)	mylist(root, targetSum, list);		
		return resultList;
	}

	public void mylist(TreeNode root, int targetSum, List<Integer> list) {
		list.add(root.val);
		if (root.left == null && root.right == null && targetSum == root.val) {
			resultList.add(new ArrayList(list));
		} else {
			if (root.left != null) {
				mylist(root.left, targetSum - root.val, list);
				list.remove(list.size()-1);
			}
			if (root.right != null) {
				mylist(root.right, targetSum - root.val, list);
				list.remove(list.size()-1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PathSum2 path = new PathSum2();
		TreeNode leafNode = new TreeNode(4);
		TreeNode root1 = new TreeNode(2, leafNode, null);
		TreeNode root2 = new TreeNode(6);
		TreeNode root3 = new TreeNode(1, root1, root2);
		TreeNode root4 = new TreeNode(2, leafNode, null);
		TreeNode root5 = new TreeNode(8, null, leafNode);
		TreeNode root6 = new TreeNode(1, root4, root5);
		TreeNode root7 = new TreeNode(3, root3, root6);
		path.pathSum(root3, 7);
	}

}
