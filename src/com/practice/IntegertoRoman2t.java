package com.practice;

public class IntegertoRoman2t {
	public String intToRoman(int num) {
		int[] nums= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] letters= {"M","CM","D", "CD","C","XC","L", "XL","X","IX","V","IV","I"};
		String result="";
		int i=0;
		while(num>0 && i<13) {
			if(num>=nums[i]) {
				result+=letters[i];
				num-=nums[i];
			}
			else i++;
		}
		return result;
	}

	public static void main(String[] args) {
		IntegertoRoman2t rom=new IntegertoRoman2t();
		String res=rom.intToRoman(3999);
		String binary=Integer.toBinaryString(15);
		String hex=Integer.toHexString(15);
		System.out.println("Binary:" +binary);
		System.out.println("Hex:" +hex);
		System.out.println(Integer.parseInt(binary, 2));
		System.out.println(Integer.parseInt(hex,16));
		System.out.println(res);
	}

}
