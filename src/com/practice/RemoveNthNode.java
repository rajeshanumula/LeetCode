package com.practice;

public class RemoveNthNode {
	public ListNode removeNthFromEnd1(ListNode head, int n) {
		ListNode check=head;
		if(head==null) return null;
		if(head.next==null && n==1) {
			return check=head.next;
		}
		helper(check, n);
		return check;
	}
	public int helper(ListNode check,int n) {
		int depth=1;
		if(check.next==null) {
			return 1;
		}
		else {
			depth=helper(check.next, n);
		}
		if(depth==n) {
			ListNode temp=check.next.next;
			check.next=temp;
		}
		return depth+1;
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
	    ListNode dummy=new ListNode(0);
	    dummy.next=head;
	    ListNode fast=dummy;
	    ListNode slow=dummy;
	    int temp=n;
	    for(;fast.next!=null;temp--){
	        if(temp<=0){ //control
	            slow=slow.next;
	        }
	        fast=fast.next;
	    }
	    slow.next=slow.next.next;//delete Nth
	    return dummy.next;
	}

	public static void main(String[] args) {
		ListNode listNode6=new ListNode(6);
		ListNode listNode5=new ListNode(5,listNode6);
		ListNode listNode4=new ListNode(4,listNode5);
		ListNode listNode3=new ListNode(3,listNode4);
		ListNode listNode2=new ListNode(2,listNode3);
		ListNode listNode1=new ListNode(1,listNode2);
		RemoveNthNode node=new RemoveNthNode();
		node.removeNthFromEnd(listNode1, 2);
	}

}
