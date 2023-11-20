package edu.monmouth.ProblemSet4;

public class ProblemSet4 {
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
		    final int ARRAY_SIZE = 10;
		    MusicalInstrument [] instrumentArray = new MusicalInstrument[ARRAY_SIZE];
		    instrumentArray[0] = new MusicalInstrument("Flute", "woodwind", 16, 299.99);
	        instrumentArray[1] = new MusicalInstrument("Saxophone", "brass", 23, 799.99);
	        instrumentArray[2] = new MusicalInstrument("Violin", "string", 4, 499.99);
	        instrumentArray[3] = new MusicalInstrument("Drums", "percussion", 0, 699.99);
	        instrumentArray[4] = new MusicalInstrument("Piano", "keyboard", 88, 1499.99);
	        instrumentArray[5] = new MusicalInstrument("Ukulele", "string", 4, 60.99);
	        instrumentArray[6] = new MusicalInstrument("Triangle", "percussion", 0, 10.99);
	        instrumentArray[7] = new MusicalInstrument("Banjo", "string", 5, 345.99);
	        instrumentArray[8] = new MusicalInstrument("Harp", "string", 47, 999.99);
	        instrumentArray[9] = new MusicalInstrument("Cello", "string", 4, 545.99);
	        
	        System.out.println("\nPrinting MusicalInstrument objects:");
	        for (MusicalInstrument instrument : instrumentArray) {
	            System.out.println("\nInstrument Name: " + instrument.getName());
	            System.out.println("Instrument Type: " + instrument.getType());
	            System.out.println("Number of Keys/Strings: " + instrument.getNumberOfKeysorStrings());
	            System.out.println("Price of Instrument: " + instrument.getPrice());
	        }
	        
	        MusicalInstrument minKeysInstrument = findMinKeysInstrument(instrumentArray);
	        System.out.println("\nThe Instrument with the Fewest Keys/Strings:");
	        System.out.println("Instrument Name: " + minKeysInstrument.getName());
	        System.out.println("Instrument Type: " + minKeysInstrument.getType());
	        System.out.println("Number of Keys/Strings: " + minKeysInstrument.getNumberOfKeysorStrings());
	        System.out.println("Price of Instrument: " + minKeysInstrument.getPrice());


	        
		    
			
			System.out.println("\nBrass Instruments: ");
			
			for (MusicalInstrument instrument : instrumentArray) {
			    if (instrument.getType().equalsIgnoreCase("brass")) {
			        System.out.println("\nInstrument Name: " + instrument.getName());
			        System.out.println("Instrument Type: " + instrument.getType());
			        System.out.println("Number of Keys/Strings: " + instrument.getNumberOfKeysorStrings());
			        System.out.println("Price of Instrument: " + instrument.getPrice());
			    }
			}
			
			MusicalInstrument maxPriceInstrument = findMaxPriceInstrument(instrumentArray);
	        System.out.println("\nThe Instrument with the Greatest Price:");
	        System.out.println("Instrument Name: " + maxPriceInstrument.getName());
	        System.out.println("Instrument Type: " + maxPriceInstrument.getType());
	        System.out.println("Number of Keys/Strings: " + maxPriceInstrument.getNumberOfKeysorStrings());
	        System.out.println("Price of Instrument: " + maxPriceInstrument.getPrice());
	        
	        MusicalInstrument[] brassInstrumentArray = new MusicalInstrument[ARRAY_SIZE];
	        int count = copyBrassInstruments(instrumentArray, brassInstrumentArray);

	        System.out.println("\nPrinting Brass MusicalInstrument objects:");
	        for (int i = 0; i < count; i++) {
	            MusicalInstrument brassInstrument = brassInstrumentArray[i];
	            System.out.println("\nInstrument Name: " + brassInstrument.getName());
	            System.out.println("Instrument Type: " + brassInstrument.getType());
	            System.out.println("Number of Keys/Strings: " + brassInstrument.getNumberOfKeysorStrings());
	            System.out.println("Price of Instrument: " + brassInstrument.getPrice());
	        }
			
			
			}


			
			private static MusicalInstrument findMinKeysInstrument(MusicalInstrument[] instruments) {
				if (instruments.length == 0) {
					return null; 
			}

				MusicalInstrument minKeysInstrument = instruments[0];
					for (int i = 1; i < instruments.length; i++) {
						if (instruments[i].getNumberOfKeysorStrings() < minKeysInstrument.getNumberOfKeysorStrings()) {
							minKeysInstrument = instruments[i];
						}
					}
					return minKeysInstrument;
    }
			private static MusicalInstrument findMaxPriceInstrument(MusicalInstrument[] instruments) {
			    if (instruments.length == 0) {
			        return null; // Return null if the array is empty.
			    }

			    MusicalInstrument maxPriceInstrument = instruments[0];
			    for (int i = 1; i < instruments.length; i++) {
			        if (instruments[i].getPrice() > maxPriceInstrument.getPrice()) {
			            maxPriceInstrument = instruments[i];
			        }
			    }
			    return maxPriceInstrument;
			}
			
			private static int copyBrassInstruments(MusicalInstrument[] sourceArray, MusicalInstrument[] destinationArray) {
			    int count = 0;
			    for (int i = 0; i < sourceArray.length; i++) {
			        if (sourceArray[i].getType().equalsIgnoreCase("brass")) {
			            destinationArray[count++] = sourceArray[i];
			        }
			    }
			    return count;
			}
			
}

	        
		
		
		
        
       

