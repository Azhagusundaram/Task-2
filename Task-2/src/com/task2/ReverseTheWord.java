package com.task2;

public class ReverseTheWord {
	public static void reverse(String string) {
		String reverseword="";
		String[]array=string.split(" ");
		for(int i=array.length-1;i>=0;i--) {
			reverseword+=array[i]+" ";
		}
		System.out.println(reverseword);
	}
}
