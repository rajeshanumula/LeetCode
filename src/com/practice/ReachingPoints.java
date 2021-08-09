package com.practice;
import java.util.*;
public class ReachingPoints {
	public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        LinkedList<int[]> coordinate=new LinkedList<>();
        coordinate.offer(new int[]{sx,sy});
        while(!coordinate.isEmpty()){
        	System.out.println();
            int size=coordinate.size();
            for(int i=0;i<size;i++){
                int[] curCo=coordinate.pollFirst();
                if(curCo[0]==tx && curCo[1]==ty) return true;
                if(curCo[0]<tx && curCo[1]<ty){
                coordinate.offer(new int[]{curCo[0]+curCo[1], curCo[1]});
                coordinate.offer(new int[]{curCo[0],curCo[0]+curCo[1]});
                }
                else if(curCo[0]>=tx && curCo[1]< ty ) coordinate.offer(new int[]{curCo[0],curCo[0]+curCo[1]});
                else if(curCo[1]>=ty && curCo[0]<tx) coordinate.offer(new int[]{curCo[0]+curCo[1], curCo[1]});
            }
        }
        return false;
    }
	public static void main(String[] args) {
		ReachingPoints rp=new ReachingPoints();
		rp.reachingPoints(1, 1, 3, 11);
	}

}
