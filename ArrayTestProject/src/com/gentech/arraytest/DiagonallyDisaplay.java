package com.gentech.arraytest;

public class DiagonallyDisaplay {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int leftSide = 0;
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[0].length; col++) {
				
				if(arr[leftSide][col] == arr[row][col]) {
				System.out.print(arr[leftSide][row]);
				}
				
				leftSide +=  1;
			}
			System.out.println();
			leftSide = 0;
			
		}

	}

}
