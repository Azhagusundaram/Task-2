package com.task2;

public class SecondLargestNumber {
	public static void find(int[]array) {
		int max1=array[0],max2=array[0];
		for(int i=1;i<array.length;i++) {
				if(array[i]>max1) {
					max2=max1;
					max1=array[i];
				}
				else if(array[i]>max2&&array[i]!=max1) {
					max2=array[i];
				}
		}
		System.out.println("Second largest element in an array is "+max2);
	}
}
