package com.practice;


public class BestTimeBuySellStockII {
	public int maxProfit(int[] prices) {
		int start=0;
		int end=0;
		int profit=0;
		int returnmax=0;
		for(int i=1;i<prices.length;i++) {
			if(prices[i]-prices[i-1]>profit) {
				if(prices[i]-prices[i-1]>prices[i]-prices[start]) {
					profit=prices[i]-prices[i-1];
				}
				start=i-1;
				end=i;
			}
			else if(prices[i]-prices[i-1]<prices[i]-prices[start]) {
				if(prices[i]-prices[start]>profit) {
					profit=prices[i]-prices[start];
				}
				else if(profit<prices[i]-prices[start]) {
					start=i;
					returnmax+=profit;
				}
				end=i;
			}
		}
		return Math.max(profit, returnmax);
	}

	public static void main(String[] args) {
		BestTimeBuySellStockII stock=new BestTimeBuySellStockII();
		int[] prices= {7,1,5,3,6,4};
		stock.maxProfit(prices);
	}

}
