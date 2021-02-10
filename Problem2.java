package CodingPracticeTest;

class Employee
{
	String firstName;
	String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + "";
	}
	
}

public class Problem2 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Rohit","Sharma");
		Employee e2 = new Employee("Virat", "Kohli");
		Employee e3 = new Employee("Ajinkya", "Rahane");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}

}
