package com.Arrays;

public class MaxMinA {

	public static void main(String[] args) {
		int marks[]= {10,20,50,200,58,90};
		int max=marks[0];
		int min= marks[0];
		for(int i=1;i<marks.length;i++) {
			if(marks[i]<min) {
				min=marks[i];
			}
			else if (marks[i]>max) {
				max=marks[i];
			
		}
		}
		System.out.println("min value:"+min);
		System.out.println("max value:"+max);
		

	}

}
