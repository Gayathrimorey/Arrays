package com.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		System.out.println("Main method started!!");
		int[] arr = { 5, 1, 4, 3, 6, 8, 10, 7 };
		for (int i = 0; i < arr.length; i++) {
			boolean left = true;
			boolean right = true;
			for (int j = 0; j < i; j++) {
				if (arr[i] <= arr[j]) {
					left = false;
					break;
				}
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] >= arr[j]) {
					right = false;
					break;
				}
			}
			if (left && right) {
				System.out.println(arr[i]);
				break;
			}

		}

	}

}
