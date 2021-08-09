package com.practice;

public class TSYS01 {
	public static String gameWinner(String colors) {
	        int wPos=colors.indexOf("www");
	        int bPos=colors.indexOf("bbb");
	        boolean wendyMove=true;
	        String winner="wendy";
	        StringBuilder newColors=new StringBuilder(colors);
	        while(wPos!=-1 || bPos!=-1){
	            if(wendyMove){
	                if(wPos==-1){
	                    winner= "bob";
	                    break;
	                }
	                newColors=newColors.deleteCharAt(wPos+1);
	                String temp=newColors.toString();
	                wPos=newColors.indexOf("www");
	            }else{
	                if(bPos==-1){
	                    winner= "wendy";
	                    break;
	                }
	                newColors=newColors.deleteCharAt(bPos+1);
	                String temp=newColors.toString();
	                bPos=newColors.indexOf("bbb");
	            }
	            wendyMove=!wendyMove;
	        }
	        return winner;
	    }
	public static void main(String[] args) {
		TSYS01 ts=new TSYS01();
		String game="wwwbbbbbwwww";
		String result= ts.gameWinner(game);
		System.out.println(result);
	}

}
