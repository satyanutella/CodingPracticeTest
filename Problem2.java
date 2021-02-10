package CodingPracticeTest;

class Employee  //creating class Employee
{
	String firstName;
	String lastName;
	public Employee(String firstName, String lastName) {  //creating parameterised constructor 
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ""; //generating toSting()
	}
	
}

public class Problem2 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Rohit","Sharma"); //initialising the object and assigning values to the parameters
		Employee e2 = new Employee("Virat", "Kohli");  //initialising the object and assigning values to the parameters
		Employee e3 = new Employee("Ajinkya", "Rahane");  //initialising the object and assigning values to the parameters
		System.out.println(e1); //calling obj e1
		System.out.println(e2);  //calling obj e2
		System.out.println(e3); //calling obj e3

	}

}
