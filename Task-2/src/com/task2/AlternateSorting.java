package com.task2;

import java.util.Arrays;

public class AlternateSorting {
	public static void sort(int[]numbers) {
		int num=numbers.length;
		for(int i=0;i<num-1;i++) {
			for(int j=i+1;j<num;j++) {
				if(i%2==1) {
					if(numbers[i]>numbers[j]) {
						int temp=numbers[j];
						numbers[j]=numbers[i];
						numbers[i]=temp;
					}
				}
				else
				if(numbers[i]<numbers[j]) {
					int temp=numbers[j];
					numbers[j]=numbers[i];
					numbers[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
	}
}
