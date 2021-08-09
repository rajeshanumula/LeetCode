package com.practice;

import java.util.*;

public class SahithOD2 {
	public void checkUnique(int times) {
		int max = 20000;
		int min = 10000;
		int count=0;
		Set<Integer> set = new HashSet<Integer>();
		while (times >= 0) {
			boolean isPresent = false;
			while (!isPresent) {
				int randomNum = (int) ((max - min + 1) * Math.random() + min);
				if (!set.contains(randomNum)) {
					set.add(randomNum);
					System.out.println(randomNum+"--->"+System.currentTimeMillis()+"    Count: "+count++);
					isPresent=!isPresent;
				}
			}
		}
		times--;
	}

	public static void main(String[] args) {
		SahithOD2 s = new SahithOD2();
		s.checkUnique(10);
	}

}
