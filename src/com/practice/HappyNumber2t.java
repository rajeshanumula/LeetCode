package com.practice;
import java.util.*;

public class HappyNumber2t {
	public boolean isHappy(int n) {
		Set<Integer> set=new HashSet<Integer>();
		set.add(n);
		int rem=0;
		while(n>0) {
			rem+=((n%10) * (n%10));
			n=n/10;
			if(n==0 && rem==1) return true;
			else if(n==0) {
				if(!set.add(rem)) return false;
				n=rem;
				rem=0;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		HappyNumber2t hap=new HappyNumber2t();
		hap.isHappy(2);
	}

}
