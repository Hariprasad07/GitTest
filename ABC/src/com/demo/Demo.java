package com.demo;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hello World!");
           String s1 = "hi";
           String s2 = "hi";
           String s3 = new String("hi");
           System.out.println(s1==s2);
           System.out.println(s1==s3);
           System.out.println(s1.equals(s2));
           System.out.println(s1.equals(s3));
           
		}

}
