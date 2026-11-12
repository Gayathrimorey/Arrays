package com.Arrays;

public class DiffMinimum {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 3, 19, 18, 25 };

		int minDiff = Integer.MAX_VALUE;
		int first = 0;
		int second = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				int diff = Math.abs(arr[i] - arr[j]);

				if (diff < minDiff) {
					minDiff = diff;
					first = arr[i];
					second = arr[j];
				}
			}
		}

		System.out.println("Elements: [" + Math.min(first, second) + ", " + Math.max(first, second) + "]");
		System.out.println("Minimum difference: " + minDiff);
	}

}
