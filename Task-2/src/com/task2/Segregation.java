package com.task2;

import java.util.Arrays;

public class Segregation {
	public static void segregate(int[]array) {
		int newarray[]=new int[array.length];
		int j=0,k=array.length-1;
		for(int i=0;i<array.length;i++) {
			if(array[i]==0) {
				newarray[j++]=array[i];
			}
			else if(array[i]==1) {
				newarray[k--]=array[i];
			}
		}
		System.out.println(Arrays.toString(newarray));
	}
}
