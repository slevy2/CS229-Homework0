package p0;

public class FireNation extends Nation{
	
	String uniqueUnit;
	int numOfUnits;

	public FireNation(String name, int population, String uniqueUnit, int numOfUnits) {
		super(name, population);
		this.uniqueUnit = uniqueUnit;
		this.numOfUnits = numOfUnits;
	}
	
	public String toString() {
		String output = super.toString();
		output += " It has " + this.numOfUnits + " unique units of " + this.uniqueUnit + ".";
		return output;
	}

}
