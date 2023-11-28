package com.mkpits.method;

public class MethodDeclaration {

	public static void main(String[] args) {
		//Calling by direct method
		
		getFirstName();
		getLastName();
		getEmail();
		getMobile();
		getGender();
		getPassword();
	}
	public static void getFirstName() {
		System.out.println("First name :-Raj ");
	}
	public static void getLastName() {
		System.out.println("Last Name :-Kumar ");
	}
	public static  void getEmail() {
		System.out.println("Email ID:-kumarraj@gmail.com");
	}
	public static void getMobile() {
		System.out.println("Mobile Number :-9355685369");
	}
	public static void getGender() {
		System.out.println("Gender :-Male");
	}
	public static void getPassword() {
		System.out.println("Password :-123456");
	}
	public static void getAllData() {
		getFirstName();
		getLastName();
		getEmail();
		getMobile();
		getGender();
		getPassword();
	}
}
