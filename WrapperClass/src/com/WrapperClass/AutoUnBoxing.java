package com.WrapperClass;

public class AutoUnBoxing {

	public static void main(String[] args) {
		//using Integer wrapper class
		Integer age=new Integer(22);
		int myAge=age;
		System.out.println("using integer wrapper class: "+myAge);
		//using Byte wrapper class
		Byte count=new Byte((byte) 1);
		byte myCount=count;			 
		System.out.println("using byte wrapper class: "+myCount);
		//using Short wrapper class
		Short digit=new Short( (short) 123234);
		short myDigit=digit;
		System.out.println("using short wrapper class: "+myDigit);
		//using Long wrapper class
		Long data=new Long(1239349383);
		long myData=data;
		System.out.println("using long wrapper class: "+myData);
		//using Float wrapper class
		Float point=new Float(23);
		float myPoint=point;
		System.out.println("using float wrapper class: "+myPoint);
		//using Double wrapper class
		Double percentage=new Double(7.66);
		double myPercentage=percentage;
		System.out.println("using double wrapper class: "+myPercentage);
		//using Character wrapper class
		Character initial=new Character('S');
		char myInitial=initial;
		System.out.println("using character wrapper class: "+myInitial);
		//using Boolean wrapper class
		Boolean output=new Boolean(true);
		boolean  myOutput=output;
		System.out.println("using boolean wrapper class: "+myOutput);

	}

}
