package com.practice;
import java.util.*;
public class ValidSudoku2t {
	public boolean isValidSudoku(char[][] board) {
		for(int i=0;i<9;i++) {
			Set<Character> set=new HashSet<Character>();
			for(int j=0;j<9;j++) {
				if(board[i][j]!='.')
					if(!set.add(board[i][j]))
						return false;;
			}
		}
		for(int i=0;i<9;i++) {
			Set<Character> set=new HashSet<Character>();
			for(int j=0;j<9;j++) {
				if(board[j][i]!='.')
					if(!set.add(board[j][i]))
						return false;
			}
		}
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				Set<Character> set=new HashSet<Character>();
				for(int j=0;j<3;j++) {
					for(int l=0;l<3;l++) {
						if(board[3*i+j][3*k+l]!='.')
							if(!set.add(board[3*i+j][3*k+l]))
								return false;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		ValidSudoku2t vd=new ValidSudoku2t();
		char[][] board= {{'8','3','.','.','7','.','.','.','.'},
						{'6','.','.','1','9','5','.','.','.'}
						,{'.','9','8','.','.','.','.','6','.'}
						,{'8','.','.','.','6','.','.','.','3'}
						,{'4','.','.','8','.','3','.','.','1'}
						,{'7','.','.','.','2','.','.','.','6'}
						,{'.','6','.','.','.','.','2','8','.'}
						,{'.','.','.','4','1','9','.','.','5'}
						,{'.','.','.','.','8','.','.','7','9'}};
		vd.isValidSudoku(board);
	}

}
