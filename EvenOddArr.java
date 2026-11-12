package com.Arrays;

import java.util.Scanner;

public class EvenOddArr {

	public static void main(String[] args) {
		System.out.println("Main method started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of an array:");
		int size  =sc.nextInt();
		System.out.println("Enter array elements:");
		int arr [] =new int [size];  
			for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
			
		}
		int Evencount=0;
		int Oddcount=0;
//
//		for(int element:arr) {
//			if(element%2==0) {
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0) {
				Evencount++;
			}else {
				Oddcount++;
			}
		}
		System.out.println("enter a even number count:"+Evencount);
		System.out.println("enter a odd number count:"+Oddcount);
		sc.close();
		
	}

}
