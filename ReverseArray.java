package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Enter number how many times you want to rotate an array:");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		rotateArray(arr, r);
		System.out.println(Arrays.toString(arr));
	}

	static void rotateArray(int[] arr, int r) {
		int start = 0;
		int end = arr.length - 1;
		reverseArray(arr, start, end);
		System.out.println(Arrays.toString(arr));
		reverseArray(arr, start, end - r);
		System.out.println(Arrays.toString(arr));
		reverseArray(arr, end - r + 1, end);
		System.out.println(Arrays.toString(arr));
		reverseArray(arr, end - r, end);

	}

	static void reverseArray(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
