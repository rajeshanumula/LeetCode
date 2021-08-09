package com.practice;

import java.util.HashMap;

public class SahithOD {
	class Day{
		int dayNo;
		int initialLevel=0;
		int dayTimeLevel;
		int nightTimeLevel;
		public Day(int day,int startCap, int dayLevel, int nightLevel) {
			this.dayTimeLevel=dayLevel;
			this.nightTimeLevel=nightLevel;
			this.dayNo=day;
			this.initialLevel=startCap;
		}
	}
	
	public void helper(int maxCap, int raise, int fall) {
		HashMap<Integer, Day> map=new HashMap<>();
		int dayNum=1;
		int dayLevel=raise;
		int nightLevel=dayLevel+fall;
		Day day=new Day(dayNum, 0, raise, nightLevel);
		map.put(dayNum, day);
		while(day.dayTimeLevel<maxCap) {
			int todayInitial=day.nightTimeLevel;
			int todayDayLevel=todayInitial+raise;
			int todayNightLevel=todayDayLevel+fall;
			dayNum++;
			day=new Day(dayNum, todayInitial, todayDayLevel, todayNightLevel);
			map.put(dayNum, day);
			System.out.println("DayNumber: "+dayNum+" Morning: "+todayInitial+" Evening:"+todayDayLevel+" Night:"+
			todayNightLevel);
		}
		System.out.println("It has reached its max Capacity on day Number ::  "+day.dayNo);
	}
	public static void main(String[] args) {
		SahithOD s=new SahithOD();
		s.helper(30, 3, -2);
	}

}
