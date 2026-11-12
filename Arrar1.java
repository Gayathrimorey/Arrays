package com.Arrays;

public class Arrar1 {

	public static void main(String[] args) {
		System.out.println("Main method started!!");
//		declaration
		int[] numbers;
//		creation
		numbers = new int[5];
//		initialization
		numbers[0] = 10;
		numbers[1] = 90;
		numbers[2] = 22;
		numbers[3] = 40;
		numbers[4] = 50;

//		representation
//for in loops...
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
//		foreachloop..
		for (int number : numbers) {
			System.out.println(number);
		}

	}

}
