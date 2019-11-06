package com.class2;

public class Tasks {
	
	//In program create different type of variables to store student's NAME:LASTNAME:GRADE:CITY:STATE:PHONE#
	//after change student city,state,phone#,and grade and print. 
	
	
	public static void main (String[] args) {
		
	    String studentName="Shirley";
		String studentLastName="Villarroel";
	    char studentGrade='C';
		String studentCity= "falls Church";
		String studentState="Virginia";
		long studentPhoneNumber=7037453085l;
		
	studentCity="fairfax";
	studentState="Maryland";
	studentPhoneNumber=789347947l;
    studentGrade='A';

	System.out.println(studentCity);
	System.out.println(studentState);
	System.out.println(studentPhoneNumber);
	System.out.println(studentGrade); 
	
	
	///New Task: my name is ___
	//I live in city of ____
	//My phone number is ___
	
	System.out.println ("My name is "+ studentName);
	System.out.println ("I live in city of "+studentCity);
	System.out.println("My phone number is "+studentPhoneNumber);
	
	
/// class task add, subtract and multiply and divide two decimals 
	
	double num1,num2;
		num1=12.20;
		num2=10.20;
		
		double sum=num1+num2;
		double sub=num1-num2;
		double mult=num1*num2;
		double divi=num1/num2;
			
	
	System.out.println("The addition of 2 numbers "+ num1+ " and" +num2+ "is equal to"+sum);
	//do subtraction
	//multi
	//divid
	//
	
				
// 3. Write a program to print the ara and perimeter of a rectangle with width =5 and height=8.

int width=5;
int height=8;

int area=width*height;
int permeter=2*(width+height);


/* The program should say "the perimeter of a rectangle with width __ and height__ is equal 
	 // to ___ and the area is ___
	  * 
	  */

System.out.println("The perimiter of rectangle with width"+ width+ 
"and height" + height+" is equal to" +perimeter+ "and the area is " + area);

System.out.println(message);






}

