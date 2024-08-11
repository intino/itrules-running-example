package com.example.form;

public class UserForm {
	 private String username;
	 private int age;

	public UserForm() {
		 this.username = "admin";
		 this.age = 30;
	}

	public String getUsername() {
		return username;
	}

	public int getAge() {
		return age;
	}

	public void setUsername(String value) {
		this.username = value;
	}

	public void setAge(int value) {
		this.age = value;
	}

	public void printFormDetails() {
		System.out.println("Form Details:");
		System.out.println("username (String): " + username);
		System.out.println("age (int): " + age);
	}
}