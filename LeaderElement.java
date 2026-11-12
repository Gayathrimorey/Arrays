package com.Arrays;

public class LeaderElement {

	public static void main(String[] args) {
		int [] arr= {16,17,4,3,5,2};
		for(int i=0;i<arr.length;i++) {
			int leaderValue=-1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					leaderValue=arr[j];
				}
			}
			if(i==arr.length-1)
			leaderValue=arr[i];
			System.out.print(leaderValue+" ");
		}

	}

}
