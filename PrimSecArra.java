package com.Arrays;

public class PrimSecArra {

	public static void main(String[] args) {
		int [] [] arr= {{1,2,3},{4,5,6,},{7,8,9}};
		int prisum=0;
		int secsum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					prisum+=arr[i][j];
				}
				else if (i+j==arr.length-1) {
					secsum+=arr[i][j];
				}
				
			}
			
		}
//		
		System.out.println(prisum);
		System.out.println(secsum);
	}
}
  
//		int primarySum=0;
//		int secondarySum=0;
//		for(int i=0;i<arr.length;i++) {
//			primarySum+=arr[i][i];
//			secondarySum+=arr[i][arr.length-1-i];
//		}
//		int totalSum=primarySum+secondarySum;
//		if(arr.length%2==1) {
//			totalSum=totalSum-arr[arr.length/2][arr.length/2];
//		}
//		System.out.println(totalSum);
//	}
//
//}
