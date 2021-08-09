package com.practice;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
	List<Integer> list=new ArrayList<Integer>();
	public List<Integer> inorderTraversal(TreeNode root) {
		helper(root);
		return list;
	}
	public void helper(TreeNode root) {
		if(root==null)	return;
		if(root.left==null && root.right==null) {
			list.add(root.val);
			return;
		}
		helper(root.left);
		list.add(root.val);
		helper(root.right);
	}
	
	public static void main(String[] args) {
		TreeNode root1=new TreeNode(1);
		TreeNode root2=new TreeNode(2);
		TreeNode root3=new TreeNode(3,null,root2);
		TreeNode root4=new TreeNode(4);
		TreeNode root5=new TreeNode(5);
		TreeNode root6=new TreeNode(6,root4,null);
		TreeNode root7=new TreeNode(7,root3,root6);
		InorderTraversal io=new InorderTraversal();
		io.inorderTraversal(root1);
	}

}
