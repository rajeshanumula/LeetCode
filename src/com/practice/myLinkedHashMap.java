package com.practice;
import java.util.*;

public class myLinkedHashMap {
	public void helper() {
		Map<Integer, String> myLinkedHashMapObject = new LinkedHashMap<Integer, String>();  
		myLinkedHashMapObject.put(3, "car");  
		myLinkedHashMapObject.put(5, "bus");  
		myLinkedHashMapObject.put(4, "nano");  
		myLinkedHashMapObject.put(9, "innova");  
		myLinkedHashMapObject.put(8, "innova1");
		myLinkedHashMapObject.put(8, "innova2");
		System.out.println("Modification Before" + myLinkedHashMapObject);  
		System.out.println("Vehicle exists: " +myLinkedHashMapObject.containsKey(3));  
		System.out.println("vehicle innova Exists: "+myLinkedHashMapObject.containsValue("innova"));  
		System.out.println("Total number of vehicles: "+ myLinkedHashMapObject.size());  
		System.out.println("Removing vehicle 9: " + myLinkedHashMapObject.remove(9));  
		System.out.println("Removing vehicle 25 (does not exist): " + myLinkedHashMapObject.remove(25));  
		System.out.println("LinkedHashMap After modification" + myLinkedHashMapObject); 
		System.out.println("********************************");
		Map<Integer, String> myHashMap = new HashMap<Integer, String>();  
		myHashMap.put(3, "car");  
		myHashMap.put(5, "bus");  
		myHashMap.put(4, "nano");  
		myHashMap.put(9, "innova");  
		myHashMap.put(8, "innova1");
		myHashMap.put(8, "innova2");
		System.out.println("Modification Before" + myHashMap.values());  
		System.out.println("Vehicle exists: " +myHashMap.containsKey(3));  
		System.out.println("vehicle innova Exists: "+myHashMap.containsValue("innova"));  
		System.out.println("Total number of vehicles: "+ myHashMap.size());  
		System.out.println("Removing vehicle 9: " + myHashMap.remove(8));  
		System.out.println("Removing vehicle 25 (does not exist): " + myHashMap.remove(25));  
		System.out.println("HashMap After modification" + myHashMap);
		Map<Integer, String> myTreeMap = new TreeMap<Integer, String>();
		myTreeMap.put(3, "car");  
		myTreeMap.put(5, "bus");  
		myTreeMap.put(4, "nano");  
		myTreeMap.put(9, "innova");  
		myTreeMap.put(8, "innova1");
		myTreeMap.put(8, "innova");
		//Queue<Map.Entry<Integer, String>> que=new PriorityQueue<Map.Entry<Integer,String>>((a,b)->a.getValue().compareTo(b.getValue()));
		Queue<Map.Entry<Integer, String>> que=new PriorityQueue<>(new Comparator<Map.Entry<Integer,String>>() {
			@Override
			public int compare(Map.Entry<Integer,String> a, Map.Entry<Integer,String> b) {
				int diff= a.getValue().compareTo(b.getValue());
				return diff==0?b.getKey()-a.getKey():diff;
			}
		});
		que.addAll(myTreeMap.entrySet());
		System.out.println("Modification Before" + myTreeMap.values());  
		while(!que.isEmpty())
			System.out.println(que.poll());
	}
	public static void main(String[] args) {
		myLinkedHashMap map=new myLinkedHashMap();
		map.helper();
	}

}
