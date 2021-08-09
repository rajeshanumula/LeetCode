package com.practice;

import java.util.HashMap;

public class BlackRock3 {
	public void helper(String input1) {
		String portfolio=input1.split("\\:")[0];
		String benchmarks=input1.split("\\:")[1];
		String[] eachfolio=portfolio.split("\\|");
		HashMap<String, Integer> map=new HashMap<>();
	}
	public static void main(String[] args) {
		BlackRock3 br=new BlackRock3();
		String input="MS,Bond,15|MS,Stock,15|UNCC,Stock,15:MS,Bond,10|UNCC,Stock,20|UNCC,Bond,15";
		br.helper(input);
	}

}
