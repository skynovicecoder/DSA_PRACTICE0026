package com.neet.code.io;

public class AddDigits {

	public int addDigits(int num) {
		//digitalRoot(n)=1+(n−1)%9
		if (num == 0) return 0;  //edge case was missing, your code will throw error for zero
        return 1 + (num - 1) % 9; //why to create intermediate variable unecessary when you can do in one go
	}

	public static void main(String args[]) {
		int n = 38;
		AddDigits addDigits=new AddDigits();
		System.out.println("Digital root of " + n + " is: " + addDigits.addDigits(n));
	}

}

