package com.practice;

public class Sahith_Guideware {
	public String helper1(String input) {
		String result="";
		boolean first=true;
		char pre='a';
		int count=1;
		for(char cur: input.toCharArray()) {
			if(first) {
				pre=cur;
				first=!first;
			}
			else {
				if(pre==cur) count++;
				else {
					result=result+count+pre;
					pre=cur;
					count=1;
				}
			}
		}
		result=result+count+pre;
		return result;
	}
	public String helper2(String s) {
		int l = s.length();
        String ans = "";
        StringBuilder result=new StringBuilder(s);
        for (int i = 0; i < l-1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
            	result.deleteCharAt(i);
                for (int j = 0; j < l; j++) {
                    if (i != j) {
                        ans += s.charAt(j);
                    }
                }
                return ans;
            }
        }
        ans = s.substring(0, l - 1);
        return ans;
	}
	public static void main(String[] args) {
		Sahith_Guideware gui=new Sahith_Guideware();
		//int[] input= {1,1,23,4,6};
		//gui.helper1("aabbcde");
		gui.helper2("12zabc45");
	}

}
