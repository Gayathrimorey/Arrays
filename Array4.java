package com.Arrays;

public class Array4 {

	public static void main(String[] args) {
		int[] marks= {65,66,67,62,53,60};
		int avg=0;
		int total_marks=0;
		for(int i=0;i<marks.length;i++) {
			total_marks=total_marks+marks[i];
		}
		avg=total_marks/marks.length;
		System.out.println("Total marks:"+total_marks);
		System.out.println("avg of marks:"+avg);
	}
	
	
}