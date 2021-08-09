package com.practice;

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		while(head!=null && head.val==val) head=head.next;
		if(head==null)	return head;
		ListNode current=head;
		while(current.next!=null) {
			if(current.next.val==val) {
				ListNode temp=current.next.next;
				current.next=temp;
			}
			else current=current.next;
		}
		return head;
	}
	//private ListNode 
	public static void main(String[] args) {
		RemoveLinkedListElements rem=new RemoveLinkedListElements();
		ListNode listNode2=new ListNode(1);
		ListNode listNode1=new ListNode(1,listNode2);
		ListNode listNode=new ListNode(4,listNode1);
		ListNode listNode5=new ListNode(3,listNode);
		ListNode listNode4=new ListNode(6,listNode5);
		ListNode listNode3=new ListNode(2,listNode4);
		ListNode listNode6=new ListNode(1,listNode3);
		rem.removeElements(listNode1, 1);
	}

}
