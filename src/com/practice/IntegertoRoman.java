package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class IntegertoRoman {
	public String intToRoman(int num) {
		if(num==0) return "";
		HashMap<Integer, Character> map=new HashMap<Integer, Character>();
		map.put(1, 'I');
		map.put(5, 'V');
		map.put(10, 'X');
		map.put(50, 'L');
		map.put(100, 'C');
		map.put(500, 'D');
		map.put(1000, 'M');
		String result="";
		int numerator=num;
		int div=1000;
		while(div>0) {
			num=numerator/div;
			if(num>8) {
				result+=map.get(div);
				result+=map.get((num*div)+div);
			}
			else if(num>=6 && num<=8) {
				result+=map.get(5*div);
				num-=5;
				while(num>0) {
					result+=map.get(div);
					num--;
				}
			}
			else if(num==5){
				result+=map.get((num)*div);
			}
			else if(num>3) {
				result+=map.get(div);
				result+=map.get((num*div)+div);
			}
			else if(num>=1 && num<=3) {
				while(num>0) {
					result+=map.get(div);
					num--;
				}
			}
			
			numerator=numerator%div;
			div/=10;
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int num=Integer.valueOf(br.readLine());
		IntegertoRoman roman=new IntegertoRoman();
		String res=roman.intToRoman(num);
		System.out.println(res);
	}

}
