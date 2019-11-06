package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int a;
		a=10;
		
		int a1=10;
		//1 way 
		int[] b; // declare an array---> preferred way
		int c[];
		b=new int[4];// initialize 
		
		
		//2 way all in one line ( declatation & initialization)
		int[]array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		//access value from an array 
		System.out.println(array[2]);
		
		//lets creat an array that will store classes 
		
		String[] classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="GIT";
		//Today we have Java class
		System.out.println("Today we have "+ classes[0]+ "class");  
		
		int[] nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		/// how can i change 1 to 100
		nums[0]=100;
		System.out.println(nums[0]);
		
		//strings
		String[] names=new String[3];
		names[0]="Diana";
		names[1]="Seda";
		names[2]="Ana";
		//names[3]="Maria"; during run time we will get an exception
		//ArrayIndexOutOFBoundException 
		
		System.out.println(names[0]);
		
		
		//we are putting less elements inside
		// -->complier will give default values 
		int[] numbers=new int[4];
		numbers[1]=100;
		numbers[3]=200;
		System.out.println(numbers[2]);
		
		
		
		

		
		
		
		
				
	}

}
