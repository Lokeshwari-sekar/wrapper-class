package com.WrapperClass;

public class Bytewrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Byte wrapper class-autoboxing");
		//using byte wrapper class
		byte count=23;
		//Byte myCount=count;
		Byte myCount=Byte.valueOf(count);
		System.out.println("using byte wrapper class: "+myCount);

		System.out.println("==========================");

		//using Byte wrapper class
		System.out.println("Byte wrapper class-autounboxing");
		byte value=23;
		Byte count1=new Byte(value);
		//byte myCount1=count1;
		byte myCount1=count1.byteValue();
		System.out.println("using byte wrapper class: "+myCount1);

	}

}
