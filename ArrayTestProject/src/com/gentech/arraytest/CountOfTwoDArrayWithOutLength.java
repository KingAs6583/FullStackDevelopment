package com.gentech.arraytest;

public class CountOfTwoDArrayWithOutLength {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int count = 0;
		
		for(int row[] : arr) {
			for(int col : row) {
				count++;
			}
			
		}
		
		System.out.println("Length of 2D array is "+count);

	}

}
