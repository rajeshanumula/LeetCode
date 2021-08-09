package com.practice;

import java.util.Random;

public class RandomFunction {
	public void myRandom(int max) {
		Random ran=new Random();
		System.out.println(ran.nextInt(max));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomFunction r=new RandomFunction();
		r.myRandom(100000);
	}

}
