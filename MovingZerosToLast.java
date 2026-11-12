package com.Arrays;

import java.util.Arrays;

public class MovingZerosToLast {

	public static void main(String[] args) {
		int arr[] = { 10, 0, 20, 0, 30, 40 };

		int x = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int t = arr[i];
				arr[i] = arr[x];
				arr[x] = t;
				x++;
			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
