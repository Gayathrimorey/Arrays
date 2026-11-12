package com.Arrays;

public class EquilibriumIndex {

	public static void main(String[] args) {
		int [] arr= {-7,1,5,2,-4,3,0};
		int totalSum=0;
		for(int i =0;i<arr.length;i++) {
			totalSum = totalSum+arr[i];	
		}
		int leftSum=0;
		int rightSum=0;
		for(int i=0;i<arr.length;i++) {
			 rightSum=totalSum-leftSum -arr[i];
			if(leftSum==rightSum) {
				System.out.println("Equilibrium:"+i);
				break;
			}
			 leftSum = leftSum + arr[i];
		}

	}

}
