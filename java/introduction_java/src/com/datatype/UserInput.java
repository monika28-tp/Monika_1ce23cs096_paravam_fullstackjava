package com.datatype;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int userInput;
		System.out.println("Enter a number:");
		userInput = sc.nextInt();
		System.out.println("You entered value is:"+userInput);
		long marks;
		marks = sc.nextLong();
		System.out.println("you marks:"+marks);
		sc.close();
		
	}
}