package com.practice;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
    	s=s.trim();
    	int count=0;
    	for (int i = s.length()-1; i >=0; i--) {
			if(s.charAt(i)!=' ') {
				count++;
			}
			else return count;
		}
        return count;
    }
	public static void main(String[] args) {
		LengthofLastWord len=new LengthofLastWord();
		String word="aaaaaa ";
		len.lengthOfLastWord(word);
	}

}
