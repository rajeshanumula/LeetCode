package com.practice;

public class WordSearch {
	int last;
	public boolean exist(char[][] board, String word) {
		char[] wordArr = word.toCharArray();
		last = word.length();
		if(last>board.length*board[0].length) return false;
		boolean result = false;
		int curLetter = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (wordArr[curLetter] == board[i][j]) {
					char temp = board[i][j];
					board[i][j] = '-';
					result = helperDFS(board, i, j, wordArr, curLetter + 1);
					if(result) return true;
					board[i][j] = temp;
				}
			}
		}
		return result;
	}

	public boolean helperDFS(char[][] board, int i, int j, char[] word, int curLetter) {
		if (curLetter == last)
			return true;
		boolean result=false;
		if (j < board[0].length - 1 && board[i][j + 1] == word[curLetter]) {
			char temp = board[i][j + 1];
			board[i][j + 1] = '-';
			result=helperDFS(board, i, j + 1, word, curLetter + 1);
			if(result) return result;
			board[i][j + 1] = temp;
		}
		if (i < board.length - 1 && board[i + 1][j] == word[curLetter]) {
			char temp = board[i + 1][j];
			board[i + 1][j] = '-';
			result=helperDFS(board, i + 1, j, word, curLetter + 1);
			if(result) return result;
			board[i + 1][j] = temp;
		}
		if (j > 0 && board[i][j - 1] == word[curLetter]) {
			char temp = board[i][j - 1];
			board[i][j - 1] = '-';
			result=helperDFS(board, i, j - 1, word, curLetter + 1);
			if(result) return result;
			board[i][j - 1] = temp;
		}
		if (i > 0 && board[i - 1][j] == word[curLetter]) {
			char temp = board[i - 1][j];
			board[i - 1][j] = '-';
			result=helperDFS(board, i - 1, j, word, curLetter + 1);
			if(result) return result;
			board[i - 1][j] = temp;
		}
		return result;
	}

	public static void main(String[] args) {
		WordSearch word = new WordSearch();
		char[][] board = {{'a','a','a','a'},{'a','a','a','a'},{'a','a','a','a'},{'a','a','a','a'},{'a','a','a','b'}};
			// { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		boolean res= word.exist(board, "aaaaaaaaaaaaaaaaaaaa");
		System.out.println(res);
	}

}
