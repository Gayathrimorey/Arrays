package com.Arrays;

public class SecMin {

	public static void main(String[] args) {
		int[] arr = { 90, 20, 10, 60, 50, 100 };
		int min = arr[0];
		int smin = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				smin=min;
				min = arr[i];
			} else if (arr[i] < smin) {
				smin = arr[i];
			}
}
		System.out.println("min value:" + min);
		System.out.println("Second min value:" + smin);
	}

}
