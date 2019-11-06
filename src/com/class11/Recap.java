package com.class11;

public class Recap {

	public static void main(String[] args) {
	 

	 String [] cars= {"honda","nissan","benz","toyota","audi","tesla"};
     for(String car:cars) {
         
         System.out.println(car);
     }
     
     
     //second wayyyyyyy
     for(int i=0; i<cars.length;i++) {
         
         System.out.println(cars[i]);
         
         
         
         // task2 
         int [] numbers= {5,10,15,20};
         int sum=0;
         for (int a=0; i<numbers.length;i++) {
             
             sum+=numbers[i];
             
         }
         
         System.out.println(sum);
         
         //task 3 
         String[] country= {“Argentina”, “Colombia”, “Bolivia”};
         for(String c:country) {
             switch(c) {
             case “Argentina”:
                 System.out.println(“Buenos Aires”);
                 break;
             case “Colombia”:
                 System.out.println(“Bogota”);
                 break;
             case “Bolivia”:
                 System.out.println(“Sucre”);
                 break;
      
     }
     }
}
     
     
     // task: Creat 2D array of String with 2 and 3 columns 
     
     String array [2][3]
    		 
    		 
    		 array [0][0]= 55
    		 array [0][1]=77
    					
    		 array [1][0]=22 
    	     array [1][1]=65
    	    		 
    	     array [2][0]= 23
    	     array [2][1]=96
    	     
    	     System.out.println(array[2][3])
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
