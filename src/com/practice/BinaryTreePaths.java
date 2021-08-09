package com.practice;

import java.util.*;

public class BinaryTreePaths {
	List<String> list=new ArrayList<String>();
	public List<String> binaryTreePaths(TreeNode root) {
		helper(root, "");
		return list;
	}
	public void helper(TreeNode root,String path) {
		if(root==null)	return;
		if(root.left==null && root.right==null) {
			path+="->";
			path+=root.val;
			//path+=root.val;
			if(path.length()>2) list.add(path.substring(2,path.length()));
			else list.add(path);
			return;
		}
		path+="->";
		path+=root.val;
		helper(root.left, path);
		helper(root.right, path);
	}
	public static void main(String[] args) {
		TreeNode root1=new TreeNode(1);
		//TreeNode root2=new TreeNode(2);
		TreeNode root3=new TreeNode(3,root1,null);
		TreeNode root4=new TreeNode(4);
		TreeNode root5=new TreeNode(5);
		TreeNode root6=new TreeNode(6);
		TreeNode root7=new TreeNode(7,root3,root6);
		BinaryTreePaths path=new BinaryTreePaths();
		path.binaryTreePaths(root7);
	}

}
