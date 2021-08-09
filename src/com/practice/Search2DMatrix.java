package com.practice;

public class Search2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		int i=matrix.length-1;
		while(i>0) {
			if(matrix[i][0]>target) i--;
			else break;
		}
		for(int j=0;j<matrix[0].length;j++) {
			if(matrix[i][j]==target) return true;
			else if(matrix[i][j]>target) return false;
		}
		return false;
	}

	public static void main(String[] args) {
		Search2DMatrix mat=new Search2DMatrix();
		int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		mat.searchMatrix(matrix, 3);
	}

}
