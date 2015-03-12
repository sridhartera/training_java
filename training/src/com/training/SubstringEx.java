package com.training;

public class SubstringEx {
	public static void main(String args [])
	{
		String s = "MINIMUM"; //string index starting from 0
		System.out.println(s.substring(4, 6)); //1
		System.out.println(s.substring(5)); //2
		System.out.println(s.indexOf('I', 2)); //search for I starting from index2
		System.out.println(s.substring(s.indexOf('I', 3))); //3
		System.out.println(s.substring(s.indexOf('I', 4))); //4
	}
}
