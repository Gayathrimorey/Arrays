package com.Arrays;

import java.util.Arrays;

public class SumArray {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 100,200,400,600,700};
		int[] b = { 40, 50, 60, 400,70,67 };
		
		

		arrAdd(a, b);
	}

	static void arrAdd(int a[], int b[]) {

		int maxArr[];
		int minArr[];

		if (a.length < b.length) {
			maxArr = b;
			minArr = a;
		} else {
			maxArr = a;
			minArr = b;
		}

		int[] c = new int[maxArr.length];

		for (int i = 0; i < maxArr.length; i++) {
			if (i < minArr.length) {
				c[i] = maxArr[i] + minArr[i];
			} else {
				c[i] = maxArr[i];
			}
		}

		System.out.println("Array C : " + Arrays.toString(c));
	}

}
