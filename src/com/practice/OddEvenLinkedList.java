package com.practice;

public class OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
	    if(head == null || head.next == null){
	        return head;
	    }
	    ListNode odd1 = head;
	    ListNode odd=odd1;
	    ListNode even = head.next;
	    ListNode even_head = even;
	    while(even != null && even.next != null){
	        odd.next = odd.next.next;
	        even.next = even.next.next;
	        odd = odd.next;
	        even = even.next;
	    }
	    odd.next = even_head;
	    return head;
	}

	public static void main(String[] args) {
		ListNode listNode6=new ListNode(6);
		ListNode listNode5=new ListNode(5,listNode6);
		ListNode listNode4=new ListNode(4,listNode5);
		ListNode listNode3=new ListNode(3,listNode4);
		ListNode listNode2=new ListNode(2,listNode3);
		ListNode head=new ListNode(1,listNode2);
		OddEvenLinkedList ob=new OddEvenLinkedList();
		ob.oddEvenList(head);
	}

}
