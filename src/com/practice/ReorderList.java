package com.practice;

public class ReorderList {
	int start=1;
	ListNode dummy=new ListNode(0);
	ListNode dummy2;
	public ListNode reorderList(ListNode head) {
		if(head==null || head.next==null) return head;
		ListNode newhead=head;
		dummy2=head;
		dummy.next=head;
		dummy=dummy.next;
		helper(head,newhead,1);
		return head;
	}
	public void helper(ListNode main,ListNode head,int end) {
		if(head==null) {
			return;
		}
		helper(main,head.next, end+1);
		if(start<=end) {
			ListNode current=new ListNode(head.val);
			ListNode next=new ListNode(dummy2.next.val);
			dummy.next=current;
			dummy=dummy.next;
			dummy.next=next;
			dummy=dummy.next;
			dummy2=dummy2.next;
			start++;
		}
	}
	public static void main(String[] args) {
		ReorderList order=new ReorderList();
		ListNode listNode6=new ListNode(6);
		ListNode listNode5=new ListNode(5,listNode6);
		ListNode listNode4=new ListNode(4,listNode5);
		ListNode listNode3=new ListNode(3,listNode4);
		ListNode listNode2=new ListNode(2,listNode3);
		ListNode listNode1=new ListNode(1,listNode2);
		ListNode head=new ListNode(0,listNode1);
		order.reorderList(head);
	}

}
