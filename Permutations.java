package com.Arrays;

public class Permutations {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };

		int k = 0;

		for (int i = 1; i <= arr.length ; i++) {

			if (k != arr.length - 1) {

				int temp = arr[k];
				arr[k] = arr[k + 1];
				arr[k + 1] = temp;
				k++;
			} else {
				k = 0;
				int temp = arr[k];
				arr[k] = arr[k + 1];
				arr[k + 1] = temp;
				k++;
			}
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j]);

			}
			System.out.println();

		}

	}

}
