package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CourseSchedule {
	HashMap<Integer,ArrayList<Integer>> map=new HashMap<Integer, ArrayList<Integer>>(); 
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		boolean[] finished=new boolean[numCourses];
		boolean[] visited=new boolean[numCourses];
		for(int i=0;i<prerequisites.length;i++) {
			if(map.containsKey(prerequisites[i][0]))
				map.get(prerequisites[i][0]).add(prerequisites[i][1]);
			else 
				map.put(prerequisites[i][0], new ArrayList<Integer>(Arrays.asList(prerequisites[i][1])));
		}
		for(int i=0;i<numCourses;i++) {
			boolean current=helper(i, visited, finished);
			if(!current) return false;
		}
		return true;
	}
	public boolean helper(int i,boolean[] visited,boolean[] finished) {
		if(visited[i]) return false;
		else visited[i]=true;
		boolean current=true;
		while(!finished[i]) {
			if(!map.containsKey(i)) finished[i]=true;
			else {
				for(int j=0;j<map.get(i).size();j++) {
					int k=map.get(i).get(j);
					current=helper(k, visited, finished);
					if(!current) break;
				}
				finished[i]=true;
			}
		}
		visited[i]=false;
		return current;
	}

	public static void main(String[] args) {
		int num=5;
		int[][] pre= {{1,4},{2,4},{3,1},{3,2}};
		CourseSchedule cs=new CourseSchedule();
		cs.canFinish(num, pre);
	}

}
