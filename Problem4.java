package CodingPracticeTest;

class Animal 
{
	void shout() {
		System.out.println("Different animal sounds");
	}
}

class Dog extends Animal
{
	void shout() {
		System.out.println(" Dog shouts : Bhaw Bhaw");
	}
}

class Horse extends Animal
{
	void shout() {
		System.out.println(" Horse shouts : kneeee");
	}
}

class Cat extends Animal
{
	void shout() {
		System.out.println("Cat shouts : Meow Meow");
	}
}
public class Problem4 {

	public static void main(String[] args) {
		
		Animal a = new Dog();
		Animal a1 = new Horse();
		Animal a2 = new Cat();
		a.shout();
		a1.shout();
		a2.shout();

	}

}
