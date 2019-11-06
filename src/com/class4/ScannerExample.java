package com.class4;

import java.util.Scanner;
//Must inport from somewhere 
public class ScannerExample {
	
	// scanner is class in Java that will help us get user input 
	

	public static void main(String[] args) {
		
	Scanner scan= new Scanner(System.in);
	System.out.println("Please enter any number ");
	/*
	 * nextInt();-->for numbers 
	 * nextLine();-->Strings
	 * nextDouble();-->double
	 */
	
	 int number=scan.nextInt();
	 System.out.println(" Entered number is " + number);
	 
	 System.out.println("******************");
	 
	 
	 Scanner input=new Scanner(System.in);
	 System.out.println("please enter your name ");
	 String name=input.nextLine();
	 System.out.println("Good afternoon " + name);
	 
	 
	 	//putting an output to get input

	}

}
