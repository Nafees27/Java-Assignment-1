/*
	
	Q5) Create a class named Employee with fields firstname,lastname,age and designation. 
	
	The class should:
    have all types of constructors to initialize the object
    class should also have setter methods to update a particular field
    Override its toString method to display a meaningful message using all these fields.

	
*/
package javaAssignment1;

public class ques5 
{

	public static void main(String[] args) 
	{
		// Employee-1 creation using default constructor
		Employee emp1 = new Employee();
		emp1.setFirstName("Sangam");
		emp1.setLastName("Agarwal");
		emp1.setAge(45);
		emp1.setDesignation("Manager");
		System.out.println(emp1.toString());
		
		
		// Employee-2creation using default constructor
		Employee emp2 = new Employee("Nafees", "Ahmad", 22 , "Software Engineer");
		System.out.println(emp2.getAge());
		System.out.println(emp2.toString());
		
	}

}

class Employee
{
	private String firstName;
	private String lastName;
	private int age;
	private String designation;
	
	Employee(){}
	
	Employee(String fN, String lN, int ag, String des)
	{
		firstName = fN;
		lastName = lN;
		age = ag;
		designation = des;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public String toString() 
	{
		
		return  "" + getFirstName() + " " + getLastName() + " " + getAge() + " " + getDesignation() +" " ;
	}
}
