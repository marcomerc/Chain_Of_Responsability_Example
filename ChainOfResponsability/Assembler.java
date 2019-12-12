
public class Assembler extends Employee {

	public Assembler() {
		authorityLevel = ASSEMBLER;

	}
	
	@Override
	protected void write(String message) {
		System.out.println(message+" all parts have been put together");
		
	}

}
