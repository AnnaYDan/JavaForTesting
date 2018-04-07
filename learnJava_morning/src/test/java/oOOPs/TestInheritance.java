package oOOPs;

class AnimalBehavior {
	void eat() {
		System.out.println("eating...");
	}
}

class BigDog extends AnimalBehavior {
	void bark() {
		System.out.println("barking...");
	}
}

public class TestInheritance {
	public static void main(String args[]) {
		BigDog d = new BigDog();
		d.bark();
		d.eat();

	}
}
