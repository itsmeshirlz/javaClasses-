package com.class13;

public class StringManipulation1 {

	public static void main(String[] args) {
	
		String str="Java is getting interesting";
		System.out.println(str.substring(10));
        System.out.println(str.substring(8, 15));
        
        
        String str1="Sunday";
        for(int i=str1.length()-1; i>=0; i--)
        {
            
            System.out.print(str1.charAt(i));
        }
        
        
        //Creat a String and if the String is not empty pperform the following: if the String has 
        //an odd number of characters and has 3 or more characters, print the character in
        // the middle of the String 
        
        String str2="hello";
        
        int middle=str2.length()/2;
        if(!str2.isEmpty()) {
        	if(str2.length()%2!=0&& str2.length()>=3) {
        		System.out.println(str2.charAt(middle));
        	}
        }

	}

}
