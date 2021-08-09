package com.practice;

import java.util.*;

public class Blend_EmployeeFreeTime {
	public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
		int n = schedule.size();
		List<Interval> ret = new ArrayList<>();
		if (n == 0)
			return ret;
		List<Integer> starts = new ArrayList<Integer>();
		List<Integer> ends = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			List<Interval> employee = schedule.get(i);
			for (Interval it : employee) {
				starts.add(it.start);
				ends.add(it.end);
			}
		}
		Collections.sort(starts);
		Collections.sort(ends);
		n = starts.size();
		for (int i = 0; i < n - 1; i++) {
			if (starts.get(i + 1) > ends.get(i)) {
				ret.add(new Interval(ends.get(i), starts.get(i + 1)));
			}
		}

		return ret;
	}

	public static void main(String[] args) {
		Blend_EmployeeFreeTime emp = new Blend_EmployeeFreeTime();
		Interval time1 = new Interval(43, 76);
		Interval time2 = new Interval(86, 91);
		List<Interval> emp1 = new ArrayList<Interval>(Arrays.asList(time1, time2));
		Interval time3 = new Interval(2, 4);
		List<Interval> emp2 = new ArrayList<Interval>(Arrays.asList(time3));
		Interval time4 = new Interval(17, 20);
		Interval time5 = new Interval(29, 30);
		List<Interval> emp3 = new ArrayList<Interval>(Arrays.asList(time4, time5));
		List<List<Interval>> schedule = new ArrayList<List<Interval>>(Arrays.asList(emp1, emp3));
		emp.employeeFreeTime(schedule);
	}

}

class Interval {
	public int start;
	public int end;

	public Interval() {
	}

	public Interval(int _start, int _end) {
		start = _start;
		end = _end;
	}
};
