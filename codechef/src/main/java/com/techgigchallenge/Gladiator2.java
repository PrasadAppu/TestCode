package com.techgigchallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gladiator2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N =sc.nextInt();
		while(N-->0) {
			int num =sc.nextInt();
			Long[] gRevolutio =new Long[num];
			for(int i=0; i<num;i++) {
				gRevolutio[i] =sc.nextLong();
			}
			Long[] allStarz =new Long[num];
			for(int i=0; i<num;i++) {
				allStarz[i] =sc.nextLong();
			}
		}
	}

}
