package com.practice;

import java.io.*;
import java.io.IOException;

public class IntegerEnglishWords {
	String[] ones= {"Zero","One", "Two", "Three","Four", "Five", "Six","Seven", "Eight", "Nine","Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen","Twenty"};
	String[] tens= {"Twenty","Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	String[] thousands= {"Billion", "Million","Thousand", "Hundred"};
	int[] denoms= {1000000000,1000000,1000,100,10,1};
	public String numberToWords(int num) {
		StringBuilder word=new StringBuilder();
		int den=0;
		int i=0;
		if(num==0) return "Zero";
		while(num>0) {
			int div=num/denoms[den];
			if(div>0) {
				String sub=helper(div);
				word.append(sub +" ");
				word.append(thousands[i]+" ");
			}
			num%=denoms[den];
			if(num<1000) {
				String sub=helper(num);
				word.append(sub);
				num=0;
			}
			den++;
			i++;
		}
		return word.toString().trim();
	}
	
	public String helper(int subNum) {
		StringBuilder subNumString=new StringBuilder();
		int i=3;
		while(subNum>0) {
			int div=subNum/denoms[i];
			if(subNum>=100 && div>0) {
				subNumString.append(ones[div]+" ");
				subNumString.append(thousands[3]+" ");
			}
			else if(subNum>20 && denoms[i]<100 && div>0) {
				subNumString.append(tens[div-2]+" ");
			}
			else if(subNum>0 && denoms[i]<=10) {
				subNumString.append(ones[subNum]+" ");
				subNum=0;
			}
			subNum%=denoms[i];
			i++;
		}
		return subNumString.toString().trim();
	}
	
	public static void main(String[] args) throws IOException {
		IntegerEnglishWords eng=new IntegerEnglishWords();
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("*********************************");
			System.out.println("Enter input");
			int val=Integer.parseInt(reader.readLine());
			System.out.println(eng.numberToWords(val));
		}
	}

}
