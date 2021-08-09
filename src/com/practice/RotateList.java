package com.practice;

public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		if(head==null || head.next==null) return head;
		ListNode mov=new ListNode(0);
		mov.next=head;
		ListNode slow=mov;
		ListNode fast=mov;
		int count=0;
		while(fast.next!=null) {
			fast=fast.next;
			count++;
		}
		k=k%count;
		count-=k;
		while(count>0) {
			slow=slow.next;
			count--;
		}
		fast.next=mov.next;
		mov.next=slow.next;
		slow.next=null;
		return mov.next;
	}

	public static void main(String[] args) {
		ListNode listNode7=new ListNode(7);
		ListNode listNode6=new ListNode(6);
		ListNode listNode5=new ListNode(5,listNode6);
		ListNode listNode4=new ListNode(4,listNode5);
		ListNode listNode3=new ListNode(3,listNode4);
		ListNode listNode2=new ListNode(2,listNode3);
		ListNode listNode1=new ListNode(1,listNode2);
		RotateList mid=new RotateList();
		mid.rotateRight(listNode1,4);
	}

}
