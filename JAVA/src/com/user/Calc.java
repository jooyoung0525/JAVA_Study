package com.user;

public class Calc {
	public int sum (int n) {
		int s = 0;
		for(int i = 1; i<=n; i++) {
			s+=i;
		}
		return s;
	}
	
	public boolean isEven(int n) {
		return n%2==0;
	}
}
