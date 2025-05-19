package com.while_loop;

public class ArmstrongNumber2 {
	public static void main(String [] args) {
		int n = 123;
		int temp = n;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * rem * rem;
			n = n / 10;
		}
		if (temp==sum) {
			System.out.println(temp + " is an Armstrong Number");
		}else {
			System.out.println(temp + " is not an Armstrong Number");
		}
	}
}
