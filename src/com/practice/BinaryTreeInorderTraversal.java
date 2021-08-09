package com.practice;
import java.util.*;

public class BinaryTreeInorderTraversal {
	
	List<Integer> result=new ArrayList<Integer>();
	
	public List<Integer> inorderTraversal(TreeNode root) {
		helper(root);
		return result;
	}
	
	public void helper(TreeNode root) {
		if(root==null) return;
		helper(root.left);
		result.add(root.val);
		helper(root.right);
	}
	public static void main(String[] args) {
		TreeNode root1=new TreeNode(1);
		TreeNode root2=new TreeNode(2);
		TreeNode root3=new TreeNode(3,root1,root2);
		TreeNode root4=new TreeNode(4);
		TreeNode root5=new TreeNode(5);
		TreeNode root6=new TreeNode(6,root4,null);
		TreeNode root7=new TreeNode(7,null,root1);
		BinaryTreeInorderTraversal a=new BinaryTreeInorderTraversal();
		a.inorderTraversal(root7);
	}

}
