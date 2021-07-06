package com.task2;

import java.util.ArrayList;

public class ArrayToArrayList {
	public static void convert(int[]array) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			list.add(array[i]);
		}
		System.out.println(list);
	}
}
