package com.practice;

import java.util.ArrayList;
import java.util.List;

public class PartitionIntoSubsets {
	public List<Integer> canPartition(int[] nums) {
		if(nums.length==1) return new ArrayList<Integer>();
        int sum=0;
        for(int num:nums) sum+=num;
        if(sum%2==1) return new ArrayList<Integer>();
        sum=sum/2;
        boolean formed=false;
        List<Integer> result=new ArrayList<>();
        List[][] dp=new ArrayList[nums.length][sum+1];
        if(nums[0]<=sum) {
        	dp[0][nums[0]]=new ArrayList<Integer>();
        	dp[0][nums[0]].add(0);
        }
        for(int i=1;i<nums.length;i++){
        	if(formed) break;
            if(nums[i]>sum) continue;
            if(nums[i]==sum) {
            	if(dp[i][nums[i]]==null) dp[i][nums[i]]=new ArrayList<Integer>();
            	dp[i][nums[i]].add(i);
            	return dp[i][nums[i]];
            }
            if(dp[i][nums[i]]==null)	dp[i][nums[i]]=new ArrayList<Integer>();
            dp[i][nums[i]].add(i);
            for(int j=0;j<=sum;j++){
                if(dp[i-1][j]!=null){
                	if(dp[i][j]==null) dp[i][j]=new ArrayList<Integer>(dp[i-1][j]);
                    if(j+nums[i]<=sum) {
                    	if(dp[i][j+nums[i]]==null) dp[i][j+nums[i]]=new ArrayList<Integer>(dp[i][j]);
                    	dp[i][j+nums[i]].add(i);
                    }
                }
                if(dp[i][sum]!=null) {
                	return dp[i][sum];
                }
            }
        }
        return dp[nums.length-1][sum];
	}
	public static void main(String[] args) {
		PartitionIntoSubsets obj=new PartitionIntoSubsets();
		int[] nums= {1,2,3,10,4,12,9,3};
		obj.canPartition(nums);
	}

}
