package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
	public int[][] merge(int[][] intervals) {
		if(intervals.length==1) return intervals;
		ArrayList<Intervals> tempList=new ArrayList<Intervals>();
		Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
		int curStart=intervals[0][0];
		int curEnd=intervals[0][1];
		for(int i=1;i<intervals.length;i++) {
			if(curEnd>=intervals[i][0]) curEnd=Math.max(curEnd,intervals[i][1]);
			else {
				tempList.add(new Intervals(curStart, curEnd));
				if(i<intervals.length) {
					curStart=intervals[i][0];
					curEnd=intervals[i][1];
				}
			}
		}
		tempList.add(new Intervals(curStart, curEnd));
		int[][] result=new int[tempList.size()][2];
		for(int i=0;i<result.length;i++) {
			result[i][0]=tempList.get(i).x;
			result[i][1]=tempList.get(i).y;
		}
		return result;
	}
	public int[][] merge1(int[][] intervals) {
		if(intervals.length==1) return intervals;
		ArrayList<int[]> tempList=new ArrayList<>();
		Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
		int curStart=intervals[0][0];
		int curEnd=intervals[0][1];
		for(int i=1;i<intervals.length;i++) {
			if(curEnd>=intervals[i][0]) curEnd=Math.max(curEnd,intervals[i][1]);
			else {
				tempList.add(new int[] {curStart, curEnd});
				if(i<intervals.length) {
					curStart=intervals[i][0];
					curEnd=intervals[i][1];
				}
			}
		}
		tempList.add(new int[] {curStart, curEnd});
		int[][] res=tempList.toArray(new int[tempList.size()][]);
		return res;
	}

	public static void main(String[] args) {
		MergeIntervals mer=new MergeIntervals();
		int[][] intervals= 
			{{1,3},{2,6},{8,10},{15,18},{4,6},{20,40},{41,60},{60,70}};
		mer.merge(intervals);
	}
}
class Intervals{
	int x;
	int y;
	public Intervals(int i,int j) {
		this.x=i;
		this.y=j;
	}
}
