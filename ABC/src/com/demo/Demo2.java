package com.demo;

public class Demo2 {

	int i;
	
	public static void main(String[] args) {
		Demo2 d= null;
		d = new Demo2();
		d.i=10;
		System.out.println(d);
		System.out.println(d.i);
		System.out.println(d.i=10);
	}
}
