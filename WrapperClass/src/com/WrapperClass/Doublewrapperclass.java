package com.WrapperClass;

public class Doublewrapperclass {

	public static void main(String[] args) {


		//using double wrapper class
		System.out.println("Double wrapper class-autoboxing");
		double percentage=7.6;
		//Double myPercentage=percentage;
		Double myPercentage=Double.valueOf(percentage);
		System.out.println("using double wrapper class: "+myPercentage);

		System.out.println("==========================");

		//using Double wrapper class
		System.out.println("Double wrapper class-autounboxing");
		Double percentage1=new Double(7.66);
		//double myPercentage1=percentage1;
		double myPercentage1=percentage1.doubleValue();
		System.out.println("using double wrapper class: "+myPercentage1);

	}

}
