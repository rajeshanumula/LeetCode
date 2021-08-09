package com.practice;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if(root==null)	return true;
		if(root.left==null && root.right==null) return true;
		if(root.left==null || root.right==null)	return false;
		TreeNode p=root.left;
		TreeNode q=root.right;
		return isSameTree(p, q);
	}
	public boolean isSameTree(TreeNode p, TreeNode q) {
		boolean res=false;
		if(p==null && q==null) {
			return true;
		}
		if(p==null || q==null) {
			return false;
		}
		if(p.val==q.val) {
			res=isSameTree(p.left, q.right);
		}
		if(res==true) {
			res=isSameTree(p.right, q.left);
		}
		return res;
	}
	public static void main(String[] args) {
		SymmetricTree sym=new SymmetricTree();
		TreeNode root1=new TreeNode(2);
		TreeNode root2=new TreeNode(3);
		TreeNode root3=new TreeNode(1,root1,root2);
		TreeNode root4=new TreeNode(3);
		TreeNode root5=new TreeNode(2);
		TreeNode root6=new TreeNode(1,root4,root5);
		TreeNode root7=new TreeNode(5,root3,root6);
		sym.isSymmetric(root7);
	}

}
