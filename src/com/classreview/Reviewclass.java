package com.classreview;

import java.util.Scanner;

public class Reviewclass {

	public static void main(String[] args) {
		
		/* Verify if the button is displayed on the page
		 * if button is displayed the we need o verify text on
		 * if text equal to sign in==> Test case pass
		 * otherwise--> wrong text is displayed 
		 */


		boolean isDisplayed=true;
		String buttonText="Sign In" ;
		if (isDisplayed==false) {
			System.out.println("Button is displayed");
			if(buttonText.equals("Sign In")) {
				System.out.println("wrong text is displpayed");
			}
		}
		else {
			System.out.println("button is not displayed");
				
			}
		}
	
	

//Write a program with one int value for salary and four String values for different cars
//If you make over 50000 a year, you may buy a brand new car otherwise you should buy a used car.
 //* For those you can afford a new car there are different price ranges
  //I want anything under 70k to be Audi A5
  //I want anything under 80k to be Mercedes-Benz
  //I want anything under 90k to be Jaguar
  //I want anything under 100k to be Tesla
  // And if you make less than 60k output to read "Save up money and wait until next year"


    	 

Scanner scan=new Scanner(System.in);
System.out.println("What is your salary");
int salary=scan.nextInt();
String car;
if (salary>5000) {
	System.out.println("You may buy brand new car");
	
} else {
	System.out.println("You should buy a used car");
}





?







