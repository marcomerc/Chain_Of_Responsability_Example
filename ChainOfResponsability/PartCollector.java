
public class PartCollector extends Employee  {

	
	public PartCollector() {
		authorityLevel = 1;
	}
	@Override
	protected void write(String message) {
		System.out.println(message+" all parts have been gathered");
		
	}

}
