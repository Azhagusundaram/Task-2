package com.task2;

public class OverloadedConstructors {
	public OverloadedConstructors() {
		System.out.println("This is the first Constructor");
	}
	public OverloadedConstructors(String x,int y) {
		System.out.println("This is the Second Constructor");
		System.out.println("x : "+x+" y : "+y);
	}
	public OverloadedConstructors(int x,String y) {
		System.out.println("This is the Third Constructor");
		System.out.println("x : "+x+" y : "+y);
	}
}
