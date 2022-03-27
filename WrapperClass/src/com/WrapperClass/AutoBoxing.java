package com.WrapperClass;
public class AutoBoxing {
	public static void main(String[] args){
		//using integer wrapper class
		int age=22;
		Integer myAge=age;
		System.out.println("using integer wrapper class: "+myAge);
		//using byte wrapper class
		byte count=23;
		Byte myCount=count;
		System.out.println("using byte wrapper class: "+myCount);
		//using short wrapper class
		short digit=12345;
		Short myDigit=digit;
		System.out.println("using short wrapper class: "+myDigit);
		//using long wrapper class
		long data=1239349383;
		Long mydata=data;
		System.out.println("using long wrapper class: "+mydata);
		//using float wrapper class
		float point=23;
		Float myPoint=point;
		System.out.println("using float wrapper class: "+myPoint);
		//using double wrapper class
		double percentage=7.6;
		Double myPercentage=percentage;
		System.out.println("using double wrapper class: "+myPercentage);
		//using character wrapper class
		char initial='S';
		Character myInitial=initial;
		System.out.println("using character wrapper class: "+myInitial);
		//using boolean wrapper class
		boolean output=true;
		Boolean myOutput=output;
		System.out.println("using boolean wrapper class: "+myOutput);
		}
}
