package edu.monmouth.problemSet1;

public class MusicalInstrument {
	private String name;
	private String type;
	private int numberOfKeysorStrings;

	public MusicalInstrument() {
		name = "unknown";
		type = "unknown";
		numberOfKeysorStrings = 0;
	}
	public MusicalInstrument(String name, String type, int numberOfKeysorStrings) {
		this.name = name;
		this.type = type;
		this.numberOfKeysorStrings = numberOfKeysorStrings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumberOfKeysorStrings() {
		return numberOfKeysorStrings;
	}
	public void setNumberOfKeysorStrings(int numberOfKeysorStrings) {
		this.numberOfKeysorStrings = numberOfKeysorStrings;
	}

}
