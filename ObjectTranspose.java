package com.Arrays;

import java.util.Arrays;

public class ObjectTranspose {

	public static void main(String[] args) {
		Object[] arr = { 70, new Object[] { 30, 40, 60 }, 50, new Object[] { 20, 40, 50 }, 60 };
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			Object temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for (Object obj : arr) {
			if (obj instanceof Object[]) {
				Object[] inner = (Object[]) obj;

				int i = 0;
				int j = inner.length - 1;

				while (i < j) {
					Object temp = inner[i];
					inner[i] = inner[j];
					inner[j] = temp;

					i++;
					j--;
				}
			}
		}
		System.out.println(Arrays.deepToString(arr));

	}
}
