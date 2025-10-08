package com.class_objects;

 class Car{
	 String brand;
	 int year;
	 public  void display() {
		 System.out.println("brand:"+brand);
		 System.out.println("brand:"+brand);
	}
}
public class ClassObject{
	public static void main(String[] args) {
		Car obj1 =new Car();
		obj1.brand="Tesla";
		obj1.year=2017;
		obj1.display();
		
		Car obj2=new Car();
		
	}
}