package edu.monmouth.ProblemSet3;

public class ProblemSet3 {
	public static void main(String[] args) {
		MusicalInstrument instrument1 = new MusicalInstrument();
		 System.out.println("Instrument Name: " + instrument1.getName());
	     System.out.println("Instrument Type: " + instrument1.getType());
	     System.out.println("Number of Keys/Strings: " + instrument1.getNumberOfKeysorStrings());
	     System.out.println("Price of Instrument: " + instrument1.getPrice());
		
        MusicalInstrument instrument2 = new MusicalInstrument("GuiTar", "STRIng", 6, 0);
        System.out.println("\nInstrument Name: " + instrument2.getName());
        System.out.println("Instrument Type: " + instrument2.getType());
        System.out.println("Number of Keys/Strings: " + instrument2.getNumberOfKeysorStrings());
		System.out.println("Price of Instrument: " + instrument2.getPrice());
		
		MusicalInstrument instrument3 = new MusicalInstrument("Trumpet", "brass", 3, 109.99);
		System.out.println("\nInstrument Name: " + instrument3.getName());
        System.out.println("Instrument Type: " + instrument3.getType());
        System.out.println("Number of Keys/Strings: " + instrument3.getNumberOfKeysorStrings());
		System.out.println("Price of Instrument: " + instrument3.getPrice());
		
		MusicalInstrument instrument4 = new MusicalInstrument("", "BRAss", -14, 109.99);
		System.out.println("\nInstrument Name: " + instrument4.getName());
        System.out.println("Instrument Type: " + instrument4.getType());
        System.out.println("Number of Keys/Strings: " + instrument4.getNumberOfKeysorStrings());
		System.out.println("Price of Instrument: " + instrument4.getPrice());
		
		MusicalInstrument instrument5 = new MusicalInstrument("CLARINET", "Wooodwid", 10, 89.99);
		System.out.println("\nInstrument Name: " + instrument5.getName());
        System.out.println("Instrument Type: " + instrument5.getType());
        System.out.println("Number of Keys/Strings: " + instrument5.getNumberOfKeysorStrings());
		System.out.println("Price of Instrument: " + instrument5.getPrice());
		
		MusicalInstrument instrument6 = new MusicalInstrument("Oboe", "Woodwind", 12, 79.99);
		System.out.println("\nInstrument Name: " + instrument6.getName());
        System.out.println("Instrument Type: " + instrument6.getType());
        System.out.println("Number of Keys/Strings: " + instrument6.getNumberOfKeysorStrings());
		System.out.println("Price of Instrument: " + instrument6.getPrice());
		
		MusicalInstrument instrument7 = new MusicalInstrument("tuba", "Brass", 3, 189.99);
		System.out.println("\nInstrument Name: " + instrument7.getName());
        System.out.println("Instrument Type: " + instrument7.getType());
        System.out.println("Number of Keys/Strings: " + instrument7.getNumberOfKeysorStrings());
		System.out.println("Price of Instrument: " + instrument7.getPrice());
		
		MusicalInstrument instrument8 = new MusicalInstrument("trianGle", "percussion", 0, 49.99);
		System.out.println("\nInstrument Name: " + instrument8.getName());
        System.out.println("Instrument Type: " + instrument8.getType());
        System.out.println("Number of Keys/Strings: " + instrument8.getNumberOfKeysorStrings());
		System.out.println("Price of Instrument: " + instrument8.getPrice());
		
		// for objects instrument5-8, determine the most expensive
		MusicalInstrument[] instruments = {instrument5, instrument6, instrument7, instrument8};
		MusicalInstrument mostExpensiveInstrument = findMostExpensizeInstrument(instruments);
		System.out.println("\nThe most Expensive Instrument");
		System.out.println("Instrument Name: " + mostExpensiveInstrument.getName());
        System.out.println("Instrument Type: " + mostExpensiveInstrument.getType());
        System.out.println("Number of Keys/Strings: " + mostExpensiveInstrument.getNumberOfKeysorStrings());
        System.out.println("Price of Instrument: " + mostExpensiveInstrument.getPrice());

		// for objects instrument5-8, determine which are woodwind instruments
        System.out.println("\nWoodwind instruments: ");
        printInstrumentsByType(instruments, "woodwind");
        
        // for objects instrument5-8, determine which have keys or strings > 6
        System.out.println("\nInstruments with keys or strings > 6:");
        printInstrumentsByKeysOrStrings(instruments, 6);
	}
		
		private static MusicalInstrument findMostExpensizeInstrument(MusicalInstrument[] instruments) {
			MusicalInstrument mostExpensize = instruments[0];
			for (int i = 1; i < instruments.length; i++) {
				if (instruments[i].getPrice() > mostExpensize.getPrice()) {
					mostExpensize = instruments[i];
				}
			}
			return mostExpensize;
	}
		private static void printInstrumentsByType(MusicalInstrument[] instruments, String type) {
			for(MusicalInstrument instrument : instruments) {
				if (instrument.getType().equalsIgnoreCase(type)) {
					System.out.println("\nInstrument Name: " + instrument.getName());
	                System.out.println("Instrument Type: " + instrument.getType());
	                System.out.println("Number of Keys/Strings: " + instrument.getNumberOfKeysorStrings());
	                System.out.println("Price of Instrument: " + instrument.getPrice());
	            }	
			}
			}

			private static void printInstrumentsByKeysOrStrings(MusicalInstrument[] instruments, int keysOrStrings) {
		        for (MusicalInstrument instrument : instruments) {
		            if (instrument.getNumberOfKeysorStrings() > keysOrStrings) {
		                System.out.println("\nInstrument Name: " + instrument.getName());
		                System.out.println("Instrument Type: " + instrument.getType());
		                System.out.println("Number of Keys/Strings: " + instrument.getNumberOfKeysorStrings());
		                System.out.println("Price of Instrument: " + instrument.getPrice());
		}
		}
		        }
			}
	        
		
		
		
        
       

