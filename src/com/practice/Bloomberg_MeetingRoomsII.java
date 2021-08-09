package com.practice;
import java.util.*;
public class Bloomberg_MeetingRoomsII {
	public int minMeetingRooms(int[][] intervals) {
		if(intervals.length==1) return 1;
		int rooms=1;
		Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
		//TreeSet<Integer> endTimes1=new TreeSet<Integer>();
		Queue<Integer> endTimes=new PriorityQueue<Integer>((a,b)->a-b);
		endTimes.add(intervals[0][1]);
		for(int i=1;i<intervals.length;i++) {
			if(intervals[i][0]<endTimes.peek()) {
				rooms++;
				endTimes.add(intervals[i][1]);
			}
			else {
				endTimes.poll();
				endTimes.add(intervals[i][1]);
			}
		}
		return rooms;
	}

	public static void main(String[] args) {
		Bloomberg_MeetingRoomsII meet=new Bloomberg_MeetingRoomsII();
		int[][] intervals= {{0,30},{5,10},{15,20},{19,30},{40,45},{40,45}};
		int k= meet.minMeetingRooms(intervals);
		System.out.println(k);
	}

}
