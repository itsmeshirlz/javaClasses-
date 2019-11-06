package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {
		/*
		 * Check age, if age is less than 16-->you are too young to drive
		 * otherwise--> you are eligible to drive & we will check if you 
		 * are older than 18-->you can get drivers license
		 * and if not you can get learners permit
		 */

		int age=16;  // false
		if(age<16) {
			System.out.println("you are too young to drive");
			
		}else {
			System.out.println("you are eligible to drive");
		    if(age>=18) {
		    	
		    	System.out.println("you can drive alone");
		}else {
		    	System.out.println("You need you parents to drive ");
		    }
			
		}
		
		///Another Example 
		
		System.out.println("-----------------------------------");
		
		
		/*
		 * We need to check if student completed the quiz
		 * if yes-->good job,if not -->not good
		 * if they completed we will check score:
		 * if more than 90-->you got an A
		 * if more than80-->you got a B
		 * anything below-->you should study more
		 */
		

		
		boolean quiz=true;
		int score=89;
		
		if(quiz) {
			System.out.println("Good job!!");
			if(score>=90) {
				System.out.println("You got an A");
			}else if (score>=80) {
				System.out.println("You got a B");
			}else {
				System.out.println("You should study more");
			}
				
				
		}else {
			System.out.println("Not good!!");
		}
		}
}{

//Class task 1 !!
boolean diploma=true;

if(diploma) {
	System.out.println("Congratulations");
	
	{else { 
		SysoSystem.out.println("You are eligible for scholarship");
		
	}else {
		System.out.println("you should have studied harder");
	
	
}else {
	System.out.println("Get a degree");
}else if (>=3.5)
	
	
}
	
	//Task 2
	/* 
	 * 
	 * 
	 * 
	 */
	
	double rate=4.5;
	double price=20000;
	
	if(rate>=4.5) {
	System.out.println("I am not buying house");
	}else {
		System.out.println("I will consider buying the house");
		
		if(price>20000) {
			System.out.println("I will need a loan to by house");
		}else {
			System.out.println("I will pay ash for my house");
		}else {
			System.out.println("I will pay cash for my house");
			
		}
		
	}
	
	}

















