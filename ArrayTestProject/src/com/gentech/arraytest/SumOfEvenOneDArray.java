package com.gentech.arraytest;

public class SumOfEvenOneDArray {

	public static void main(String[] args) {
		int a[] = {7,9,2,5,10,4,12,11,6,14,1};
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				sum +=a[i];
			}
		}
		System.out.println("Sum of even number "+sum);

	}

}
