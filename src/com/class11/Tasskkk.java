package com.class11;

public class Tasskkk {

	public static void main(String[] args) {
		
		
		
		// Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array 


		int [][] nums= { 
				{ 23, 45, 34, 54},
		        { 25, 85, 94, 32},
		        { 16, 35, 75, 76},
		              
		                      };
		                      
		int sum=0;
		                      for (int getNum[]: nums) {
		                          for(int getCol:getNum){
		                             // System.out.print(getCol+" ");
		                        	  
		                        	  sum=sum+nums[i][j];
		                              
		                          }
		                          System.out.println();
		                      }
		          System.out.println("The sum of all elements in the array is=" + sum);

	}

}
