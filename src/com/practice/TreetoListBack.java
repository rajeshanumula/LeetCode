package com.practice;

import java.util.ArrayList;
import java.util.List;

public class TreetoListBack {
	
	class Node{
		Node leftNode;
		Node rightNode;
		int index;
		public Node(Node left, Node right, int index) {
			this.leftNode=left;
			this.rightNode=right;
			this.index=index;
		}
	}
	public void makeList(TreeNodes root) {
		List<Node> list=new ArrayList<>();
		
		
	}
	public static void main(String[] args) {
		TreetoListBack tree=new TreetoListBack();
		TreeNodes root1=new TreeNodes(1);
		TreeNodes root2=new TreeNodes(2);
		TreeNodes root3=new TreeNodes(3,root1,root2);
		TreeNodes root4=new TreeNodes(4);
		TreeNodes root5=new TreeNodes(5);
		TreeNodes root6=new TreeNodes(6,root4,root5);
		TreeNodes root7=new TreeNodes(7,root3,root6);
		tree.makeList(root7);
	}

}


//Definition for a binary tree node. 
class TreeNodes {
	public int val;
	public TreeNodes left;
	public TreeNodes right;

	public TreeNodes() {
	}

	public TreeNodes(int val) {
		this.val = val;
	}

	public TreeNodes(int val, TreeNodes left, TreeNodes right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}


//TreeNodes root1=new TreeNodes(1);
//TreeNodes root2=new TreeNodes(2);
//TreeNodes root3=new TreeNodes(3,root1,root2);
//TreeNodes root4=new TreeNodes(4);
//TreeNodes root5=new TreeNodes(5);
//TreeNodes root6=new TreeNodes(6,root4,root5);
//TreeNodes root7=new TreeNodes(7,root3,root6);

