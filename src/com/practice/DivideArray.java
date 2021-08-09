package com.practice;
import java.util.*;
public class DivideArray {
	public boolean isPossibleDivide(int[] nums, int k) {
		int n = nums.length;
        if (n % k != 0) {
            return false;
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]>0){
            	int cap=0;
            	int prev=-1;
                for(int j=0;i+j<n && cap<k;j++){
                    if(nums[i+j]==0) continue;
                    else if(nums[i+j]==prev) {
                    	continue;
                    }
                    else{
                        if(j!=0 && nums[i+j]!=prev+1) return false;
                        cap++;
                        prev=nums[i+j];
                        nums[i+j]=0;
                    }
                }
                if(cap!=k) return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		DivideArray div=new DivideArray();
		int[] nums= {1,1,2,2,3,3,4,6,4,5};
		div.isPossibleDivide(nums, 2);
	}

}
