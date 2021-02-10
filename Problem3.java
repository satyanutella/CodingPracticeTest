package CodingPracticeTest;

class Employee1
{
	private String firstName;
	private String lastName;
	public Employee1(String firstName, String lastName) {  //creating constructor
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void Validate() //creating a method
	{
		if(firstName.length()<3 || lastName.length()<3) //checking length of characters
		{
			throw new NullPointerException("you entered less characters"); //throwing exception
			
		}
		else
		{
			System.out.println(firstName); // printing the values
			System.out.println(lastName);
		}

		
	}
	
}

public class Problem3 {

	public static void main(String[] args) {
		
		
		Employee1 e1 = new Employee1("Rahul","Dravid"); //declaring the object for employee
		e1.Validate(); //calling validate method
		
		
	}

}
