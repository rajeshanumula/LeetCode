package com.practice;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result=new ListNode(0);
		ListNode resultDup=result;
		int carry=0;
		while(l1!=null || l2!=null) {
			int l1Val=l1==null?0:l1.val;
			int l2Val=l2==null?0:l2.val;
			if(l1Val+l2Val+carry>9) {
				ListNode temp=new ListNode(l2Val+l1Val+carry-10);
				result.next=temp;
				carry=1;
			}
			else {
				ListNode temp=new ListNode(l2Val+l1Val+carry);
				result.next=temp;
				carry=0;
			}
			if(l1!=null) l1=l1.next;
			if(l2!=null) l2=l2.next;
			result=result.next;
		}
		return resultDup.next;
	}

	public static void main(String[] args) {
		AddTwoNumbers add=new AddTwoNumbers();
		ListNode listNode6=new ListNode(6);
		ListNode listNode5=new ListNode(5,listNode6);
		ListNode listNode4=new ListNode(4,listNode5);
		ListNode listNode3=new ListNode(3);
		ListNode listNode2=new ListNode(2,listNode3);
		ListNode listNode1=new ListNode(1,listNode2);
		ListNode head=new ListNode(1,listNode1);
		add.addTwoNumbers(listNode4, head);
	}

}
