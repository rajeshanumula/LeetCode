package com.practice;

public class prampArrayIndex {

	int curBest=-1;
	  int indexEqualsValueSearch(int[] arr) {
	    // your code goes here
	    int low=0;
	    int high=arr.length;
	    int result= findPos(arr, low, high);
	    if(result==-1) return this.curBest;
	    return result;
	  }
	  
	  int findPos(int[] arr, int l, int h){
	    if(l>h) return -1;
	    int result=-1;
	    int mid=(l+h)/2;
	    if(mid==arr[mid]){
	      curBest=mid;
	      result=findPos(arr, l, mid-1);
	    }
	    else if(mid>arr[mid]){
	      result=findPos(arr, mid+1, h);
	    }
	    else{
	      result=findPos(arr, l, mid-1);
	     // if(result!=-1) result=findPos(arr, mid+1, h);
	    }
	    return result;
	  }

	  public static void main(String[] args) {
		  int[] nums= {-5,0,2,3,10,29};
		  prampArrayIndex arr=new prampArrayIndex();
		  System.out.println(arr.indexEqualsValueSearch(nums));
	  }

}
