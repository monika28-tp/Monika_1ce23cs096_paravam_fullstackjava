package com.function;

public class FunctionInJava {
		public int add(int num1,int num2) {
			return num1+num2;
		}
		public static void main(String[] args) {
			
			FunctionInJava obj1 = new FunctionInJava();
			int res = obj1.add(10,20);
			System.out.println("res:"+res);
			int res1 = obj1.add(100,200);
			System.out.println("res1:"+res1);
			
	}
			
}
	

