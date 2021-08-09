package com.practice;

public class MiddleoftheLinkedList {
	public ListNode middleNode(ListNode head) {
		if(head==null) return null;
		ListNode slow=head;
		ListNode fast=head;
		while(slow!=null && fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		ListNode listNode7=new ListNode(7);
		ListNode listNode6=new ListNode(6);
		ListNode listNode5=new ListNode(5);
		ListNode listNode4=new ListNode(4,listNode5);
		ListNode listNode3=new ListNode(3,listNode4);
		ListNode listNode2=new ListNode(2,listNode3);
		ListNode listNode1=new ListNode(1,listNode2);
		ListNode head=new ListNode(0,listNode1);
		MiddleoftheLinkedList mid=new MiddleoftheLinkedList();
		mid.middleNode(head);
	}

}
