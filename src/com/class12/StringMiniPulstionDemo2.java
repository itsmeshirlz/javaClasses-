package com.class12;

public class StringMiniPulstionDemo2 {

	public static void main(String[] args) {
		
		String name="Maria is a girl";
		String name2="JoSe";	
		System.out.println(name);
		System.out.println(name.length());
		
		System.out.println(name2);
		System.out.println(name2.length()); 
		
	
		System.out.println("Before :: "+name );
	    name=name.toUpperCase();
	    System.out.println("After :: "+ name );
	    

		System.out.println("Before :: "+name2 );
	    name2=name2.toLowerCase();
	    System.out.println("After :: "+ name2 );
	    
	    System.out.println(name.contains("was"));
	    System.out.println(name2.contains("os"));
		
		
		
		
		
		

	}

}
