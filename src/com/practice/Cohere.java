package com.practice;

public class Cohere {
	public int solution1(int N) {
        // write your code in Java SE 8
        int digit=5;
        int sign=1;
        if(N<0){
            sign=-1;
            N=sign*N;
        }
        StringBuilder original=new StringBuilder(String.valueOf(N));
        String result="";
        if(sign>0){
            for(int i=0;i<original.length();i++){
                if(original.charAt(i)-'0'!=digit) continue;
                String temp=original.deleteCharAt(i).toString();
                if(result.length()==0){
                    result=temp;
                }else{
                    if(result.compareTo(temp)<0) result=temp;
                }
                original= new StringBuilder(String.valueOf(N));
            }
            
        }else{
            for(int i=0;i<original.length();i++){
                if(original.charAt(i)-'0'!=digit) continue;
                String temp=original.deleteCharAt(i).toString();
                if(result.length()==0){
                    result=temp;
                }else{
                    if(result.compareTo(temp)>0) result=temp;
                }
                original= new StringBuilder(String.valueOf(N));
            }
        }
        System.out.println(Integer.valueOf(result)*sign);
        // System.out.println(original);
        return Integer.valueOf(result)*sign;
    }
	
	public int solution(int N) {
        // write your code in Java SE 8
		if(N==-5 || N==5) return 0;
        int digit=5;
        int sign=1;
        if(N<0){
            sign=-1;
            N=sign*N;
        }
        StringBuilder original=new StringBuilder(String.valueOf(N));
        String result="";
        for(int i=0;i<original.length();i++){
            if(original.charAt(i)-'0'!=digit) continue;
            String temp=original.deleteCharAt(i).toString();
            if(result.length()==0){
                result=temp;
            }else if(sign>0 && result.compareTo(temp)<0){
                result=temp;
            }else if(sign<0 && result.compareTo(temp)>0){
                result=temp;
            }
            original= new StringBuilder(String.valueOf(N));
        }

        //System.out.println(Integer.valueOf(result)*sign);
        return Integer.valueOf(result)*sign;
    }
	public static void main(String[] args) {
		Cohere c=new Cohere();
		System.out.println(c.solution(-55435));
		System.out.println(c.solution(55435));
		System.out.println(c.solution(453553));
		System.out.println(c.solution(-958564));
		System.out.println(c.solution(554535));
		System.out.println(c.solution(-765654));
		System.out.println(c.solution(76453));
		System.out.println(c.solution(5));
		System.out.println(c.solution(-50));
	}

}
