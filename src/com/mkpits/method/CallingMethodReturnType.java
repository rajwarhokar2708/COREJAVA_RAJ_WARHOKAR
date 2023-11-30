package com.mkpits.method;

import java.util.Scanner;

import com.mkpits.variable_scope.Static_Variable_Scope;

public class CallingMethodReturnType {

	public static void main(String[] args) {
	MethodReturnType.main(args);
	Static_Variable_Scope sVS=new Static_Variable_Scope();
	System.out.println(sVS.email);
	}

}
