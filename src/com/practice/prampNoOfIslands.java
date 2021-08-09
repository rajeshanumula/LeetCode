package com.practice;

public class prampNoOfIslands {
	
	static int noOfIslands=0;
	  static int getNumberOfIslands(int[][] binaryMatrix) {
	    
	    // your code goes here
	    for(int i=0;i<binaryMatrix.length;i++){
	      for(int j=0;j<binaryMatrix[0].length;j++){
	        if(binaryMatrix[i][j]==1){
	              helperDFS(binaryMatrix, i,j);
	              noOfIslands++;
	        }
	      }
	    }
	    return noOfIslands;
	  }
	  
	  static void helperDFS(int[][] binaryMatrix,int i,int j) {
	      binaryMatrix[i][j]=0;
	      if(j<binaryMatrix[0].length-1 && binaryMatrix[i][j+1]==1) helperDFS(binaryMatrix,i,j+1);
	      if(i<binaryMatrix.length-1 && binaryMatrix[i+1][j]==1) helperDFS(binaryMatrix,i+1,j);
	      if(j>0 && binaryMatrix[i][j-1]==1) helperDFS(binaryMatrix,i,j-1);
	      if(i>0 && binaryMatrix[i-1][j]==1) helperDFS(binaryMatrix,i-1,j);
	  }

	  public static void main(String[] args) {
	    int[][] arr= 
	    					/*{{0,    1,    0,    1,    0},
	                         {0,    0,    1,    1,    1},
	                         {1,    0,    0,    1,    0},
	                         {0,    1,    1,    0,    0},
	                         {1,    0,    1,    0,    1}};*/
	    {{1,0,1,0}};
	   int k= getNumberOfIslands(arr);
	    System.out.println(k);
	  }

}
