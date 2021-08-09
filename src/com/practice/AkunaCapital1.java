package com.practice;


public class AkunaCapital1 {
	public int helper(int[] utils, int instances) {
		int i=0;
		while(i<utils.length) {
			if(utils[i]<25 && instances>1) {
				instances=(int)Math.ceil((double)instances/2);
				i+=10;
			}
			else if(utils[i]>=25 && utils[i]<=60) i*=1;
			else if(utils[i]>60 && instances*2<=2*Math.pow(10, 8)) {
				instances*=2;
				i+=10;
			}
			i++;
		}
		return instances;
	}
	public static void main(String[] args) {
		AkunaCapital1 ak=new AkunaCapital1();
		int[] utils= {25,23,1,2,3,4,5,6,7,8,9,10,76,80};
		int k=ak.helper(utils,2);
		System.out.println(k);
	}

}
