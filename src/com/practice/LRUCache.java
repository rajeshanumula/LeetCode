package com.practice;
import java.util.*;

public class LRUCache {
	
	//This way using Queues but takes O(N) to remove elements
	int capacity;
    Queue<Integer> q;
    Map<Integer,Integer> map;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        q=new LinkedList<>();
        map=new HashMap<>();
    }
    
    public int get(int key) {
        if (map.containsKey(key)) {
            q.remove(key);
            q.offer(key);
            return map.get(key);
        } else 
            return -1;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            q.remove(key);
            q.offer(key);
            map.put(key,value);
        } else {
            if(q.size() != capacity) {
                q.offer(key);
            } else {
                map.remove(q.poll());
                q.offer(key);
            }
                map.put(key,value);
        }
    }
    
    
    
    
    // Or this way using double linked list:
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
