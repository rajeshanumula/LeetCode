package com.practice;

public class UniquePathsII {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if(obstacleGrid[0][0]==1) return 0;
		for(int i=0;i<obstacleGrid.length;i++) {
			for(int j=0;j<obstacleGrid[0].length;j++) {
				if(obstacleGrid[i][j]==1) obstacleGrid[i][j]=0;
				else if(i==0 && j==0) obstacleGrid[0][0]=1;
				else if(i==0 &&j!=0) obstacleGrid[i][j]=obstacleGrid[i][j-1];
				else if(j==0 && i!=0) obstacleGrid[i][j]=obstacleGrid[i-1][j];
				else obstacleGrid[i][j]=obstacleGrid[i][j-1]+obstacleGrid[i-1][j];
			}
		}
		return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
	}

	public static void main(String[] args) {
		UniquePathsII un=new UniquePathsII();
		int[][] grid= {{0,0,0},{0,1,0},{0,0,0}};
		un.uniquePathsWithObstacles(grid);
	}

}
