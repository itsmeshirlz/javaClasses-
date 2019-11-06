package com.class8;

public class ForLoop {

	public static void main(String[] args) {
		//Say good morning 5 times 
		//initialize;   test condition;   increment ;
		
		for(int i=0; i<4; i++) {
			System.out.println("Good mornning");
		}
		
		//print numbers from 1-10;
		
		for(int i=1; i<10; i++) {
			System.out.println("i");
		}
		//print numbers from 10-1;
		
	      for(int i=10; i>=10; i--) {
			System.out.println("i");
				}
	    //print numbrs by 5;
			
			for(int i=0; i<=50; i+=5) {
				System.out.println("i"); //5,10,15,20
			}
		//print numbers from 1 to 100 in 1 line 
			for(int i=1; i<100; i++) {
				System.out.println("i");
			}
		//print numbers from 100 to 1
			for(int i=100; i>=100; i--) {
				System.out.println("i");
			}
		//Print even numbers from 20 to 1
			 for(int i=0; i<=20; i+=2) {
				 System.out.println("i");
			 }
		//Print odd numbers between 20 and 50  
			 for(int i=21; i<50; i+=2) {
			  System.out.println("i");
			 }
			 //another way for above 
			 for(int i=20; i<=50; i++) {
				 System.out.println("i");
			 }
			 
			 
			 
			 ///WHAT IS THE OUTPUT
			 
			 int sum=0;
			 for(int i=1; i<=5; i++) {
				 System.out.println(sum);
			 }
			
			//WHAT IS THE OUTPUT
			 
			 int sumAll=0;
			 for(int i=0; i<=20; i+=5) {
				 System.out.println("sumALL");
					
			}
			 
			 int total=2;
			 for (int y=1; y<=3; y++) {
				 total=total*y;
			 }
			 System.out.println(total);
			 }
	

	}
