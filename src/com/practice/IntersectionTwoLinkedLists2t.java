package com.practice;

public class IntersectionTwoLinkedLists2t {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA==null || headB==null) return null;
		ListNode A=headA;
		ListNode B=headB;
		while(A!=B) {
			if(A==null) A=headB;
			else A=A.next;
			if(B==null) B=headA;
			else B=B.next;
		}
		return A;
	}

	public static void main(String[] args) {
		IntersectionTwoLinkedLists2t in=new IntersectionTwoLinkedLists2t();
		ListNode listNode6=new ListNode(3);
		ListNode listNode5=new ListNode(2,listNode6);
		ListNode listNode4=new ListNode(3,listNode5);
		ListNode listNode3=new ListNode(3);
		ListNode listNode2=new ListNode(2,listNode3);
		ListNode listNode1=new ListNode(1,listNode2);
		ListNode head=new ListNode(0,listNode1);
		in.getIntersectionNode(head, listNode4);
	}

}
