package com.practice;
import java.util.*;
public class BinTreeLevelOrderTra {
	List<List<Integer>> result=new ArrayList<List<Integer>>();
	public List<List<Integer>> levelOrder(TreeNode root) {
		if(root==null) return result;
		result.add(new ArrayList<Integer>());
		helper(root, 0);
		return result;
	}
	public void helper(TreeNode root,int level) {
		if(root.left==null && root.right==null) {
			result.get(level).add(root.val);
			return;
		}
		if(level+1==result.size()) result.add(new ArrayList<Integer>());
		if(root.left!=null) helper(root.left, level+1);
		if(root.right!=null) helper(root.right, level+1);
		result.get(level).add(root.val);
		return;
	}
	public static void main(String[] args) {
		BinTreeLevelOrderTra bt=new BinTreeLevelOrderTra();
		TreeNode root1=new TreeNode(1);
		TreeNode root2=new TreeNode(2);
		TreeNode root3=new TreeNode(3,root1,root2);
		TreeNode root4=new TreeNode(4);
		TreeNode root5=new TreeNode(5);
		TreeNode root6=new TreeNode(6,root4,root5);
		TreeNode root7=new TreeNode(7,root3,root6);
		bt.levelOrder(root7);
	}

}
