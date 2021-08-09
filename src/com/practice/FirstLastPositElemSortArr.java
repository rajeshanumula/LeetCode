package com.practice;

public class FirstLastPositElemSortArr {
	public int[] searchRange(int[] nums, int target) {
		int start=0;
		int end=nums.length-1;
		int mid=(start+end)/2;
		while(start<=end) {
			mid=(start+end)/2;
			if(nums[mid]==target) {
				int i=mid;
				while(mid>=0 && nums[mid]==target) {
					mid--;
				}
				while(i<nums.length && nums[i]==target) {
					i++;
				}
				return new int[] {++mid,--i};
			}
			else if(target<nums[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return new int[]{-1,-1};
	}

	public static void main(String[] args) {
		FirstLastPositElemSortArr fir=new FirstLastPositElemSortArr();
		int[] nums= {5};
		fir.searchRange(nums, 5);
	}

}
