package com.classreview;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		String M = "";
		String F = "";

		Scanner input = new Scanner(System.in);
		// System.out.println("Enter M or F");
		String gender = input.nextLine();

		// System.out.println("input any value");
		int age = input.nextInt();

		if (gender == M) {
			if (age >= 25) {
				System.out.println("man");
			} else {
				System.out.println("boy");
			}
		} else if (gender == F) {
			if (age < 25) {
				System.out.println("woman");

			} else {
				System.out.println("girl");
			}
		}

	}

}
