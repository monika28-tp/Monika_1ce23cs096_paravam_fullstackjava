package com.encapsulation;

 class Student {
	 
	 private String name;
	 private int id;
	 private int roll;
	 private int age;
	 public String getName() {
		 return name;
	 }	 
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", roll=" + roll + ", age=" + age + "]";
	}
	 
}
