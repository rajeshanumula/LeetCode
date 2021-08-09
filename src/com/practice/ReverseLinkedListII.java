package com.practice;

;

public class ReverseLinkedListII {
	public ListNode reverseBetween(ListNode head, int left, int right) {
		ListNode dummy=new ListNode(0);
		ListNode result=dummy;
		ListNode reverse=new ListNode(0);
		ListNode revDummy=reverse;
		int count=0;
		while(count<right) {
			count++;
			if(count<left) {
				dummy.next=head;
				head=head.next;
				dummy=dummy.next;
			}
			else {
				revDummy.next=new ListNode(head.val);
				revDummy=revDummy.next;
				head=head.next;
			}
		}
		ListNode middle= reverseList(reverse.next);
		dummy.next=middle;
		while(dummy.next!=null) dummy=dummy.next;
		dummy.next=head;
		return result.next;
	}
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
	
	public ListNode reverseBetween1(ListNode head, int left, int right) {
		ListNode dummy=new ListNode(0);
		ListNode result=dummy;
		ListNode reverse=new ListNode(0);
		ListNode revDummy=reverse;
		ListNode middle=null;
		int count=0;
		while(count<right) {
			count++;
			if(count<left || count>right) {
				dummy.next=head;
				head=head.next;
				dummy=dummy.next;
			}
			else {
				while(head!=null && count<=right) {
					ListNode next=head.next;
					head.next=middle;
					middle=head;
					head=next;
					count++;
				}
				dummy.next=middle;
			}
		}
		while(dummy.next!=null) dummy=dummy.next;
		dummy.next=head;
		return result.next;
	}

	public static void main(String[] args) {
		ReverseLinkedListII rev=new ReverseLinkedListII();
		ListNode listNode6=new ListNode(7);
		ListNode listNode5=new ListNode(6,listNode6);
		ListNode listNode4=new ListNode(5,listNode5);
		ListNode listNode3=new ListNode(3,listNode4);
		ListNode listNode2=new ListNode(10,listNode3);
		ListNode listNode1=new ListNode(2,listNode2);
		ListNode head=new ListNode(1,listNode1);
		rev.reverseBetween1(head, 2, 5);
	}

}
