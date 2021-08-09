package com.practice;

public class RemoveNthNodeFromEndList {
	boolean deleted=false;
	int count=0;
	ListNode result;
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head.next==null && n==1) return result;
		result=head;
		helper(head, n);
		if(deleted) return result;
		else return result.next;
	}
	
	public int helper(ListNode head, int n) {
		if(head.next==null) {
			return 0;
		}
		int count=helper(head.next, n)+1;
		if(count==n) {
			head.next=head.next.next;
			deleted=true;
		}
		return count;
	}

	public static void main(String[] args) {
		RemoveNthNodeFromEndList rem=new RemoveNthNodeFromEndList();
		ListNode listNode6=new ListNode(6);
		ListNode listNode5=new ListNode(5,listNode6);
		ListNode listNode4=new ListNode(4,listNode5);
		ListNode listNode3=new ListNode(3,listNode4);
		ListNode listNode2=new ListNode(2,listNode3);
		ListNode listNode1=new ListNode(1,listNode2);
		ListNode head=new ListNode(0,listNode1);
		rem.removeNthFromEnd(head, 7);
	}

}
