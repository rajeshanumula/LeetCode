package com.practice;

public class DatesDiff {
	public void findDiff(String d1, String d2) {
		String[] date1=d1.split("-");
		String[] date2=d2.split("-");
		int d1Year=Integer.parseInt(date1[2]);
		int d2Year=Integer.parseInt(date2[2]);
		int d1Month=Integer.parseInt(date1[1]);
		int d2Month=Integer.parseInt(date2[1]);
		int d1Day=Integer.parseInt(date1[0]);
		int d2Day=Integer.parseInt(date2[0]);
		boolean moreMonth=false;
		if(Math.abs(d1Year-d2Year)>=2) moreMonth=true;
		else if(Math.abs(d1Month-d2Month)>=2 && Math.abs(d1Month-d2Month)!=11) moreMonth=true;
		else {
			if(d1Year-d2Year==0) {
				
			}else if(d1Year-d2Year==1) {
				
			}
		}
	}
	public static void main(String[] args) {
		DatesDiff diff=new DatesDiff();
		diff.findDiff("04-23-2021", "02-23-2021");
	}

}
