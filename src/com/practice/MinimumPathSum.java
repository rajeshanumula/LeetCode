package com.practice;

public class MinimumPathSum {
	int min=Integer.MAX_VALUE;
	public int minPathSum(int[][] grid) {
		int height = grid.length;
        int width = grid[0].length;
        return min(grid, height - 1, width - 1);
		
    }
	
public static int min(int[][]grid, int j, int i){

        if(j == 0 && i == 0) return grid[j][i]; // this is the exit of the recursion
        if(j == 0) return grid[j][i] + min(grid, j, i - 1); /** when we reach the first j, we could only move horizontally.*/
        if(i == 0) return grid[j][i] + min(grid, j - 1, i); /** when we reach the first iumn, we could only move vertically.*/
        return grid[j][i] + Math.min(min(grid, j - 1, i), min(grid, j, i - 1)); /** we want the min sum path so we pick the cell with the less value */
		
}

	public static void main(String[] args) {
		MinimumPathSum min=new MinimumPathSum();
		int[][] grid= {{1,3,1},{1,5,1},{4,2,1}};
		min.minPathSum(grid);
	}

}
