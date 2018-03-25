package oOOPs;

public class MethodOverriding {
	public static void main(String args[]) {
		MyChildClass obj = new MyChildClass();
		obj.disp();
	}
}

class MyBaseClass {
	protected void disp() {
		System.out.println("Parent class method");
	}
}

class MyChildClass extends MyBaseClass {
	public void disp() {
		System.out.println("Child class method");
	}
}
