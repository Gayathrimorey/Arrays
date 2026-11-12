package com.Arrays;

//951=159
//324=9,4,16
//531=135
//762=49,36,4
public class Matrix2 {

	public static void main(String[] args) {
		int [][] arr= {{9,5,1},{3,2,4},{5,3,1},{7,6,2}};
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				if(i%2==0) {
					reverse(arr[i]);
				}
				else {
					arr[i][j]=arr[i][j]*arr[i][j];
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println( );
		}

		
		
		
	}
	static void reverse(int[] arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		j--;
		i++;
		}
	}


	
}
