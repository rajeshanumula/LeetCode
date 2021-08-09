package com.practice;

public class PartitionList {
	public ListNode partition(ListNode head, int x) {
		if(head==null || head.next==null) return head;
		ListNode firsttemp=new ListNode(0);
		ListNode secondtemp=new ListNode(0);
		ListNode fistresult=firsttemp;
		ListNode secondresult=secondtemp;
		while(head!=null) {
			if(head.val<x) {
				firsttemp.next=new ListNode(head.val);
				firsttemp=firsttemp.next;
			}
			else {
				secondtemp.next=new ListNode(head.val);
				secondtemp=secondtemp.next;
			}
			head=head.next;
		}
		firsttemp.next=secondresult.next;
		return fistresult.next;
	}

	public static void main(String[] args) {
		ListNode listNode6=new ListNode(1);
		ListNode listNode5=new ListNode(2,listNode6);
		ListNode listNode4=new ListNode(5,listNode5);
		ListNode listNode3=new ListNode(2,listNode4);
		ListNode listNode2=new ListNode(3,listNode3);
		ListNode listNode1=new ListNode(4,listNode2);
		ListNode head=new ListNode(1,listNode1);
		PartitionList pl=new PartitionList();
		pl.partition(listNode5, 2);
	}

}
