package com.practice;

import java.util.ArrayList;

class Coordinates{
	int i;
	int j;
	public Coordinates(int x,int y) {
		this.i=x;
		this.j=y;
	}
}
public class CandyCrush {
	public int[][] candyCrush(int[][] board) {
		ArrayList<Coordinates> crush=new ArrayList<Coordinates>();
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				int cur=board[i][j];
				if(cur==0) continue;
				if((i-2>=0 && board[i-2][j]==cur && board[i-1][j]==cur) ||
					(i-1>=0 && i+1<board.length&& board[i-1][j]==cur && board[i+1][j]==cur) ||
					(i+2<board.length && board[i+2][j]==cur && board[i+1][j]==cur) ||
					(j-2>=0 && board[i][j-2]==cur && board[i][j-1]==cur) ||
					(j-1>=0 && j+1<board[0].length && board[i][j-1]==cur && board[i][j+1]==cur) ||
					(j+2<board[0].length && board[i][j+1]==cur && board[i][j+2]==cur)) {
					crush.add(new Coordinates(i, j));
				}
			}
		}
		if(crush.size()==0) return board;
		for(Coordinates cur:crush) board[cur.i][cur.j]=0;
		rearrangeBoard(board);
		return candyCrush(board);
	}
	
	public void rearrangeBoard(int[][] board) {
		for(int j=0;j<board[0].length;j++) {
			int top=board.length-1;
			int bottom=board.length-1;
			while(top>=0) {
				if(board[top][j]==0) top--;
				else {
					board[bottom--][j]=board[top--][j];
				}
			}
			while(bottom>=0) board[bottom--][j]=0;
		}
	}

	public static void main(String[] args) {
		int[][] board=
				{{110,5,112,113,114},
				 {210,211,5,213,214},
				 {310,311,3,313,314},
				 {410,411,412,5,414},
				 {5,1,512,3,3},
				 {610,4,1,613,614},
				 {710,1,2,713,714},
				 {810,1,2,1,1},
				 {1,1,2,2,2},
				 {4,1,4,4,1014}};
		CandyCrush can=new CandyCrush();
		int[][] result=can.candyCrush(board);
		System.out.println(result);
	}

}
