package com.practice;

import java.util.*;

public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		ArrayList<Integer> result=new ArrayList<Integer>();
		int left=0, right=matrix[0].length-1;
		int top=0, bottom=matrix.length-1;
		for(int i=top;i<=bottom;i++) {
			for(int j=left;j<=right;j++) {
				while(j<=right && i<=bottom) {
					result.add(matrix[i][j++]);
				}
					top++;
					j=right;
					i++;
				while(i<=bottom && j>=left) {
					result.add(matrix[i++][j]);
				}
				right--;
				i=bottom;
				j--;
				while(j>=left && i>=top) {
					result.add(matrix[i][j--]);
				}
				bottom--;
				j=left;
				i--;
				while(i>=top && j<=right) {
					result.add(matrix[i--][j]);
				}
				left++;
				i++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		SpiralMatrix mat=new SpiralMatrix();
		int[][] matrix= {{1,4},{2,5},{3,6}};
		//{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}
		mat.spiralOrder(matrix);
	}

}
