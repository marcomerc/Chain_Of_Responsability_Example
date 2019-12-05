
public class testEmployee {

	public static void main(String[] args) {
		Employee partC   = new PartCollector();
		Employee AssemC  = new Assembler();
		Employee welder  = new Welder();
		Employee painter = new Painter();
		
		partC.setNextEmployee(AssemC);
		AssemC.setNextEmployee(welder);
		welder.setNextEmployee(painter);
		painter.setNextEmployee(null);
	
		partC.doWork(4, "Work Done:");
	}

}
