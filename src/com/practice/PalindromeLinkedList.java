package com.practice;

public class PalindromeLinkedList {
	
	public boolean isPalindrome(ListNode dummy) {
	 	ListNode head=dummy;
	 	ListNode prev=null;
		while(dummy!=null) {
			ListNode next=dummy.next;
			dummy.next=prev;
			prev=dummy;
			dummy=next;
		}
        while(head!=null){
            if(head.val!=prev.val) return false;
            prev=prev.next;
            head=head.next;
        }
        return true;
	}
	
	public boolean isPalindrome1(ListNode head) {
		ListNode slow=head;
		ListNode fast=head;
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		slow=helper(slow);
		fast=head;
		while(slow!=null) {
			if(slow.val!=fast.val) {
				return false;
			}
			slow=slow.next;
			fast=fast.next;
		}
		return true;
	}
	public ListNode helper(ListNode dummy) {
		ListNode prev=null;
		while(dummy!=null) {
			ListNode next=dummy.next;
			dummy.next=prev;
			prev=dummy;
			dummy=next;
		}
		return prev;
	}

	public static void main(String[] args) {
		ListNode listNode6=new ListNode(1);
		//ListNode listNode5=new ListNode(2,listNode6);
		ListNode listNode4=new ListNode(3,listNode6);
		ListNode listNode3=new ListNode(3,listNode4);
		ListNode listNode2=new ListNode(2,listNode3);
		ListNode listNode1=new ListNode(1,listNode2);
		PalindromeLinkedList pal=new PalindromeLinkedList();
		pal.isPalindrome(listNode1);
	}

}
