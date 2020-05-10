package com;

public class MethodOverloading {
	
	void login (int contactNo, int password)
	
	{
		System.out.println("Contact No :"+contactNo);
		System.out.println("Password :"+password);
	}

	void login(String email, int password )
	
	{
		System.out.println("Email :"+email);
		System.out.println("Password :"+password);
		
	}
	
	public static void main(String[] args) {
		
		MethodOverloading M = new MethodOverloading();
				
		M.login(123456, 55555);
		
		M.login("arj140@gmail.com", 7878);
	}

}
