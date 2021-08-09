package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class VertiOrdrTraversalBTree {
	HashMap<Integer, ArrayList<Integer>> map=new HashMap<Integer, ArrayList<Integer>>();
	public List<List<Integer>> verticalTraversal(TreeNode root) {
		if(root==null) return null;
		int row=0;
		int column=0;
		helper(root, row, column);
		List<List<Integer>> final1=new ArrayList<List<Integer>>();
		Object[] sort=map.keySet().toArray();
		Arrays.sort(sort);
		for(int i=0;i<sort.length;i++) {
			final1.add(map.get(sort[i]));
		}
		return final1;
	}
	public void helper(TreeNode root, int row,int column) {
		if(root==null) {return;}
		else {
			helper(root.left, row+1, column-1);
			helper(root.right, row+1, column+1);
		}
		if(map.containsKey(column)) {
			ArrayList<Integer> list=map.get(column);
			if(list.get(0)>root.val) {
				list.add(root.val);
			}
			else list.add(0,root.val);
		}
		else {
			ArrayList<Integer> list=new ArrayList<Integer>();
			list.add(root.val);
			map.put(column,list);
		}
	}

	public static void main(String[] args) {
		TreeNode root1=new TreeNode(1);
		TreeNode root2=new TreeNode(2);
		TreeNode root3=new TreeNode(3,root1,root2);
		TreeNode root4=new TreeNode(4);
		TreeNode root5=new TreeNode(5);
		TreeNode root6=new TreeNode(6,root4,root5);
		TreeNode root7=new TreeNode(7,root3,root6);
		VertiOrdrTraversalBTree ver=new VertiOrdrTraversalBTree();
		ver.verticalTraversal(root7);
	}

}
