/*
 	Q2) Write a program to read user input until user writes XDONE and 
 	then show the entered text by the user on command line.

*/


package javaAssignment1;

import java.util.*;

public class ques2 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String output = "";
		while(true) 
		{
			String str = input.nextLine();
			if(str.equals("XDONE"))
				break;
			output += str;
		}
		System.out.println(output);
	}

}
