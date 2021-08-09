package com.practice;

public class PlusOne {
	public int[] plusOne1(int[] digits) {
		int len=digits.length;
		int carry=1;
		for(int i=len-1;i>=0;i--) {
			if(digits[i]==9) {
				digits[i]=0;
				carry=1;
			}
			else if(carry==1){
				digits[i]+=1;
				carry=0;
				break;
			}
		}
		if(carry==1) {
			int[] newdigits=new int[len+1];
			newdigits[0]=1;
			for(int i=1;i<len+1;i++) {
				newdigits[i]=digits[i-1];
			}
			return newdigits;
		}
		return digits;
	}
	public int[] plusOne(int[] digits) {
        
	    int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }
	        
	        digits[i] = 0;
	    }
	    
	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;
	    
	    return newNumber;
	}
	
	public static void main(String[] args) {
		PlusOne plus=new PlusOne();
		int[] digits= {9,8,7,6,5,4,3,2,1,0};
		plus.plusOne(digits);
	}
}
