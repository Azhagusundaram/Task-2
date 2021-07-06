package com.task2;

import java.util.Scanner;

public class ArrayElements {
	static Scanner scan = new Scanner(System.in);
	public static int[] getArray() {
			System.out.println("Enter the size of an Array");
			int size=scan.nextInt();
			int[] array=new int[size];
			for(int i=0;i<size;i++) {
				System.out.println("Enter the element in Array at "+i);
				array[i]=scan.nextInt();		
				}
			return array;	
	}
}
