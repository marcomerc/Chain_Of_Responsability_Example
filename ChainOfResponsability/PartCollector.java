
public class PartCollector extends Employee  {

	
	public PartCollector() {
		authorityLevel = PART_COLLECTOR;
	}
	@Override
	protected void write(String message) {
		System.out.println(message+" all parts have been gathered");
		
	}

}
