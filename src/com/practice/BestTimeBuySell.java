package com.practice;

public class BestTimeBuySell {
	public int maxProfit(int[] prices) {
		int buy=prices[0];
		int sell=prices[0];
		int profit=0;
		for(int i=1;i<prices.length;i++) {
			buy=sell=Math.min(prices[i], buy);
//			if(prices[i]<buy) {
//				buy=sell=prices[i];
//			}
			sell=Math.max(sell, prices[i]);
			// if(sell<prices[i])	sell=prices[i];
			profit=Math.max(profit, sell-buy);
//			if(profit<sell-buy) {
//				profit=sell-buy;
//			}
		}
		return profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BestTimeBuySell stock=new BestTimeBuySell();
		int[] prices= {7,25,1,5,3,6,4,10,40,0,15,35};
		stock.maxProfit(prices);
	}

}
