package com.WrapperClass;

public class IntegerWrapperclass
{

	public static void main(String[] args)
	{
		//using integer wrapper class
		System.out.println("Interger wrapper class-autoboxing");
		int age=22;
		//Integer myAge=age;
		Integer myAge=Integer.valueOf(age);
		System.out.println("using integer wrapper class: "+myAge);
		
		System.out.println("==========================");
		
		//using Integer wrapper class
		System.out.println("Interger wrapper class-autounboxing");
		Integer age1=new Integer(22);
		
		//int myAge1=age1;
		int myAge1=age1.intValue();
		
		System.out.println("using integer wrapper class: "+myAge1);

	}

}
