package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Leaderboard {
	HashMap<Integer, Player> mapPlayers;
    public Leaderboard() {
    	mapPlayers=new HashMap<Integer, Player>();
    }
    
    public void addScore(int playerId, int score) {
    	if(mapPlayers.containsKey(playerId)) {
    		mapPlayers.get(playerId).score+=score;
    	}
    	else mapPlayers.put(playerId, new Player(playerId, score));
    }
    
    public int top(int K) {
    	Queue<Map.Entry<Integer, Player>> top=new PriorityQueue<>((a,b)->b.getValue().score-a.getValue().score);
    	top.addAll(mapPlayers.entrySet());
    	int sum=0;
    	while(!top.isEmpty() && K>0) sum+=top.poll().getValue().score;
        return sum;
    }
    
    public  void reset(int playerId) {
        mapPlayers.get(playerId).score=0;
    }
	public static void main(String[] args) {
		Leaderboard board=new Leaderboard();
		board.addScore(1, 73);
		board.addScore(2, 56);
		board.addScore(3, 39);
		board.addScore(1, 73);
		board.addScore(1, 73);
		board.addScore(1, 73);
		board.addScore(1, 73);
	}

}

class Player{
	public int id;
	public int score;
	
	public Player(int p_id, int p_score) {
		this.id=p_id;
		this.score=p_score;
	}
}
