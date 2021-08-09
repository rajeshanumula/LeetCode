package com.practice;
import java.util.*;
public class SahithOA1 {
	public static int[][] closestKLocations(List<List<Integer>> allLocations, int k) {
		//Set<List<Integer>> set=new HashSet<>();
	    PriorityQueue<Point> pq = new PriorityQueue<>((a,b)->a.dist-b.dist);
	    for (List<Integer> location : allLocations) {
	    	Point p=new Point(location);
	    	pq.add(p);
	      //if (pq.size() > k) pq.poll();
	    }
	    
	    int[][] result = new int[k][2];
	    int i=0;
	    
	    while(!pq.isEmpty() && k>0) {
	    	if(i>0 && result[i-1][0]==pq.peek().coordinates.get(0) &&result[i-1][1]==pq.peek().coordinates.get(1)) {
	    		System.out.println("Not added to result-->"+ pq.peek().dist);
	    		pq.poll();
	    		continue;
	    	}
	    	result[i][0]=pq.peek().coordinates.get(0);
	    	System.out.println(pq.peek().dist);
	    	result[i][1]=pq.poll().coordinates.get(1);
	    	i++;
	    	k--;
	    }
	    return result;
	  }

	  public static void main(String[] args) {
	    int[][] test1 = new int[][] {
	      {3,6},
	      {2,4},
	      {5,3},{2,7},{1,8},{7,9}
	    };
	    
	    
	    List<Integer> p1=new ArrayList<Integer>(Arrays.asList(-3,2));
	    List<Integer> p7=new ArrayList<Integer>(Arrays.asList(1,2));
	    List<Integer> p8=new ArrayList<Integer>(Arrays.asList(3,2));
	    List<Integer> p2=new ArrayList<Integer>(Arrays.asList(4,2));
	    List<Integer> p3=new ArrayList<Integer>(Arrays.asList(5,4));
//	    List<Integer> p4=new ArrayList<Integer>(Arrays.asList(2,7));
//	    List<Integer> p5=new ArrayList<Integer>(Arrays.asList(1,8));
//	    List<Integer> p6=new ArrayList<Integer>(Arrays.asList(7,9));
	    List<List<Integer>> list=new ArrayList<List<Integer>>(Arrays.asList(p1,p2,p3,p7,p8));
	    SahithOA1 sahithOA1=new SahithOA1();
	    sahithOA1.closestKLocations(list,5);
	  }
}


class Point{
	int dist;
	List<Integer> coordinates;
	public Point(List<Integer> point) {
		coordinates=point;
		this.dist+=point.get(0)*point.get(0);
		this.dist+=point.get(1)*point.get(1);
	}
	
}
