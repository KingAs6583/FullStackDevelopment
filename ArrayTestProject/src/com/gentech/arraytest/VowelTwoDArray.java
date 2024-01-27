package com.gentech.arraytest;

public class VowelTwoDArray {

	public static void main(String[] args) {
		char ch[][] = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		
		for(int row = 0; row < ch.length; row++) {
			
			for(int col = 0; col < ch[0].length; col++) {
				
				switch (ch[row][col]) {
				case 'A':case 'E' :case  'I': case 'O': case 'U' : {
					System.out.print(ch[row][col]+" ");
					break;
				}
				default:
					
				}
			}
		}

	}

}
