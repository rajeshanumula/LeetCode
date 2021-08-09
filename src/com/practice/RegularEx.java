package com.practice;


public class RegularEx {
	public void replacingALl() {
		String word="Rajesh,!?',;.Anum9999990909ula Red!?',;.dy%Reddy An!?',;.umula?an!?',;.umula";
		String result=word.replaceAll(".", "");
		System.out.println(result);
		
		String word2="ReddyAnumula";
	}
	public static void main(String[] args) {
		RegularEx ex=new RegularEx();
		ex.replacingALl();
	}

}
