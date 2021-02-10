package CodingPracticeTest;

class Animal //create class Animal
{
	void shout() {  //declare method shout
		System.out.println("Different animal sounds");
	}
}

class Dog extends Animal   //class Dog extends parent class
{
	void shout() {
		System.out.println(" Dog shouts : Bhaw Bhaw");
	}
}

class Horse extends Animal  //class Horse extends parent class
{
	void shout() {
		System.out.println(" Horse shouts : kneeee");
	}
}

class Cat extends Animal  //class Cat extends parent class
{
	void shout() {
		System.out.println("Cat shouts : Meow Meow");
	}
}
public class Problem4 {

	public static void main(String[] args) {
		
		Animal a = new Dog(); //initialising obj dog
		Animal a1 = new Horse();  //initialising obj horse
		Animal a2 = new Cat();  //initialising obj cat
		a.shout(); //calling method shout() of dog
		a1.shout(); //calling method shout() of horse
		a2.shout(); //calling method shout() of cat

	}

}
