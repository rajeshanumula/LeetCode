package com.practice;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode prev=null;
		while(head!=null) {
			ListNode next=head.next;
			head.next=prev;
			prev=head;
			head=next;
		}
		return prev;
	}
	
	// Recursive method:
	ListNode dummy=new ListNode(0);
	ListNode rev=dummy;
	public ListNode reverseList1(ListNode head) {
		reverse(head);
		return rev.next;
	}
	public void reverse(ListNode head) {
		if(head==null) return;
		reverse(head.next);
		ListNode temp=new ListNode(head.val);
		dummy.next=temp;
		dummy=dummy.next;
	}

	public static void main(String[] args) {

	}

}
