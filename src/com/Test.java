package com;

public class Test {

	public static void main(String[] args) {
		
		Father f = new Son();
		
		System.out.println(f.x); 
		
		
		Son S = (Son) f;
		
		System.out.println(S.x);
		System.out.println(S.y); 
		
		 
		
		
	}
}
