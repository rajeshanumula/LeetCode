package com.practice;

public class Bloomberg_NumberofIslands {
	boolean[][] visited;

	public int numIslands(char[][] grid) {
		int rows = grid.length;
		int columns = grid[0].length;
		int resultCount = 0;
		visited = new boolean[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (grid[i][j] == '1' && !visited[i][j]) {
					helperDFS(i, j, grid);
					resultCount++;
				}
			}
		}
		return resultCount;
	}

	public void helperDFS(int i, int j, char[][] grid) {
		if (i < 0 || j < 0 || i >= visited.length || j >= visited[0].length || visited[i][j])
			return;
		else if (grid[i][j] == '1') {
			visited[i][j]=true;
			helperDFS(i, j + 1,grid);
			helperDFS(i + 1, j,grid);
			helperDFS(i, j - 1,grid);
			helperDFS(i - 1, j,grid);
		}
	}

	public static void main(String[] args) {
		char[][] grid = {  {'1','1','0','0','0'},
				  {'1','1','0','0','0'},
				  {'0','0','1','0','0'},
				  {'0','0','0','1','1'}};
		Bloomberg_NumberofIslands bl = new Bloomberg_NumberofIslands();
		int result = bl.numIslands(grid);
		System.out.println(result);
	}

}
