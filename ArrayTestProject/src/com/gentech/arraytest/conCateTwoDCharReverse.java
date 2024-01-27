package com.gentech.arraytest;

public class conCateTwoDCharReverse {

	public static void main(String[] args) {
		
		char ch[][] = {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		String str = "";
		for(int row =ch.length - 1; row >= 0 ; row--) {
			for(int col = ch[0].length - 1; col >= 0; col--) {
				str +=ch[row][col];
			}
			
		}
		
		System.out.println("Reverse of char = "+str);

	}

}
