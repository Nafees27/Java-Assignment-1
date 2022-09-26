/*
 	Q3) Write a java program to show following menu to the user:

 	*******Menu*******
	1. Calculate Area of Circle
	2. Calculate Circumference of a Circle
	3. Exit.
	Choose an option (1-3): 

	Take radius as user input.

*/

package javaAssignment1;

import java.util.*;

public class ques3 {

	public static void main(String[] args) 
	{
		// For taking input
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("Enter option between 1-3");
			int option = sc.nextInt();
			int r;						// declaring radius
			if(option == 1) 
			{
				r = sc.nextInt();
				area(r);
			}
			else if(option == 2) 
			{
				r = sc.nextInt();
				circumference(r);
			}
			else 
			{
				System.out.println("You are exited from the menu");
				break;
			}
		}

	}

	// Static method for calculating area of a circle
	public static void area(int r) 
	{
		int area = (int)Math.PI*r*r;
		System.out.println("Area of circle is : " + area);
	}

	// static method for calculating circumference of a circle
	public static void circumference(int r) 
	{
		int circum = (int)Math.PI*r*r;
		System.out.println("Circumference of circle is : " + circum);	
	}

}
