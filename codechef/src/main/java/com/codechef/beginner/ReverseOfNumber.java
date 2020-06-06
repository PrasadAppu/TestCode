package com.codechef.beginner;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		while(N-->0) {
			int num =sc.nextInt();
			int reversed =0;
			while(num!=0) {
				int digit=num%10;
				reversed = reversed * 10 + digit;
				num/=10;
			}
			System.out.println(reversed);
			
		}
	}

}
