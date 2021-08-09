package com.practice;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int targetSum) {
		return mySum(root,root, targetSum, 0);
	}
	public boolean mySum(TreeNode root,TreeNode other,int targetSum,int sum) {
		boolean left=false;
		if(root==null) {
			if(targetSum==sum  && other==null) return true;
		}
		else {
		sum+=root.val;
		left=mySum(root.left,root.right, targetSum, sum);
		if(left!=true)	left=mySum(root.right, root.left,targetSum, sum);
		}
		return left;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PathSum path = new PathSum();
		TreeNode leafNode=new TreeNode(19);
		TreeNode root4 = new TreeNode(2,leafNode,null);
		
		path.hasPathSum(root4, 2);
	}

}
