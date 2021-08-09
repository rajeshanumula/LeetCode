package com.practice;
import java.util.*;

public class Blend_PowerCompany {
	public int helper(int[] models) {
		int n=models.length/2 +( models.length%2==0?0:1);
		HashMap<Integer, Integer> map=new HashMap<>();
		int i=0;
		while(i<models.length) {
			if(map.containsKey(models[i])) map.put(models[i],map.get(models[i])+1);
			else map.put(models[i],	1);
			i++;
		}
		Queue<Map.Entry<Integer, Integer>> entry=new PriorityQueue<Map.Entry<Integer,Integer>>((a,b)->b.getValue()-a.getValue());
		//Queue<Map.Entry<Integer, Integer>> entry=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
		entry.addAll(map.entrySet());
		int resCount=0;
		while(!entry.isEmpty() && n>=0) {
			System.out.println(entry.peek().getKey()+"-->>"+entry.peek().getValue());
			n-=entry.poll().getValue();
			resCount++;
		}
		System.out.println(resCount);
		System.out.println("From HelperDuplicate");
		helperDuplicate(models);
		return resCount;
	}
	
	public void helperDuplicate(int[] models) {
		int n=models.length/2 +( models.length%2==0?0:1);
		HashMap<Integer, Integer> map=new HashMap<>();
		int i=0;
		while(i<models.length) {
			if(map.containsKey(models[i])) map.put(models[i],map.get(models[i])+1);
			else map.put(models[i],	1);
			i++;
		}
		Queue<Map.Entry<Integer, Integer>> entry=new PriorityQueue<>();
		entry.addAll(map.entrySet());
		while(!entry.isEmpty()) {
			System.out.println(entry.peek().getKey()+"-->>"+entry.poll().getValue());
		}
	}
	public static void main(String[] args) {
		Blend_PowerCompany ble=new Blend_PowerCompany();
		int[] models= {3,4,6,11,9,9,9,9,8,8,8,8,8,8};
		ble.helper(models);
	}

}
