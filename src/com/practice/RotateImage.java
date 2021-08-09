package com.practice;

public class RotateImage {
	public void rotate(int[][] matrix) {
		int len=matrix.length-1;
		for(int i=0;i<len-i;i++) {
			for(int j=i;j<len-i;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[len-j][i];
				matrix[len-j][i]=matrix[len-i][len-j];
				matrix[len-i][len-j]=matrix[j][len-i];
				matrix[j][len-i]=temp;
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		RotateImage rt=new RotateImage();
		rt.rotate(matrix);
	}

}
