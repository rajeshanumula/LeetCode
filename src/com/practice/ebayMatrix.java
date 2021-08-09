package com.practice;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class ebayMatrix {
	public int[] helper(char[][] a) {
		int count=1;
		HashMap<Integer, String> map=new HashMap<>();
		int i=a.length-1,j=1;
		while(i>=0) {
			String cur="";
			while(cur.length()!=a.length) {
				int k=i;
				int l=0;
				while(k<a.length) {
					cur+=a[k][l];
					k++;
					l++;
					if(cur.length()==a.length) break;
				}
			}
			map.put(count++,cur);
			i--;
		}
		while(j<a.length) {
			String cur="";
			while(cur.length()!=a.length) {
				int k=0;
				int l=j;
				while(l<a.length) {
					cur+=a[k][l];
					k++;
					l++;
					if(cur.length()==a.length) break;
				}
			}
			map.put(count++,cur);
			j++;
		}
		int k=0;
		Queue<Map.Entry<Integer, String>> sorted=new PriorityQueue<Map.Entry<Integer,String>>((a1,a2) -> a1.getValue().compareTo(a2.getValue()));
		sorted.addAll(map.entrySet());
		int[] arr=new int[2*a.length-1];
		while(!sorted.isEmpty()) {
			arr[k++]=sorted.poll().getKey();
		}
		return arr;
	}
	public static void main(String[] args) {
		ebayMatrix eb=new ebayMatrix();
		char[][] arr= {{'b','c','d','h','a'},
						{'x','a','a','a','e'},
						{'z','b','a','a','e'},
						{'a','a','c','d','e'},
						{'a','a','d','d','e'},};
		eb.helper(arr);
	}

}
