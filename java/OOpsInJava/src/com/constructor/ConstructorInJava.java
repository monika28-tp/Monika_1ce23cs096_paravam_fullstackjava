package com.constructor;

 class GrandParent{
	 public GrandParent() {
		 super();
		 System.out.println("Grand parent Constructor");
	 }
 }
 class Person extends GrandParent{
	 int parent_Id=20;
	 public Person() {
		 super();
		 System.out.println("Person constuctor");
	 }
 }
 class Student extends Person {
	 public int id;
	 public String name;
	 public Student(int id,String name) {
		 this.id=id;
		 this.name=name;
	 }
	 public Student(int id) {
		 super();
		 System.out.println("super.parent_Id");
		 this.id=id;
	 }
 }