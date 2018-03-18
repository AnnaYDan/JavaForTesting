package oOOPs;

public class Cow extends Animal{
	public Cow(boolean isMammal, boolean isCarnivorus){
		super(isMammal, isCarnivorus);
	}
public String getGreeting(){
	return "Moo, moo, moo";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cow c = new Cow(true, false);
		c.printAnimal("Cow >>>>>");

	}

}
