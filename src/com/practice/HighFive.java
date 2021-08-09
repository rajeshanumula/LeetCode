package com.practice;
import java.util.*;

public class HighFive {
	public int[][] highFive(int[][] items) {
		HashMap<Integer, Student> map = new HashMap<>();
		for (int i = 0; i < items.length; i++) {
			if (map.containsKey(items[i][0])) {
				Student st = map.get(items[i][0]);
				st.q.add(items[i][1]);
				st.sum += items[i][1];
				if (st.q.size() > 5) {
					st.sum -= st.q.peek();
					st.q.poll();
				}
			} else {
				Student st = new Student(items[i][0],items[i][1]);
				map.put(items[i][0], st);
			}
		}
		int[][] result = new int[map.size()][2];
		int i = 0;
		for (Map.Entry<Integer, Student> student : map.entrySet()) {
			result[i][0] = student.getKey();
			result[i][1] = student.getValue().sum / 5;
			i++;
		}
		return result;
	}

	public static void main(String[] args) {
		HighFive h=new HighFive();
		int[][] sts= 
				{{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
		h.highFive(sts);
	}
}

class Student {
	int id;
	int sum;
	Queue<Integer> q;

	public Student(int s_id,int marks) {
		this.q = new PriorityQueue<>((a, b) -> a.compareTo(b));
		this.q.add(marks);
		this.id = s_id;
		this.sum =marks;
	}
}
