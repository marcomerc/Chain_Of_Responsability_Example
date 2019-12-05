
public class Painter extends Employee {

	
	public Painter(){
		authorityLevel = 1;

	}
	
	@Override
	protected void write(String message) {
		System.out.println(message+ " car complete");		
	}

}
