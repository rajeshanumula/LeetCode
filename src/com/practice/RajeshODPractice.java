package com.practice;

import java.util.ArrayList;
import java.util.List;

public class RajeshODPractice {
	public List<Integer> helper(int[][] board) {
		int m=board.length;
		ArrayList<Integer> result=new ArrayList<Integer>();
		int curX=m/2;
		int curY=m/2;
		int curr=1;
		result.add(board[curX][curY]);
		int first=1;
		int second=1;
		int top=curX-1;
		int bottom=curX+1;
		int left=curY-1;
		int right=curY+1;
		int j=top+1;
		while(top>=0 && bottom<m && left>=0 && right<m) {
			for(;j<=right;j++) {
				result.add(board[top][j]);
				//result.add(curr);
				int temp=curr;
				curr=second+curr;
				first=second;
				second=temp;
			}
			int i=top+1;
			top--;
			for(;i<=bottom;i++) {
				result.add(board[i][right]);
				//result.add(curr);
				int temp=curr;
				curr=second+curr;
				first=second;
				second=temp;
			}
			j=right-1;
			right++;
			for(;j>=left;j--) {
				result.add(board[bottom][j]);
				//result.add(curr);
				int temp=curr;
				curr=second+curr;
				first=second;
				second=temp;
			}
			i=bottom-1;
			bottom++;
			for(;i>=top && i>=0;i--) {
				result.add(board[i][left]);
				//result.add(curr);
				int temp=curr;
				curr=second+curr;
				first=second;
				second=temp;
			}
			j=left+1;
			left--;
		}
		
		
		return result;
	}
	public static void main(String[] args) {
		int[][] matrix1= {{1,2,3,4,5,6,7},
						 {11,21,31,41,51,61,71},
						 {12,22,32,42,52,62,72},
						 {13,23,33,43,53,63,73},
						 {14,24,34,44,54,64,74},
						 {141,241,341,441,541,642,741},
						 {141,241,341,442,542,642,742}};
		
		int[][] matrix2= {{1,2,3},
				 {11,21,31},
				 {12,22,32}};
		int[][] matrix= {{1}};
		RajeshODPractice board=new RajeshODPractice();
		board.helper(matrix2);
	}

}
