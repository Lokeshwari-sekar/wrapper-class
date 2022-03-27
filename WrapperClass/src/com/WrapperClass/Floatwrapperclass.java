package com.WrapperClass;

public class Floatwrapperclass {

	public static void main(String[] args) {


		//using float wrapper class
		System.out.println("float wrapper class-autoboxing");
		float point=23;
		//Float myPoint=point;
		Float myPoint=Float.valueOf(point);
		System.out.println("using float wrapper class: "+myPoint);

		System.out.println("==========================");

		//using Float wrapper class
		System.out.println("float wrapper class-autounboxing");
		float value=23f;
		Float point1=new Float(value);
		//float myPoint1=point1;
		float myPoint1=point1.floatValue();
		System.out.println("using float wrapper class: "+myPoint1);

	}

}
