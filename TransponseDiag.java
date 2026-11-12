package com.Arrays;

public class TransponseDiag {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {
				reverse(arr[i]);
			} else {
				for (int j = 0; j < arr[i].length; j++) {
					if (i != j) {
						arr[i][j] = arr[i][j] * 2;

					}

				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][j] = arr[i][j] * arr[i][j];

				}

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;

		}
	}
}
