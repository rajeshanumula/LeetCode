package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddDigits {
	public int addDigits(int num) {
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
			if(num==0 && sum>9) {
				num=sum;
				sum=0;
			}
		}
		return sum;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int num=Integer.valueOf(br.readLine());
		AddDigits ad=new AddDigits();
		ad.addDigits(num);
	}

}
