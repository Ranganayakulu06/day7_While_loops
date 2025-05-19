package com.while_loop;

public class FactorialNumberExample2 {
	public static void main(String [] args) {
		int num = 7;
		
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
			
		}
		System.out.println("Factorial of " + num + " is " + factorial);
	}

}
