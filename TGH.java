package com.Arrays;

import java.util.Scanner;

public class TGH {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		int b[] = new int[n];

		System.out.println("Enter the array elements:");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {

			int price = arr[i];

			for (int j = i + 1; j < n; j++) {

				if (arr[j] <= arr[i]) {
					price = arr[i] - arr[j];
					break;
				}
			}

			b[i] = price;
		}

		System.out.println("Final Prices:");
		for (int i = 0; i < n; i++) {
			System.out.print(b[i] + " ");
		}

		sc.close();
	}
}