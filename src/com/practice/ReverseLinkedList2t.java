package com.practice;

public class ReverseLinkedList2t {
	ListNode temp=new ListNode(0);
	ListNode result=temp;
	public ListNode reverseList(ListNode head) {
		if(head==null || head.next==null) return head;
		helper(head);
		return result.next;
	}
	public void helper(ListNode head) {
		if(head==null) {
			return ;
		}
		helper(head.next);
		ListNode current=new ListNode(head.val);
		temp.next=current;
		temp=temp.next;
	}
	public static void main(String[] args) {
		ListNode listNode6=new ListNode(6);
		ListNode listNode5=new ListNode(5,listNode6);
		ListNode listNode4=new ListNode(4,listNode5);
		ListNode listNode3=new ListNode(3,listNode4);
		ListNode listNode2=new ListNode(2,listNode3);
		ListNode listNode1=new ListNode(1,listNode2);
		ListNode head=new ListNode(0,listNode1);
		ReverseLinkedList2t rev=new ReverseLinkedList2t();
		rev.reverseList(listNode5);
	}

}
