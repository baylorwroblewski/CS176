package edu.monmouth.problemSet2;

public class problemSet2 {
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
        guitar.setName("snare drum");
        guitar.setType("percussion");
        guitar.setNumberOfKeysorStrings(0);
        
        
        MusicalInstrument violin;
        violin = new MusicalInstrument(null, "", 200); // All values are invalid
        System.out.println("Instrument Name: " + violin.getName());
        System.out.println("Instrument Type: " + violin.getType());
        System.out.println("Number of Keys/Strings: " + violin.getNumberOfKeysorStrings());
        
        MusicalInstrument bass;
        bass = new MusicalInstrument("", "BASS", -98); // All values are invalid
        System.out.println("Instrument Name: " + bass.getName());
        System.out.println("Instrument Type: " + bass.getType());
        System.out.println("Number of Keys/Strings: " + bass.getNumberOfKeysorStrings());
    
    }
}
