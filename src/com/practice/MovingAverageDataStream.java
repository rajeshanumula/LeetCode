package com.practice;

import java.util.ArrayList;

public class MovingAverageDataStream {
	int capacity;
	int curCapacity;
	int sum=0;
	ArrayList<Integer> q;
	public MovingAverageDataStream(int size) {
	        this.capacity=size;
	        q=new ArrayList<Integer>();
	    }

	public double next(int val) {
		curCapacity++;
		sum+=val;
		q.add(val);
		if(curCapacity>capacity) {
			sum-=q.remove(0);
			curCapacity--;
		}
		return  (double)sum/curCapacity;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
