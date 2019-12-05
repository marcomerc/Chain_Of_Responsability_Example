
public class Assembler extends Employee {

	public Assembler() {
		authorityLevel = 2;

	}
	
	@Override
	protected void write(String message) {
		System.out.println(message+" all parts have been put together");
		
	}

}
