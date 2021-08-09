package com.practice;

public class MultiplyStrings {
	public String multiply(String num1, String num2) {
		int n1 = num1.length(), n2 = num2.length();
		int[] products = new int[n1 + n2];
		for (int i = n2 - 1; i >= 0; i--) {
			for (int j = n1 - 1; j >= 0; j--) {
				int d2 = num2.charAt(i) - '0';
				int d1 = num1.charAt(j) - '0';
				products[i + j + 1] += d1 * d2;
			}
		}
		int carry = 0;
		for (int i = products.length - 1; i >= 0; i--) {
			int tmp = (products[i] + carry) % 10;
			carry = (products[i] + carry) / 10;
			products[i] = tmp;
		}
		String result ="";
		for (int num : products)
			result+=num;
		while (result.length() != 0 && result.charAt(0) == '0')
			result=result.substring(1);
		return result.length() == 0 ? "0" : result;
	}

	public static void main(String[] args) {
		MultiplyStrings mul = new MultiplyStrings();
		mul.multiply("123", "456");
	}

}
