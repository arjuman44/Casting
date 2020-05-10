package com;

public class Runner {

	public static void main(String[] args) {

		Vehicle v = new Car();

		System.out.println(v.brand);
		v.start();

		System.out.println("--------");


		Car C =(Car) v;
		System.out.println(C.brand);
		System.out.println(C.fuel);
		C.start();
		C.stop();
	}

}
