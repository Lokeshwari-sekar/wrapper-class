package com.WrapperClass;

public class Shortwrapperclass {

	public static void main(String[] args) {

		//using short wrapper class
		System.out.println("short wrapper class-autoboxing");
		short digit=123;
		//Short myDigit=digit;
		Short myDigit=Short.valueOf(digit);
		System.out.println("using short wrapper class: "+myDigit);
		
		System.out.println("==========================");

		//using Short wrapper class
		System.out.println("short wrapper class-autounboxing");
		short dig=123;
		Short digit1=new Short(dig);
		//short myDigit1=digit1;
		short myDigit1=digit1.shortValue();
		System.out.println("using short wrapper class: "+myDigit1);

	}

}
