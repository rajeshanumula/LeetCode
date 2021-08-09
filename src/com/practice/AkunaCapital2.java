package com.practice;

public class AkunaCapital2 {
	public int helper(int low, int high) {
		int count=0;
		boolean[] arr=new boolean[high-low];
		for(int i=1;i<=high;) {
			if(i>=low && i<=high) {
				arr[i-low]=true;
				count++;
			}
			i*=3;
		}
		for(int i=1;i<=high;) {
			if(i>=low && i<=high && !arr[i]) {
				arr[i-low]=true;
				count++;
			}
			i*=5;
		}
        return count;
	}
	public static void main(String[] args) {
		AkunaCapital2 cap=new AkunaCapital2();
		int k=cap.helper(200, 405);
		System.out.println(k);
	}

}
