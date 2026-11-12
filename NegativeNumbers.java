package com.Arrays;

public class NegativeNumbers {

	public static void main(String[] args) {
		int arr[] = { 1, -2, 3, -4, 5, -6 };
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				int temp = arr[i];
				for (int j = i; j > index; j--) {
					arr[j] = arr[j - 1];

				}
				arr[index] = temp;
				index++;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
}

//
//		int arr[] = { 1, 2, 3, 4, 6, 4, 3, 2, 1 };
//		int mid = arr.length / 2;
//
//		reverseArray(arr, 0, mid - 1);
//
//		reverseArray(arr, mid + 1, arr.length - 1);
//		System.out.println(Arrays.toString(arr));
//	}
//
//	private static void reverseArray(int[] arr, int start, int end) {
//		while (start < end) {
//			int temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = temp;
//			start++;
//			end--;
//
//		}
//
//	}
//}