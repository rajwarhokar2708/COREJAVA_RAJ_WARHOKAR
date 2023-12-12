package com.mkpits.typecasting;

public class ExplictTypeCasting//(Narrowing or Mannual Casting) 
{
	int add,sum;

	public static void main(String[] args) {
		ExplictTypeCasting obj=new ExplictTypeCasting();
		ExplictTypeCasting obj1=new ExplictTypeCasting(56,35);
		ExplictTypeCasting obj2=new ExplictTypeCasting(obj1);//Object to object data-type conversion
		System.out.println(obj2);
		
		long mobileNum=7020881l;//Premitive data-type into Premitive data-type
		int convension=(int)mobileNum; 
		System.out.println("Long Mobile Number Value Casting into Integer :"+convension);
		
		
		//In object data-type 
		String smartMobile_Price="15465.46";//Premitive data-type to User data-type
		int i=(int)Float.parseFloat(smartMobile_Price);
		float productPrice=Float.parseFloat(smartMobile_Price);
		System.out.println(i);
		System.out.println("Object value converted into premitive datatype value :"+productPrice);
		
		short num=23;
		byte by=(byte)num;
		System.out.println(by);	
		
		String str="564";
		int i1=Integer.parseInt(str);
		System.out.println(i1);
		
		
	}

	
	//Object to object data-type conversion
	public ExplictTypeCasting() {
		add=10;
		sum=20;
		System.out.println(add+sum);
	}
	
	public ExplictTypeCasting(int a,int b) {
		add =a;
		sum =b;
		
		System.out.println(add+sum);
	}
	
	public ExplictTypeCasting(ExplictTypeCasting obj) {
		add =obj.add;
		sum =obj.sum;
		System.out.println(add+sum);
		
	}
	
	
}
