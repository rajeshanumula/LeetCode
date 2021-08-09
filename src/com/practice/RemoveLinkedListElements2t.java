package com.practice;

public class RemoveLinkedListElements2t {
	public ListNode removeElements(ListNode head, int val) {
		if(head==null) return head;
		if(head.next==null && head.val==val) return null;
		ListNode dummy=new ListNode(0);
		dummy.next=head;
		ListNode temp=dummy;
		while(dummy.next!=null) {
			if(dummy.next.val==val) {
				dummy.next=dummy.next.next;
			}
			else dummy=dummy.next;
		}
		return temp.next;
	}

	public static void main(String[] args) {
		ListNode listNode6=new ListNode(6);
		ListNode listNode5=new ListNode(5,listNode6);
		ListNode listNode4=new ListNode(3);
		ListNode listNode3=new ListNode(3,listNode4);
		ListNode listNode2=new ListNode(2,listNode3);
		ListNode listNode1=new ListNode(1,listNode2);
		ListNode head=new ListNode(1,listNode1);
		RemoveLinkedListElements2t rem=new RemoveLinkedListElements2t();
		rem.removeElements(head, 3);
	}

}
