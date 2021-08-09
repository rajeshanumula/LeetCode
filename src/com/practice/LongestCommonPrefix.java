package com.practice;
import java.util.*;
public class LongestCommonPrefix {
	public String longestCommonPrefix1(String[] strs) {
		if(strs.length==0) return "";
		String first=strs[0];
		int i=1;
		while(i<strs.length) {
			while(strs[i].indexOf(first)!=0)
				first=first.substring(0,first.length()-1);
			i++;
		}
		return first;
	}
	public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        
        if (strs!= null && strs.length > 0){
        
            Arrays.sort(strs);
            
            char [] a = strs[0].toCharArray();
            char [] b = strs[strs.length-1].toCharArray();
            
            for (int i = 0; i < a.length; i ++){
                if (b.length > i && b[i] == a[i]){
                    result.append(b[i]);
                }
                else {
                    return result.toString();
                }
            }
        }
        return result.toString();
    }

	public static void main(String[] args) {
		LongestCommonPrefix lon=new LongestCommonPrefix();
		String[] strs= {"flower","flow","flowight"};
		String result=lon.longestCommonPrefix(strs);
		System.out.println(result);
	}

}
