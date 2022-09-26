/*
 	Q1) Write a class with FirstName, LastName & age field. 
 	Print Firstname, LastName & age using static block, static method & static variable respectively.

*/


package javaAssignment1;

public class ques1 
{
	// static Variable declaration and initialization
	static String FirstName = "Global"; 
	static String LastName = "Variable";
	static int age = 20;
	
	// static block declaration and print their values
	static
	{
		FirstName = "Nafees";
		LastName = "Ahmad";
		age = 22;
		
		System.out.println(FirstName + " " + LastName + " " + age);
	}
	
	public static void main(String[] args) 
	{
		
		// print value of static variable 
		System.out.println(ques1.FirstName + " " + ques1.LastName + " " + ques1.age);
		
		// calling static method
		String FirstName = "Sangam";
		String LastName = "Agarwal";
		int age = 45;
		printStatic(FirstName, LastName, age);
	}

	// static method declaration
	public static void printStatic(String FirstName, String LastName, int age) 
	{
		
		System.out.println(FirstName + " " + LastName + " " + age);
		
	}

}
