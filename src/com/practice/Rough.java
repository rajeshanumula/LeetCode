package com.practice;

import java.util.*;

public class Rough {
	public int minSubArrayLen(int target, int[] nums) {
		int s = target;
		if (nums == null || nums.length == 0)
			return 0;

		int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

		while (j < nums.length) {
			sum += nums[j++];

			while (sum >= s) {
				min = Math.min(min, j - i);
				sum -= nums[i++];
			}
		}

		return min == Integer.MAX_VALUE ? 0 : min;
	}
	public int find(int a,int b) {
		while(a!=b) {
			if(a>b)a-=b;
			if(b>a) b-=a;
		}
		return a;
	}
	public int indexEqualsValueSearch (int[] arr)
	{
		int res=Integer.MAX_VALUE;
		
		int i=0;
		int j= arr.length-1;	
		while(i<=j)
		{
			int mid= (i+j)/2;
			if(arr[mid]==mid)
			{
				res= Math.min(res, mid);
				j=mid-1;
			}			
			else if(arr[mid]<mid)
			{
				i=mid+1;
			}
			else j=mid-1;			
		}
				
		return res==Integer.MAX_VALUE?-1:res;
	}
	public static int indexEqualsValueSearch1 (int[] arr)
	{
		int res=Integer.MAX_VALUE;
		
		int i=0;
		int j= arr.length;
		
		
		while(i<j)
		{
			int mid= (i+j)/2;
			if(arr[mid]==mid)
			{
				res= Math.min(res, mid);
				j=mid;
			}			
			else if(arr[mid]>mid)
			{
				j=mid;
			}
			else
				i=mid+1;
						
		}
				
		return res==Integer.MAX_VALUE?-1:res;
	}
	public int getUmb(List<Integer> umb, int target) {
		int i=0;int j=0;int sum=0;
		int min=Integer.MAX_VALUE;
		while(j<umb.size()) {
			sum+=umb.get(j);
			if(sum==target) {
				if(min>j-i+1) min=j-i+1;
			}
			while(sum>target) {
				sum-=umb.get(i++);
				if(sum==target) {
					if(min>j-i+1) min=j-i;
				}
			}
			j++;
		}
		return min;
	}
	ArrayList<Integer> sums=new ArrayList<>();
    public int shortestSubarray(int[] A, int K) {
        int max=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<A.length;i++){
            if(A[i]>=K) return 1;
            sum+=A[i];
            if(sum>=K){
                int index=findIndex(sum-K);
                if(index==-1){
                    max=i+1;  
                }
                else{
                    if(i-index-1<max) max=i-index-1;
                }
            }
            sums.add(sum);
        }
        return max==Integer.MAX_VALUE?-1:max;
    }
    public int findIndex(int sum){
        for(int i=0;i<sums.size();i++){
            if(sums.get(i)<=sum) return i;
        }
       return -1; 
    }
	public void my2DSort(int[][] students) {
		List<int[]> arrayList= new ArrayList<int[]>();
		
		
		Arrays.sort(students,(a,b)->a[0]-b[0]==0?b[1]-a[1]:a[0]-b[0]);
		int curId=students[0][0];
		int curSum=students[0][1];
		for(int i=1;i<students.length;i++) {
			for(int j=1;i<students.length && j<5;j++) {
				curSum+=students[i][1];
			}
			while(curId==students[i][0]) i++;
			curId=students[i][0];
			curSum=students[i][1];
		}
	}
	
	public static void main(String[] args) {
		Rough r=new Rough();
		/*
		int[] nums= {2,3,7,1,2,4,1,3};
		r.minSubArrayLen(7, nums);
		int[] arr= {-1,0,1,2,3,4,6,7,8,9};
		int k=r.indexEqualsValueSearch1(arr);
		System.out.println(k);
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(2,3,1,2));
		int k=r.getUmb(list, 13);
		System.out.println(k);
		int res=r.find(2437,875);
		System.out.println(res);
		
		int[] nums= {1,2,3,4,5,6,4,32,-32,43,4,5,-43};
		r.shortestSubarray(nums, 55);
		*/
		int[][] st= {{3,7},{3,8},{3,4},{3,3},{3,0},{3,7},{3,7},{3,7},{1,3},{1,4},{1,6},{1,1},{1,3},{1,4},{1,6},{1,1},{2,5},{2,3},{2,8},{2,1},{2,3},{2,8},{2,1}};
		r.my2DSort(st);
		
	}

}
