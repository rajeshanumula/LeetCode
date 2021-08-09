package com.practice;
import java.util.*;
public class PrampMerging2Packages {
	static int[] getIndicesOfItemWeights(int[] arr, int limit) {
		HashMap<Integer, Integer> map=new HashMap<>();
	    int[] res=new int[2];
	    for(int k=0;k<arr.length;k++){
	      int rem=limit-arr[k];
	      if(map.containsKey(rem)){
	        res[0]=k;
	        res[1]=map.get(rem);
	        return res;
	      }
	      map.put(arr[k],k);
	    }
	    return null;  
	}
	
	public static void main(String[] args) {
	    int[] arr={4, 6, 10, 15,13,18,27,19, 16};
	    int limit=21;
	    int[] result=getIndicesOfItemWeights(arr,limit);
	    System.out.println(result[0]+","+result[1]);
	}

}
