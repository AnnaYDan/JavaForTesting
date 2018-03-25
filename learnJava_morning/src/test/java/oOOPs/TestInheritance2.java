package oOOPs;

class BabyDog extends BigDog {
	void weep() {
		System.out.println("weeping...");
	}
}

public class TestInheritance2 {
	public static void main(String args[]) {
		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();
	}
}