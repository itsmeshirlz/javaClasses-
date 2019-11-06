package com.class8;

import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {
		//break keyword breaks/exit the loop 
		
		for (int i=0; i<10; i++ ) {
			
			if(i==2) {
				break;
			}
			System.out.println(i); 
		}
		System.out.println("I am outside of the loop"); 
		
		//continue--it will skip CURRENT iteration
		
		for (int i=1; i<=5; i++ ) {
			
			if(i==3) {
				continue;
			} 
			System.out.println(i);
		}
		System.out.println("****************");
	
		
		
		//I WANT TO PRINT NUMS FROM 1 TO 20 except 5,6,7
	for(int a=1; a<20; a++) {
		if(a==5 || a==6 || a==7 ) {
			continue;
		}
		System.out.println(a);
	}
	
	//Print numbers from 1 to 50 except those that are divisable by 3
	
	for(int b=1; b<50; b++) {
		if(b%3==0)
			continue;
	}
        System.out.println(b); 
	}
	
	// Create a program that will be asking user to apply for a credit card 10 times.
	//As soon you get an "yes" from a user program should stop asking
	

	 
	 String c;
     Scanner scan=new Scanner (System.in)
     
     for (int d=1; d<=10; d++) {
         System.out.println("Apply for a credit card?");
         c=scan.nextLine();
         if (c.equals("yes")) {
             break;
         }
     
     }
     
}
	 
	 
 }


	}
	
	
}

