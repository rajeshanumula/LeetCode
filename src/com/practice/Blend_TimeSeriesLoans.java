package com.practice;
import java.util.*;

public class Blend_TimeSeriesLoans {
	private Map<Long, Long> getTimeSeries(long[][] loans) {
		TreeMap<Long, Long> res = new TreeMap<>();
		Queue<long[]> minHeap = new PriorityQueue<>((a, b)->(int)(a[0] - b[0]));
		for(long[] l : loans) {
			minHeap.offer(new long[] {l[0], 1});
			minHeap.offer(new long[] {l[1], -1});
		}
		int cnt = 0;
		while(!minHeap.isEmpty()) {
			long[] cur = minHeap.poll();
			cnt += cur[1];
			res.put(cur[0], res.getOrDefault(cur[0], (long)0) + cnt);
		}
		return res;
	}
	public static void main(String[] args) {
		Blend_TimeSeriesLoans time1=new Blend_TimeSeriesLoans();
		long[][] loans = {{1,9}, {3,10}, {2,6},{7, 999999999}};
		time1.getTimeSeries(loans);
	}

}
