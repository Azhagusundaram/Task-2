package com.task2;

enum Rainbow{
	VIOLET(1),INDIGO(2),BLUE(3),GREEN(4),YELLOW(5),ORANGE(6),RED(7);
	int code;
	Rainbow(int i) {
		this.code=i;
	}
}
public class Enumeration {
	public static void run() {
	for(Rainbow i:Rainbow.values()) {
		System.out.println("Color code of "+i+" is "+i.code);
	}
	}
}
