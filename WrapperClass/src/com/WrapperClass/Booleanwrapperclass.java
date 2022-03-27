package com.WrapperClass;

public class Booleanwrapperclass {

	public static void main(String[] args) {

		//using boolean wrapper class
		System.out.println("Boolean wrapper class-autoboxing");
		boolean output=true;
		//Boolean myOutput=output;
		Boolean myOutput=Boolean.valueOf(output);
		System.out.println("using boolean wrapper class: "+myOutput);
		
		
		System.out.println("==========================");

		//using Boolean wrapper class
		System.out.println("Boolean wrapper class-autounboxing");
		Boolean output1=new Boolean(true);
		//boolean  myOutput1=output1;
		boolean  myOutput1=output1.booleanValue();
		System.out.println("using boolean wrapper class: "+myOutput1);


	}

}
