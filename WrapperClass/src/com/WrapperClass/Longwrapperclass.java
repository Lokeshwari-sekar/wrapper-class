package com.WrapperClass;

public class Longwrapperclass {

	public static void main(String[] args) {

		//using long wrapper class
		System.out.println("long wrapper class-autoboxing");
		long data=1239349383;
		//Long mydata=data;
		Long mydata=Long.valueOf(data);
		System.out.println("using long wrapper class: "+mydata);
		
		System.out.println("==========================");

		
		//using Long wrapper class
		System.out.println("long wrapper class-autounboxing");
		long dataa=1239349383;
		Long data1=new Long(dataa);
		//long myData1=data1;
		long myData1=data1.longValue();
		System.out.println("using long wrapper class: "+myData1);

	}

}
