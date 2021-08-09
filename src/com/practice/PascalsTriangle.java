package com.practice;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle=new ArrayList<List<Integer>>();
		for(int i=0;i<numRows;i++) {
			ArrayList<Integer> curRow=new ArrayList<Integer>();
			curRow.add(1);
			int j=1;
			while(j<i) {
				curRow.add(j,triangle.get(i-1).get(j)+triangle.get(i-1).get(j-1));
				j++;
			}
			if(numRows>1 && i>0)curRow.add(1);
			triangle.add(curRow);
		}
		return triangle;
	}
	
	public List<List<Integer>> generateOther(int numRows)
	{
		List<List<Integer>> allrows = new ArrayList<List<Integer>>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		for(int i=0;i<numRows;i++)
		{
			row.add(0, 1);
			for(int j=1;j<i;j++)
				row.set(j, row.get(j)+row.get(j+1));
			allrows.add(new ArrayList<Integer>(row));
		}
		return allrows;
	}

	public static void main(String[] args) {
		PascalsTriangle pas=new PascalsTriangle();
		pas.generateOther(6);
	}

}
