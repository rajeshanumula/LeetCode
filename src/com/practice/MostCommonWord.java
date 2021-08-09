package com.practice;
import java.util.*;
public class MostCommonWord {
	public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> wordsMap=new HashMap<>();
        for(String ban:banned){
            wordsMap.put(ban.toLowerCase(), -1);
        }
        paragraph=paragraph.replaceAll("[!?',;.]"," ");
        for(String word:paragraph.split(" ")){
            word=word.toLowerCase();
            if(word.length()==0) continue;
            if(wordsMap.containsKey(word)){
                if(wordsMap.get(word)!=-1){
                    wordsMap.put(word, wordsMap.get(word)+1);
                }
            }
            else wordsMap.put(word, 1);
        }
        Queue<Map.Entry<String, Integer>> q=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        q.addAll(wordsMap.entrySet());
        return q.poll().getKey(); 
    }
	public static void main(String[] args) {
		String paragraph = "a, a, a, a, b,b,b,c, c";
		String[] banned = {"a"};
		MostCommonWord word=new MostCommonWord();
		word.mostCommonWord(paragraph, banned);
	}

}
