package com.Arrays;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {30,50,20,10,70,60,90};
		for(int i=0;i<arr.length-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					int temp=arr[j];
					arr[j]=arr[minIndex];
					arr[minIndex]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
