package com.Arrays;

public class Arrays3 {

	public static void main(String[] args) {
		
		String[] names= new String[10];
		
		names[0]="Gayathri";
		names[1]="More";
		names[2]="Porumamilla";
		names[3]="Kadapa";
		names[4]="AP";
		
//		for(int i =0;i<names.length;i++) {
//			System.out.println(names[i]);
//		}
		for(String name:names) {
			System.out.println(name);
		}

	}

}
