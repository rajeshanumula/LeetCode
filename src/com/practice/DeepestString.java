package com.practice;

import java.util.*;

public class DeepestString {
	public ArrayList<String> maxDepthString(String input) {
		ArrayList<ArrayList<String>> allLevels=new ArrayList<>();
		int level=0;
		String curLevelString="";
		for(Character ch:input.toCharArray()) {
			if(ch=='(' ||ch=='{' ||ch=='[') {
				if(level==allLevels.size()) {
					ArrayList<String> temp=new ArrayList<String>();
					temp.add(curLevelString);
					allLevels.add(temp);
				}
				else allLevels.get(level).add(curLevelString);
				curLevelString="";
				level++;
			}
			else if(ch==')' ||ch=='}' ||ch==']') {
				if(level==allLevels.size()) {
					ArrayList<String> temp=new ArrayList<String>();
					temp.add(curLevelString);
					allLevels.add(temp);
				}
				else allLevels.get(level).add(curLevelString);
				curLevelString="";
				level--;
			}
			else curLevelString+=ch;
		}
		if(allLevels.isEmpty()) return new ArrayList<String>();
		return allLevels.get(allLevels.size()-1);
	}

	public static void main(String[] args) {
		DeepestString deep = new DeepestString();
		System.out.println(deep.maxDepthString(""));
	}
}
