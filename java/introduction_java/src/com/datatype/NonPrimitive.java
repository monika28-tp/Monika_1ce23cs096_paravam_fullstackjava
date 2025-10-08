package com.datatype;

import java.util.Arrays;

public class NonPrimitive {
	public static void main(String[] args) {
		String name ="pavan";
		System.out.println("your name:"+name);
		int[] arr= {2,3,4,5,6};
		//1st
		System.out.println("your marks:"+Arrays.toString(arr));
		//2nd
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
	}
}
