package com.practice;

public class PalindromeLinkedList2t {
	ListNode temp=new ListNode(0);
	ListNode rev=temp;
	public boolean isPalindrome(ListNode head) {
		ListNode slow=head;
		ListNode fast=head;
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		if(fast!=null) slow=slow.next;
		reverse(slow);
		while(rev.next!=null && head!=null) {
			if(rev.next.val!=head.val) return false;
			head=head.next;
			rev=rev.next;
		}
		return true;
	}
	public void reverse(ListNode head) {
		if(head==null) return;
		reverse(head.next);
		ListNode current=new ListNode(head.val);
		temp.next=current;
		temp=temp.next;
	}

	public static void main(String[] args) {
		ListNode listNode6=new ListNode(1);
		ListNode listNode5=new ListNode(0);
		ListNode listNode4=new ListNode(1,listNode5);
		ListNode listNode3=new ListNode(2,listNode4);
		ListNode listNode2=new ListNode(2,listNode3);
		ListNode listNode1=new ListNode(1,listNode2);
		ListNode head=new ListNode(0,listNode1);
		PalindromeLinkedList2t pal=new PalindromeLinkedList2t();
		pal.isPalindrome(head);
	}

}
