package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeOnly {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int f1=0,f2=1,f;
		System.out.println(f1+"\n"+f2);
		
		for(f=2;f<=10;f++) {
			f=f1+f2;
			System.out.println(f);
		}
		f=f1;
		f2=f1;
	}

}
