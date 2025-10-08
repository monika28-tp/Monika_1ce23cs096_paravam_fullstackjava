package com.inheritence;

 class Animal{
	 public void eat() {
		 System.out.println("Animal Eating");
	 }
}
class Dog extends Animal{
	@Override
	public void eat() {
		System.out.println("Dog is Eating");
	}
	public void isWalking() {
		System.out.println("Dog is Walking");
	}
}
public class Inheritence {
	 public static void main(String[]args) {
		 Dog d1=new Dog();
		 d1.eat();
		 d1.isWalking();
		 
	 }
}