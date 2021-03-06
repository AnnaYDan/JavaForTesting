package oOOPs;

class AnimalBehavior {
	void eat() {
		System.out.println("eating...");
		System.out.println("and eating again...");
	}
}

class BigDog extends AnimalBehavior {
	void bark() {
		System.out.println("barking...");
	}
}

class CatK extends AnimalBehavior {
	void meow() {
		System.out.println("moew");
	}
}

public class TestInheritance {
	public static void main(String args[]) {
		BigDog d = new BigDog();
		d.bark();
		d.eat();
		CatK cat = new CatK();
		cat.eat();
		cat.meow();
	}
}
