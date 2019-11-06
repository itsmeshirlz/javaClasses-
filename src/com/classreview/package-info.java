package com.classreview; 

public class  {
public static void main(String[]args) {
	

/* Verify if the button is displayed on the page
 * if button is displayed the we need o verify text on
 * if text equal to sign in==> Test case pass
 * otherwise--> wrong text is displayed 
 */


boolean isDisplayed=true;
String buttonText="Sign In" ;
if (isDisplayed==false) {
	System.out.println("Button is displayed");
	if(buttonText.equals("Sign In")) {
		System.out.println("wrong text is displpayed");
	}
}
else {
	System.out.println("button is not displayed");
		
	}
}
}