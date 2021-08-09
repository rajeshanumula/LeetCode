package com.practice;

import java.util.*;

public class TopMarks {
	class StudentRecord{
		int id;
		int subCount;
		int totalMarks;
		double average;
		public StudentRecord(int id, int marks) {
			this.id=id;
			this.totalMarks=marks;
			this.subCount=1;
			this.average=marks;
		}
	}
	public void evaluateStudents(int[][] marks) {
		HashMap<Integer, StudentRecord> map=new HashMap<>();
		for(int[] stRec: marks) {
			if(map.containsKey(stRec[0])) {
				StudentRecord cur=map.get(stRec[0]);
				cur.totalMarks+=stRec[1];
				cur.subCount+=1;
				cur.average=cur.totalMarks/(double)cur.subCount;
			}else {
				StudentRecord rec=new StudentRecord(stRec[0] ,stRec[1]);
				map.put(stRec[0], rec);
			}
			StudentRecord topStudent= getTopMarks(map);
			System.out.println("Student details:  Id: "+topStudent.id+" Marks: "+topStudent.average);
		}
	}
	
	public StudentRecord getTopMarks(HashMap<Integer, StudentRecord> map) {
		StudentRecord top = null;
		int i=0;
		for(int id: map.keySet()) {
			if(i==0) top=map.get(id);
			if(top.average<map.get(id).average) top=map.get(id); 
			i++;
		}
		return top;
		/*
		PriorityQueue<StudentRecord> p=new PriorityQueue<>(new Comparator<StudentRecord>() {
			@Override
			public int compare(StudentRecord a, StudentRecord b) {
				double diff=a.average-b.average;
				return diff>0?-1:1;
			}
		});
		for(int id: map.keySet()) {
			p.offer(map.get(id));
		}
		return p.peek();
		*/
	}
	
	public static void main(String[] args) {
		TopMarks top=new TopMarks();
		int[][] marks= {{1,100},{2,90},{1,70},{2,60},{5,200},{3,100},{4,120},{4,40},{3,20},{5,-200},{1,70}};
		top.evaluateStudents(marks);
	}

}
