package edu.monmouth.ProblemSet4;

public class MusicalInstrument {
    private String name;
    private String type;
    private int numberOfKeysorStrings;
    private double price;

    private  final String UNKNOWNNAME = "UNKNOWNNAME";
    private  final String UNKNOWNTYPE = "UNKNOWNTYPE";
    private  final int UNKNOWNKEYSORSTRINGS = -1;
    private  final int MIN_KEYS_OR_STRINGS = 0;
    private  final int MAX_KEYS_OR_STRINGS = 100;
    private  final double UNKNOWNPRICE = -9;
    private  final double LOWESTPRICE = 0;
    private  final String[] VALID_TYPES = {"woodwind", "brass", "string", "percussion", "keyboard"};
	private boolean isValidType;

    public MusicalInstrument() {
        setName(UNKNOWNNAME);
        setType(UNKNOWNTYPE);
        setNumberOfKeysorStrings(UNKNOWNKEYSORSTRINGS);
        setPrice(UNKNOWNPRICE);
    }
    public MusicalInstrument(String name, String type, int numberOfKeysorStrings) {
    	setName(name);
    	setType(type);
    	setNumberOfKeysorStrings(numberOfKeysorStrings);
    }

    public MusicalInstrument(String name, String type, int numberOfKeysorStrings, double price) {
        setName(name);
        setType(type);
        setNumberOfKeysorStrings(numberOfKeysorStrings);
        setPrice(price);
    }
    
    public double getPrice() {
    	return price;
    }
    
    public void setPrice(double price) {
    	if(price >= LOWESTPRICE) {
    		this.price = price;
    	}else {
    		price = UNKNOWNPRICE;
    	}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.toLowerCase(); 
        } else {
            this.name = UNKNOWNNAME;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
    	isValidType = false;
        for (String validType : VALID_TYPES) {
            if (validType.equalsIgnoreCase(type)) {
                isValidType = true;
                this.type = type.toLowerCase();
                break;
            }
        }
        if (!isValidType) {
        	this.type = UNKNOWNTYPE;
        	}
        }

    public int getNumberOfKeysorStrings() {
        return numberOfKeysorStrings;
    }

    public void setNumberOfKeysorStrings(int numberOfKeysorStrings) {
        if (numberOfKeysorStrings >= MIN_KEYS_OR_STRINGS && numberOfKeysorStrings <= MAX_KEYS_OR_STRINGS) {
            this.numberOfKeysorStrings = numberOfKeysorStrings;
        } else {
            this.numberOfKeysorStrings = UNKNOWNKEYSORSTRINGS;
        }
    }
    
  
}
