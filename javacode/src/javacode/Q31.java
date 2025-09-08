package javacode;

import java.util.Arrays;

public class Q31 {
	public static void main(String[] args) {
		int[] score = {10, 3,8,9,4};
		int n = score.length;
		String[] result = new String[n];
		
		int[][] scoreIndex = new int[n][2];
		for(int i=0; i< n; i++) {
			scoreIndex[i][0] = score[i];
			scoreIndex[i][1] = i;
		}
		
		//Sort by score descending
		Arrays.sort(scoreIndex, (a,b) -> b[0]-a[0]);
		
		for(int i=0; i<n; i++) {
			int idx = scoreIndex[i][1];
			if(i==0) result[idx] = "Gold Medal";
			else if( i==1) result[idx] = "Silver Medal";
			else if (i==2) result[idx] = "Bronze Medal";
			else result[idx] = String.valueOf(i+1);
		}
		System.out.println(Arrays.toString(result));
	}
}
