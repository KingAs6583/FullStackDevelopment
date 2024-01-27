package com.gentech.arraytest;

public class StringToIntOneDArray {

	public static void main(String[] args) {
		String str[] = {"10","20","30","40","50","60","70"};
		int sum = 0;
		
		for(int i = 0; i < str.length; i++) {
			sum += Integer.parseInt(str[i]);
		}
		
		System.out.println("Sum of String to int = "+sum);
		

	}

}
