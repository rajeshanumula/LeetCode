package com.practice;

public class RotateImage2t {
	public void rotate(int[][] matrix) {
		int m=matrix.length-1;
		int n=m;
		for(int i=0;i<=m/2;i++) {
			for(int j=i;j<n-i;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[m-j][i];
				matrix[m-j][i]=matrix[n-i][m-j];
				matrix[n-i][m-j]=matrix[j][n-i];
				matrix[j][n-i]=temp;
			}
		} 
	}

	public static void main(String[] args) {
		RotateImage2t rt=new RotateImage2t();
		int[][] matrix= {{1,2},{3,4}};
		rt.rotate(matrix);
	}
}
