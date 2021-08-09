package com.practice;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		boolean res=false;
		if(p==null && q==null) {
			return true;
		}
		if(p==null || q==null) {
			return false;
		}
		if(p.val==q.val) {
			res=isSameTree(p.left, q.left);
		}
		if(res==true) {
			res=isSameTree(p.right, q.right);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SameTree tree=new SameTree();
		TreeNode root1=new TreeNode(2);
		TreeNode root2=new TreeNode(3);
		TreeNode root3=new TreeNode(1,root1,root2);
		TreeNode root4=new TreeNode(2);
		TreeNode root5=new TreeNode(3);
		TreeNode root6=new TreeNode(1,root4,root5);
		tree.isSameTree(root3, root6);
	}

}
