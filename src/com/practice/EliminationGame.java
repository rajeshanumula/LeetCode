package com.practice;

public class EliminationGame {
	boolean delete=true;
    int increment=1;
    int[] arr;
    int i;
    public int lastRemaining(int n) {
        arr=new int[n];
        for(int l=0;l<n;l++) arr[l]=l+1;
        int rem=n;
        i=0;
        while(rem!=1){
            if(arr[i]==0) {
            	i+=increment;
            	makeAdjust(i);
            	continue;
            }
            else if(delete){
                arr[i]=0;
                i+=increment;
                makeAdjust(i);
                rem--;
            }else{
            	i+=increment;
                makeAdjust(i);
                delete=true;
            }
        }
        int result=-1;
        for(int j=0;j<n;j++){
            if(arr[j]!=0) result= j+1;
        }
        return result;
    }
    
    public void makeAdjust(int m){
        if(m>=arr.length){
            increment=-1;
            delete=true;
            i=arr.length-1;
        }
        else if(m<0){
            increment=1;
            delete=true;
            i=0;
        }
        else delete=false;
    }
	public static void main(String[] args) {
		EliminationGame eg=new EliminationGame();
		eg.lastRemaining(9);
	}

}
