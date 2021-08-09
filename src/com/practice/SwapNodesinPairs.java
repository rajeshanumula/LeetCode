package com.practice;

public class SwapNodesinPairs {
	public ListNode swapPairs(ListNode head) {
		ListNode list=head;
		if(list==null || list.next==null)	return head;
		while(list.next!=null) {
			int currentval=list.val;
			list.val=list.next.val;
			list.next.val=currentval;
			if(list.next.next!=null)
				list=list.next.next;
			else break;
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode listNode7=new ListNode(7);
		ListNode listNode6=new ListNode(6,listNode7);
		ListNode listNode5=new ListNode(5,listNode6);
		ListNode listNode4=new ListNode(4,listNode5);
		ListNode listNode3=new ListNode(3,listNode4);
		ListNode listNode2=new ListNode(2,listNode3);
		ListNode listNode1=new ListNode(1,listNode2);
		SwapNodesinPairs node=new SwapNodesinPairs();
		node.swapPairs(listNode1);
	}

}
