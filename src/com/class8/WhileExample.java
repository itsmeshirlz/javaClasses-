package com.class8;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		/*
		 * Lets ask user to enter if it is raining or not (True or False)
		 * as long as there is rain lets tell user to take an umbrella
		 * as soon as there is no rain--> you can do to the park
		 */

		
		Scanner scan;
		boolean isRain;
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Is it raining?");
			isRain=scan.hasNextBoolean();
			
	}while(!isRain);
		
		System.out.println("Go to the park");
		
	}

}
