package com.practice;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		ListNode x=head;
		ListNode y=head;
		if(head==null || head.next==null) return false;
		while(x!=null && x.next!=null) {
			x=x.next.next;
			y=y.next;
			if(x==y) return true;
		}
		if(x==null) return false;
		return false;
	}

	public static void main(String[] args) {
		LinkedListCycle list=new LinkedListCycle();
		// ListNode listNode6=new ListNode(6);
		// ListNode listNode5=new ListNode(5);
		ListNode listNode4=new ListNode(4);
		ListNode listNode3=new ListNode(3);
		ListNode listNode2=new ListNode(2);
		ListNode listNode1=new ListNode(1);
		listNode1.next=listNode2;
		listNode2.next=listNode3;
		listNode3.next=listNode4;
		listNode4.next=listNode2;
		list.hasCycle(listNode1);
	}

}
