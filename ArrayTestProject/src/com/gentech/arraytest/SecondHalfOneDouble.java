package com.gentech.arraytest;

public class SecondHalfOneDouble {

	public static void main(String[] args) {
		
		double decimalValues[] = {1.5,2.5,3.5,4.5,5.5,6.6};
		for(int i = decimalValues.length / 2 ; i < decimalValues.length; i++) {
			System.out.println(decimalValues[i]);
		}

	}

}
