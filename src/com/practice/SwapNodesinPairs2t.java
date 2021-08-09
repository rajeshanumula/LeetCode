package com.practice;

public class SwapNodesinPairs2t {
	public ListNode swapPairs(ListNode head) {
		ListNode result=head;
		while(head!=null && head.next!=null) {
			int temp=head.val;
			head.val=head.next.val;
			head.next.val=temp;
			head=head.next.next;
		}
		return result;
	}

	public static void main(String[] args) {
		ListNode listNode6=new ListNode(6);
		ListNode listNode5=new ListNode(5);
		ListNode listNode4=new ListNode(4,listNode5);
		ListNode listNode3=new ListNode(3,listNode4);
		ListNode listNode2=new ListNode(2,listNode3);
		ListNode listNode1=new ListNode(1,listNode2);
		ListNode head=new ListNode(0,listNode1);
		SwapNodesinPairs2t swa=new SwapNodesinPairs2t();
		swa.swapPairs(head);
	}

}
