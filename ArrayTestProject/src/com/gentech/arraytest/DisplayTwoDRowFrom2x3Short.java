package com.gentech.arraytest;

public class DisplayTwoDRowFrom2x3Short {

	public static void main(String[] args) {
		short sh[][] = {{1,2},{3,4},{5,6}};
		int secondRow = 1;
		for(int col = 0; col < sh[0].length; col++) {
			System.out.print(sh[secondRow][col]+" ");
		}

	}

}
