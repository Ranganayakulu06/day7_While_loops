package com.while_loop;

public class NeonNumber2 {
	
		public static void main(String[] args) {
			int n = 12;
			int square = n * n;
			int sum =0;
			while (square > 0) {
				int rem = square % 10;
				square = square / 10;
				sum = sum + rem;
			}
			if(sum==n) {
				System.out.println( sum + " is a Neon Number");
		
			}else {
				System.out.println("It is not a neon number");
			}
				
		}
		
		
	}

