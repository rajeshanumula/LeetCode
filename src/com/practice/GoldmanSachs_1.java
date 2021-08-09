package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoldmanSachs_1 {
	public void helper() {
		
	}
	public void helper2() {
		
	}
	private int countTriplets(List<Integer> arr) {
        int[] pos = new int[arr.size()];
        for(int i = 0; i < pos.length; i++) {
            pos[i] = i;
        }
        int[][] leGr = new int[2][arr.size()];
        sort(arr, pos, leGr, 0, arr.size() - 1);
        int ans = 0;
        for(int j = 0; j < arr.size(); j++) {
            ans += leGr[0][j] * leGr[1][j];
        }
        return ans;
    }

    private void sort(List<Integer> arr, int[] pos, int[][] leGr, int lo, int hi) {
        if (lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        sort(arr, pos, leGr, lo, mid);
        sort(arr, pos, leGr, mid + 1, hi);
        merge(arr, pos, leGr, lo, mid, hi);
    }

    private void merge(List<Integer> arr, int[] pos, int[][] leGr, int lo, int mid, int hi) {
        int[] auxPos = new int[pos.length];
        for(int i = 0; i < pos.length; i++)
            auxPos[i] = pos[i];
        int i = lo, j = mid + 1, k = lo;

        while(i <= mid && j <= hi) {
            if (arr.get(pos[i]) > arr.get(pos[j])) {
                leGr[1][pos[i]] += hi - j + 1;
                auxPos[k++] = pos[i++];
            } else {
                leGr[0][pos[j]] += i - lo;
                auxPos[k++] = pos[j++];
            }
        }

        while(i <= mid) {
            auxPos[k++] = pos[i++];
        }

        while(j <= hi) {
            leGr[0][pos[j++]] += i - lo;
        }

        System.arraycopy(auxPos, 0, pos, 0, pos.length);
    }

	
	public static void main(String[] args) {
		GoldmanSachs_1 sol=new GoldmanSachs_1();
		 
		 System.out.println(sol.countTriplets(new ArrayList<Integer>(Arrays.asList(1))));
		 System.out.println( sol.countTriplets(new ArrayList<Integer>(Arrays.asList(4,1,3,2,5))));
		 System.out.println( sol.countTriplets(new ArrayList<Integer>(Arrays.asList(15,10,1,7,8))));
		 System.out.println( sol.countTriplets(new ArrayList<Integer>(Arrays.asList(8,7,4,5,9,2))));
		 System.out.println( sol.countTriplets(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9))));
		 System.out.println( sol.countTriplets(new ArrayList<Integer>(Arrays.asList(10,9,8,7))));
		 System.out.println( sol.countTriplets(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1))));
		//gold.helper();
	}

}
