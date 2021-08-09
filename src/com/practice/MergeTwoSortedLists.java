package com.practice;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy=new ListNode(0);
		ListNode result=dummy;
		while(l1!=null || l2!=null) {
			int l1Val=l1==null?200:l1.val;
			int l2Val=l2==null?200:l2.val;
			if(l2Val<l1Val) {
				ListNode temp=new ListNode(l2Val);
				dummy.next=temp;
				l2= l2==null?null:l2.next;
			}
			else {
				ListNode temp=new ListNode(l1Val);
				dummy.next=temp;
				l1=l1==null?null:l1.next;
			}
			dummy=dummy.next;
		}
		return result.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
