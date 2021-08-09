package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SmartNews_1 {
	int count=0;
	Set<Integer> set=new HashSet<Integer>();
	public int helper(int[] skills, int[] learn) {
		//set.add(Arrays.asList(learn));
		int i=0;
		
		while(i<learn.length) {
			
		 helperDFS(skills[learn[i]],skills);
		
		 if(set.add(learn[i]))  count++;;
		 i++;
		}
		System.out.println(count);
		return count;
	}
	public void helperDFS(int a,int[] skills) {
		if(set.contains(a)) return;
		else{
			set.add(a);
			count++;
			helperDFS(skills[a],skills);
		}
	}
	public static void main(String[] args) {
		SmartNews_1 smart=new SmartNews_1();
		//int[] skills= {0,0,1,2};
		//int[] learn= {1,2};
		//int[] skills= {0,0,0,0,2,3,3};
		//int[] learn= {2,5,6};
		//int[] skills= {0,3,0,0,5,0,5};
		//int[] learn= {4,2,6,1,0};
		int[] skills= {0,3,0,0,5,0,5};
		int[] learn= {4,2,6,1,0};
		smart.helper(skills,learn);
	}

}
