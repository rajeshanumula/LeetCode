package com.practice;

import java.util.Arrays;

public class Tutorial {
	public void helper() {
		long age=3_312_234_123L;
		float newAge=12.991f;
		System.out.println(newAge);
		String message="Hello World \"Rajesh\", c:\\Windows\\ProgramFiles";
		System.out.println(message);
		
		int[][] matrix= new int[2][3];
		matrix[0][1]=1;
		matrix[0][2]=2;
		System.out.println(Arrays.deepToString(matrix));
		int a=66;
		System.out.println((char)a);
		
		for(int i=0;i<1000;i++) {
			int min=10;
			int max=100;
			int x=(int)(Math.random()*(max-min+1))+min;
			
			if(x==10) System.out.println("This is 10");
			else if(x==100) System.out.println("This is 100........................!!");
			else System.out.println(x);
		}
	}
	public static void main(String[] args) {
		Tutorial tutorialObj=new Tutorial();
		tutorialObj.helper();
	}

}
