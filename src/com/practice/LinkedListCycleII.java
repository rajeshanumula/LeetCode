package com.practice;

public class LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
		if(head==null || head.next==null) return null;
		ListNode slow=head;
		ListNode fast=head;
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow) break;
		}
		if(head==slow) return head;
		while(head!=slow) {
			head=head.next;
		}
		return head;
	}

	public static void main(String[] args) {
		LinkedListCycleII lin=new LinkedListCycleII();
		lin.detectCycle(null);
	}

}
