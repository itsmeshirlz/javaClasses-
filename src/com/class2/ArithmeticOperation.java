package com.class2;

public class ArithmeticOperation {
	//TASK--
	//Declare 2 variables and initialize them 
	//Perform addition , subtraction,multiplication and division
	//

	public static void main(String[] args) {
		
		int num1, num2;
		num1=20;
		num2=10;
		
		System.out.println(num1+num2);  //30
		System.out.println(num1-num2);  //10
		System.out.println(num1*num2);  //200
		System.out.println(num1/num2);  //2
		
		//how can we print value of num1 and num2 together
		System.out.println(num1+","+num2);
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		/// the addition/substraction of 2 numbers is ____ ( use from above)
		
		System.out.println("the addition of num1 and num2 is " + sum);
		System.out.println("the substraction of num1 and num2 "+sub);
		System.out.println("the multiplication of num1 and num2 "+ mult);
		System.out.println("the division of num1 and num2 " + div);
		
	}
		
		
		
		
		
		

}
