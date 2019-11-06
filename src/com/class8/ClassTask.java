package com.class8;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		
		String bornMonth;
		String March,April,May;
		String June,July,August;
		String September,October,November;
		
		Scanner born=new Scanner(System.in);
		System.out.println("What month were you born?");
		String month=born.nextLine();
		
		if(month.equalsIgnoreCase("March|| April || May")) {
			System.out.println("Spring");
			if(month.equalsIgnoreCase("June ||July ||August")) {
				System.out.println("Summer");
				if(month.equalsIgnoreCase("September|| October || November")) {
					System.out.println("Fall");
				}else {
					System.out.println("unknown");
				}
				
			}
		}
		
		
		
		

	}

}
