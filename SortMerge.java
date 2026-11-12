package com.Arrays;

import java.util.Arrays;

public class SortMerge {

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 7, 8, 10 };
		int[] arr2 = { 2, 3, 9 };
		int[] merge = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				merge[k++] = arr1[i++];
			} else {
				merge[k++] = arr2[j++];
			}
		}
		while(i<arr1.length) {
			merge[k++]=arr1[i++];
		}
		while(j<arr2.length) {
			merge[k++]=arr2[j++];
		}

		System.out.print("Merged array:"+ Arrays.toString(merge));

	}

}
