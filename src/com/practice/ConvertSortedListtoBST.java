package com.practice;

public class ConvertSortedListtoBST {
	public TreeNode sortedListToBST(ListNode head) {
		if(head==null) return null;
		TreeNode result =constructBST(head,null);
		return result;
	}
	public TreeNode constructBST(ListNode head,ListNode tail) {
		if(head==tail) return null;
		ListNode fast=head;
		ListNode slow=head;
		while(fast!=tail && fast.next!=tail) {
			fast=fast.next.next;
			slow=slow.next;
		}
		TreeNode root=new TreeNode(slow.val);
		root.left=constructBST(head, slow);
		root.right=constructBST(slow.next, tail);
		return root;
	}

	public static void main(String[] args) {
		ListNode listNode4=new ListNode(9);
		ListNode listNode3=new ListNode(5,listNode4);
		ListNode listNode2=new ListNode(0,listNode3);
		ListNode listNode1=new ListNode(-3,listNode2);
		ListNode head=new ListNode(-10,listNode1);
		ConvertSortedListtoBST con=new ConvertSortedListtoBST();
		con.sortedListToBST(head);
	}

}
