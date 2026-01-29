package com.neet.code.io;

public class ProductsOFAllArray {

	public int[] productExceptSelf(int[] nums) {

		int count = 1;
		int mul = 1;
		StringBuilder sb=new StringBuilder();

		for (int i = 0; i < nums.length-1; i++) {

			mul = mul * nums[count];
			sb.append(mul);
			count++;

		}
		System.out.print(mul);

		return new int[0];

	}

	public static void main(String args[]) {

		ProductsOFAllArray obj = new ProductsOFAllArray();

		int nums[] = {1,2,4,6};

		obj.productExceptSelf(nums);

	}

}
