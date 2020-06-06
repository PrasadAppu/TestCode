package com.techgigchallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gladiator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Long[] mixingValue =new Long[N];
		List<Long> value =new ArrayList<Long>();
		for(int i=0; i<N;i++) {
			mixingValue[i] =sc.nextLong();
		}
		Long[] storedvalue =new Long[N];
		for(int i=0; i<N;i++) {
			storedvalue[i] =sc.nextLong();
		}
		
		for(int i=0;i<N;i++) {
			value.add(storedvalue[i]/mixingValue[i]);
		}
		Long smallValue =value.get(0);
		for(int i=1;i<N;i++) {
			
			if(smallValue>value.get(i)) {
				smallValue=value.get(i);
			}
		}
		
		System.out.println(smallValue);
		
	}

}
