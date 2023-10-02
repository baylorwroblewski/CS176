package edu.monmouth.problemSet1;

public class ProblemSet1 {

	public static void main(String[] args) {
		
		MusicalInstrument piano;
		piano = new MusicalInstrument();
		System.out.println("Instrument Name: " + piano.getName());
		System.out.println("Instrument Type: " + piano.getType());
		System.out.println("Number of Keys/Strings: " + piano.getNumberOfKeysorStrings());
		
		piano.setName("Piano");
		piano.setType("Keyboard");
		piano.setNumberOfKeysorStrings(88);
		System.out.println("Instrument Name: " + piano.getName());
		System.out.println("Instrument Type: " + piano.getType());
		System.out.println("Number of Keys/Strings: " + piano.getNumberOfKeysorStrings());
		
		MusicalInstrument guitar;
		guitar = new MusicalInstrument("Guitar", "String", 6);
		System.out.println("Instrument Name: " + guitar.getName());
		System.out.println("Instrument Type: " + guitar.getType());
		System.out.println("Number of Keys/Strings: " + guitar.getNumberOfKeysorStrings());
		
		
		
		
	}

}
