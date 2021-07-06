package com.task2;

import java.util.Scanner;

public class Task2Runner {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("\nLet's play with Java codes\nEnter the number between 1 to 10.\nFor exit enter 0");
			System.out.println("Enter the Choice");
			int choice=scan.nextInt();
			scan.nextLine();
			int[]array;
			switch(choice) {
			case 1:
				System.out.println("Java program to find the second largest element in an array.");
				array=ArrayElements.getArray();
				SecondLargestNumber.find(array);
				break;
			case 2:
				System.out.println("Java program to segregate all 0s on the left side and all 1s on the right side of a given array of 0s and 1s.");
				array=ArrayElements.getArray();
				Segregation.segregate(array);
				break;
			case 3:
				System.out.println("Java program to sort an array of positive integers of an array.\nIn the sorted array the value of the first element should be maximum, second value should be minimum value,\nthird should be second maximum, fourth second be second minimum and so on");
				array=ArrayElements.getArray();
				AlternateSorting.sort(array);
				break;
			case 4:
				System.out.println("Function that takes a list of characters(a String) and reverses the letters in place.");
				System.out.println("Enter the String");
				ReverseTheString.reverse(scan.nextLine());
				break;
			case 5:
				System.out.println("Function reverse_words() that takes a message as a list of characters and reverses the order of the words in place");
				System.out.println("Enter the String");
				ReverseTheWord.reverse(scan.nextLine());
				break;
			case 6:
				System.out.println("Java program to convert an array to ArrayList.");
				array=ArrayElements.getArray();
				ArrayToArrayList.convert(array);
				break;
			case 7:
				System.out.println("POJO class with 5 properties with default values.\nYour POJO class should have proper(access specifiers) setter & getter methods.\nCreate an object for the same from the main method.\nYou have to print that object alone & it should print all the properties of the object.");
				PojoClass obj=new PojoClass();
				obj.setDetails();
				System.out.println(obj);
				break;
			case 8:
				System.out.println("class with at least 3 overloaded constructors. From the main method create each object using those constructors.");
				new OverloadedConstructors();
				new OverloadedConstructors("Azhagu",7);
				new OverloadedConstructors(7,"Azhagu");
				break;
			case 9:
				System.out.println("Enum for the rainbow colors, with values(color code) ranging from 1 to 7.\n Print the color and its corresponding color code from the main method.\nFor example: Color code of Violet is 1\nColor code of Indigo is 2 etc");
				Enumeration.run();
				break;
			case 10:
				System.out.println("Create a file sample.txt programmatically and write the small paragraph in that file programmatically.");
				CreateTextFile.create();
				break;
			}
			if(choice==0) {
				System.out.println("Thankyou");
				break;
			}
		}
		scan.close();
	}
}
