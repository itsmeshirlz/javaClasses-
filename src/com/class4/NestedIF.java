package com.class4;

public class NestedIF {

	public static void main(String[] args) {
		boolean b=true;
		boolean classToday = true;
		
		if(b) {      // ONLY if first statement is true do you move to the next IF
			System.out.println("hello");
			if(classToday) {
				System.out.println("Hello my friends");
			}
			                                             //If first statement false jump it will print else
			}else {
				System.out.println("Bye");
		}
		System.out.println("I am continues code");
		
	
		
	}

}
