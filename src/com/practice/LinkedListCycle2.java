package com.practice;

public class LinkedListCycle2 {
	public ListNode detectCycle(ListNode head) {
		if (head == null)
			return null;
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null && slow != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				slow = head;
				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				return fast;
			}
			if (fast == head)
				return head;
		}
		return null;
	}

	public static void main(String[] args) {
		LinkedListCycle2 list=new LinkedListCycle2();
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
		list.detectCycle(listNode1);
	}

}

