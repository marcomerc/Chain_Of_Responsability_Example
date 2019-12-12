
public class Painter extends Employee {

	
	public Painter(){
		authorityLevel = Painter;

	}
	
	@Override
	protected void write(String message) {
		System.out.println(message+ " car complete");		
	}

}
