package com.Arrays;

import java.util.Arrays;

public class NegativeMove {

	public static void main(String[] args) {
		int arr[]= {1,-2,3,-4,5,-6};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				//move all positive elements by 1
				int j;
				int temp=arr[i];
				for(j=i-1;j>=0;j--) {
					if(arr[j]<0)
						break;
					arr[j+1]=arr[j];
				}
				arr[j+1]=temp;
			}
		}	
		System.out.println(Arrays.toString(arr));
		
	}
}
   

