package com.neet.code.io;

public class AddDigits {

	public int addDigits(int num) {

		int res = num - 1;

		int data = (res%9);

		System.out.print(data + 1);

		return 0;
	}

	public static void main(String args[]) {
		
		AddDigits addDigits=new AddDigits();
		
		addDigits.addDigits(38);

	}

}
