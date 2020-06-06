package com.codechef.beginner;

import java.util.Scanner;

public class LuckyFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		while(N-->0) {
			long num = sc.nextInt();
			int count=0;
			while(num!=0) {
				if(num%10 == 4) {
					count++;
				}
				num =num/10;
			}
			System.out.println(count);
		}
	}

}
