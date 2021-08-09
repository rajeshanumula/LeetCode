package com.practice;

public class AddBinary {
	public String addBinary(String a, String b) {
		String sb="";
		int carry=0;
		int acurrent=0;
		int bcurrent=0;
		int i=a.length()-1,j=b.length()-1;
		for(;i>=0||j>=0;i--,j--) {
			acurrent= (i>=0 && a.charAt(i)=='1')?1:0;
			bcurrent= (j>=0 && b.charAt(j)=='1')?1:0;
			int sum=carry+acurrent+bcurrent;
			switch (sum){
			case 3: {
				carry=1;
				sb="1"+sb;
				break;
			}
			case 2: {
				carry=1;
				sb="0"+sb;
				break;
			}
			default:
				carry=0;
				sb=String.valueOf(sum)+sb;
				break;
			}
		}
		if(carry==1) {
			sb="1"+sb;
		}	
		return sb;
	}

	public static void main(String[] args) {
		AddBinary addBinary=new AddBinary();
		String a="10";
		String b="101111";
		addBinary.addBinary(a, b);
	}

}
