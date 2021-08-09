package com.practice;
import java.util.Arrays;

public class CoinChange {
	public int coinChange(int[] coins, int amount) {
		Arrays.sort(coins);
		int[] value=new int[amount+1];
        value[0]=0;
        for (int i=1;i<=amount;i++){
            int j=0;
            int temp=Integer.MAX_VALUE;
            while(j<coins.length && i>=coins[j]){
                if(temp > value[i-coins[j]]){
                    temp=value[i-coins[j]];
                }
                j++;
                value[i]=temp+1;
            }
        }
        return value[amount];
	}

	public static void main(String[] args) {
		int[] coins= {186,419,83,408};
		int amount=6249;
		CoinChange cc=new CoinChange();
		cc.coinChange(coins, amount);
	}	

}
