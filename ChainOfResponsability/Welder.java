
public class Welder extends Employee{

	
	public Welder() {
		authorityLevel = WELDER;

	}
	
	@Override
	protected void write(String message) {
		System.out.println(message+" all parts have been welded together");		
	}

}
