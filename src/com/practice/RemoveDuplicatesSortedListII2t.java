package com.practice;

public class RemoveDuplicatesSortedListII2t {
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null || head.next==null) return head;
		ListNode result=new ListNode(0);
		result.next=head;
		int curVal=head.val;
		boolean removeFirst=false;
		if(curVal==head.next.val) removeFirst=true;
		while(head.next!=null && head.next.next!=null) {
			if(curVal==head.next.val) {
				ListNode temp=head.next.next;
				head.next=temp;
			}
			else if(head.next.val==head.next.next.val) {
				curVal=head.next.val;
				head.next=head.next.next;
			}
			else 
				head=head.next;
		}
		if(head.next!=null && curVal==head.next.val) head.next=head.next.next;
		if(removeFirst) return result.next.next;
		else return result.next;
	}

	public static void main(String[] args) {
		RemoveDuplicatesSortedListII2t rem=new RemoveDuplicatesSortedListII2t();
		ListNode listNode6=new ListNode(5);
		ListNode listNode5=new ListNode(4,listNode6);
		ListNode listNode4=new ListNode(3,listNode5);
		ListNode listNode3=new ListNode(1,listNode4);
		ListNode listNode2=new ListNode(1,listNode3);
		ListNode listNode1=new ListNode(1,listNode2);
		ListNode head=new ListNode(0,listNode1);
		rem.deleteDuplicates(head);
	}

}
