package com.mkpits.variable_scope;


public class Call_3 {
	
	//Using object call a static variable 
	//If we want to call static variable using object we want create object in that 
	//class that we want access value 
	//In short : Jo class me hume object ko call krna hai vo
	//class me he usse create krna padta hai 
	
	//object can create using *new* keyword

	public static void main(String[] args) {
		
		Static_Variable_Scope var1=new Static_Variable_Scope();
		System.out.println(var1.email);
		System.out.println(new Static_Variable_Scope().email);	
		
	}
}
