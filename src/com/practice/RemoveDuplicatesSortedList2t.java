package com.practice;

public class RemoveDuplicatesSortedList2t {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode result=new ListNode(0);
		result.next=head;
		if(head==null || head.next==null) return head;
		while(head!=null && head.next!=null) {
			if(head.val==head.next.val) {
				head.next=head.next.next;
			}
			else head=head.next;
		}
		return result.next;
	}

	public static void main(String[] args) {
		RemoveDuplicatesSortedList2t rem=new RemoveDuplicatesSortedList2t();
		ListNode listNode6=new ListNode(6);
		ListNode listNode5=new ListNode(6,listNode6);
		ListNode listNode4=new ListNode(5,listNode5);
		ListNode listNode3=new ListNode(2,listNode4);
		ListNode listNode2=new ListNode(1,listNode3);
		ListNode listNode1=new ListNode(0,listNode2);
		ListNode head=new ListNode(0,listNode1);
		rem.deleteDuplicates(head);
	}

}
