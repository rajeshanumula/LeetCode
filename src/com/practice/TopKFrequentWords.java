package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Map.Entry;
import java.util.*;

public class TopKFrequentWords {
	List<String> topWords = new ArrayList<String>();

	public List<String> topKFrequent(String[] words, int k) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		Comparator<Map.Entry<String, Integer>> sorting = new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> map1, Entry<String, Integer> map2) {
				int diff = map2.getValue() - map1.getValue();
				return diff == 0 ? map1.getKey().compareTo(map2.getKey()) : diff;
			}
		};
		// Either this way
		Queue<Map.Entry<String, Integer>> topQueue = new PriorityQueue<Map.Entry<String, Integer>>(sorting);
		// or this way
		/*
		 * Queue<Map.Entry<String, Integer>> topQueue=new PriorityQueue<>( new
		 * Comparator<Map.Entry<String, Integer>>() {
		 * 
		 * @Override public int compare(Map.Entry<String, Integer>
		 * map1,Map.Entry<String, Integer> map2) { int
		 * diff=map2.getValue()-map1.getValue(); return
		 * diff==0?map1.getKey().compareTo(map2.getKey()):diff; } });
		 */
		topQueue.addAll(map.entrySet());
		while (!topQueue.isEmpty() && k > 0) {
			topWords.add(topQueue.poll().getKey());
			k--;
		}
		return topWords;
	}

	public static void main(String[] args) {
		String[] words = { "i", "love", "leetcode", "i", "love", "coding" };
		TopKFrequentWords top = new TopKFrequentWords();
		top.topKFrequent(words, 3);
	}

}
