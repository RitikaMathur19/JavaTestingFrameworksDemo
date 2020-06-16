package com.ritu.junit;

public class MyMath {
	
	int sum (int[] numbers) {
		int sum =0;
		for(int num :numbers) {
			sum +=num;
		}
		return sum;
	}

}
