package com.practice;


public class RemoveDuplicatesSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null || head.next==null) {
			return head;
		}
		ListNode p=head;
		while(p.next!=null) {
			if(p.val==p.next.val) {
				ListNode tempListNode=p.next;
				p.next=tempListNode.next;    
				tempListNode.next=null;
			}
			else
				p=p.next;
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode list5=new ListNode(3);
		ListNode list4=new ListNode(3,list5);
		ListNode list3=new ListNode(2,list4);
		ListNode list2=new ListNode(1,list3);
		ListNode head=new ListNode(1,list2);
		RemoveDuplicatesSortedList list=new RemoveDuplicatesSortedList();
		list.deleteDuplicates(head);
	}
}
