package com.practice;

import java.util.*;

class Custom implements Comparator<Integer>{
	@Override
	public int compare(Integer o1,Integer o2) {
		return o1>o2?1:-1;
	}
}

public class Queue1 {
	public void linkedlist() {
		Queue<Integer> ll=new LinkedList<Integer>();
		ll.add(11);
		ll.add(5);
		ll.add(-1);
		ll.add(12);
		ll.add(6);
		System.out.println(ll);
		Iterator i=ll.iterator();
		while(i.hasNext()) System.out.println(i.next()+",,");
		while(!ll.isEmpty())
			System.out.println(ll.poll());
		priorityqueues();
	}

	public void priorityqueues() {
		Queue<Integer> pq=new PriorityQueue<Integer>(new Custom());
		pq.add(11);
		pq.add(5);
		pq.add(-1);
		pq.add(12);
		pq.add(6);
		pq.add((int)' ');
		System.out.println(pq);
		Iterator i=pq.iterator();
		while(i.hasNext()) System.out.println(i.next()+",,");
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
	}

	public static void main(String[] args) {
		Queue1 q=new Queue1();
		q.linkedlist();
	}

}
