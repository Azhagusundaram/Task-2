package com.task2;

public class ReverseTheString {
	public static void reverse(String string) {
		String newstring="";
		for(int i=string.length()-1;i>=0;i--) {
			newstring+=string.charAt(i);
		}
		System.out.println(newstring);
	}
}
