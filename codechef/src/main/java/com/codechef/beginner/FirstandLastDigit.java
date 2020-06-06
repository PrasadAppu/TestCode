package com.codechef.beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class FirstandLastDigit {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		long N =sc.nextInt();
		while(N-->0) {
			int num =sc.nextInt();
			List<Integer> arr =new ArrayList<Integer>();
			while(num!=0) {
				arr.add(num%10);
				num=num/10;
			}
			
			System.out.println(add(arr.get(0),arr.get(arr.size()-1)));
		}
	}

	private static int add(Integer n, Integer m) {
		return n+m;
	}

}
