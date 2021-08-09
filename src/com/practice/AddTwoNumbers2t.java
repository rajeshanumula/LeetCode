package com.practice;

public class AddTwoNumbers2t {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1==null) return l2;
		else if(l2==null) return l1;
		int carry=0;
		ListNode result=new ListNode(0);
		ListNode res=result;
		while(l1!=null || l2!=null) {
			 int a= l1==null?0:l1.val;
			 int b= l2==null?0:l2.val;
			 if(a+b+carry>9) {
				 ListNode temp=new ListNode((a+b+carry)%10);
				 result.next=temp;
				 carry=1;
			 }
			 else {
				 ListNode temp=new ListNode(a+b+carry);
				 result.next=temp;
				 carry=0;
			 }
			 l1=l1!=null?l1.next:l1;
			 l2=l2!=null?l2.next:l2;
			 result=result.next;
		}
		if(carry==1) {
			ListNode temp=new ListNode(carry);
			result.next=temp;
		}
		return res.next;
	}

	public static void main(String[] args) {
		AddTwoNumbers2t tow=new AddTwoNumbers2t();
		ListNode listNode6=new ListNode(9);
		ListNode listNode5=new ListNode(9,listNode6);
		ListNode listNode4=new ListNode(9,listNode5);
		ListNode listNode3=new ListNode(9);
		ListNode listNode2=new ListNode(9,listNode3);
		ListNode listNode1=new ListNode(9,listNode2);
		ListNode head=new ListNode(9,listNode1);
		tow.addTwoNumbers(listNode4, head);
	}

}
