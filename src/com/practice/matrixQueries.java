package com.practice;

import java.util.*;

public class matrixQueries {
	public Long[] matrix(int n, int m, int[][] queries) {
		List<Long> result = new ArrayList<Long>();
		int[][] matrix = new int[n][m];
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = (i + 1) * (j + 1);
				list.add((i + 1) * (j + 1));
			}
		}
		for (int i = 0; i < queries.length; i++) {
			if (queries[i].length == 1) {
				Collections.sort(list);
				result.add((long) list.get(0));
			} else {
				if (queries[i][0] == 1) {
					removerRows(queries[i][1],m,matrix,list);
				} else if (queries[i][0] == 2) {
					removerCols(queries[i][1],n,matrix,list);
				}
			}
		}
		Long[] res=new Long[result.size()];
		res=result.toArray(res);
		return res;
	}

	public void removerRows(int cur,int m,int[][] matrix,List<Integer> list) {
		for(int i=0;i<m;i++) {
			list.remove(matrix[cur][i]);
			matrix[cur][i]=0;
		}
	}

	public void removerCols(int cur,int n,int[][] matrix,List<Integer> list) {
		for(int i=0;i<n;i++) {
			list.remove(matrix[i][cur]);
			matrix[i][cur]=0;
		}
	}

	public static void main(String[] args) {
		matrixQueries mat = new matrixQueries();
		int[][] queries = { { 0 }, { 1, 2 }, { 0 }, { 2, 1 }, { 0 } };
		mat.matrix(3, 4, queries);
	}

}
