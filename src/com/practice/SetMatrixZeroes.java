package com.practice;
import java.util.*;

public class SetMatrixZeroes {
	public void setZeroes(int[][] matrix) {
		Set<Integer> rows=new HashSet<Integer>();
		Set<Integer> cols=new HashSet<Integer>();
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j]==0) {
					rows.add(i);
					cols.add(j);
				}
			}
		}
		for(int row:rows) {
			for(int i=0;i<matrix[0].length;i++) {
				matrix[row][i]=0;
			}
		}
		for(int col:cols) {
			for(int i=0;i<matrix.length;i++) {
				matrix[i][col]=0;
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix= {{1,2},{0,1}};
		SetMatrixZeroes set1=new SetMatrixZeroes();
		set1.setZeroes(matrix);
	}

}
