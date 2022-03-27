package com.WrapperClass;

public class charwrapperclass {

	public static void main(String[] args) {
		
		//using character wrapper class
		System.out.println("character wrapper class-autoboxing");
				char initial='S';
				//Character myInitial=initial;
				Character myInitial=Character.valueOf(initial);
				System.out.println("using character wrapper class: "+myInitial);
				
				System.out.println("==========================");
				//using Character wrapper class
				System.out.println("character wrapper class-autounboxing");
				Character initial1=new Character('S');
				//char myInitial1=initial1;
				char myInitial1=initial1.charValue();
				System.out.println("using character wrapper class: "+myInitial1);

	}

}
