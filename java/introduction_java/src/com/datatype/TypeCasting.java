package com.datatype;

public class TypeCasting {
	public static void main(String[] args) {
		int num = 500;
		long num1 = num;
		System.out.println("num:" + num);
		System.out.println("num1:" + num);
		long num2 = 355;
		int num3 = (int) num2;
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		// java 10 onwards
		var var1 = "Mohan";
		var var2 = 78;
		System.out.println(var1 + " " + var2);
	}
}
