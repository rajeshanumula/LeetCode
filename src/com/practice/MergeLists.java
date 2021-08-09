package com.practice;

public class MergeLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head=new ListNode(0);
		ListNode current=head;
		while(l1!=null && l2!=null) 
		{
			if(l1.val<l2.val) {
				current.next=l1;
				l1=l1.next;
			}else {
				current.next=l2;
				l2=l2.next;
			}
			current	=current.next;
		}
		if(l1!=null) {
			current.next=l1;
			l1=l1.next;
		}
		if(l2!=null) {
			current.next=l2;
			l2=l2.next;
		}
		if(head!=null) {
			head=head.next;
		}
		return head;
	}
	public static void main(String[] args) {
		ListNode listNode2=new ListNode(4);
		ListNode listNode1=new ListNode(2,listNode2);
		ListNode listNode=new ListNode(1,listNode1);
		
	
		ListNode listNode5=new ListNode(4);
		ListNode listNode4=new ListNode(3,listNode5);
		ListNode listNode3=new ListNode(1,listNode4);
		MergeLists merge=new MergeLists();
		merge.mergeTwoLists(listNode, listNode3);
	}

}
