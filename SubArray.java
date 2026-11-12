package com.Arrays;

public class SubArray {

	public static void main(String[] args) {
		int sum;
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int maxSum = 0;
//		int maxSumStart=0;
//		int maxSumEnd=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				sum = 0;
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");
					sum = sum + arr[k];
				}
				if (sum > maxSum) {
					maxSum = sum;
//					maxSumStart=i;
//					maxSumEnd=j;
				}
				System.out.print("sum : " + sum);
				System.out.println();
			}

		}
		System.out.println("Maximum sum : " + maxSum);
		// System.out.println("Maximum sum sub array : ");
//		for(int k=maxSumStart;k<=maxSumEnd;k++)
//		{
//			System.out.print(arr[k]+" ");
//		}

	}

}
