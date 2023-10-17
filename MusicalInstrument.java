package edu.monmouth.problemSet2;

public class MusicalInstrument {
    private String name;
    private String type;
    private int numberOfKeysorStrings;

    private static final String UNKNOWNNAME = "UNKNOWNNAME";
    private static final String UNKNOWNTYPE = "UNKNOWNTYPE";
    private static final int UNKNOWNKEYSORSTRINGS = -1;
    private static final int MIN_KEYS_OR_STRINGS = 0;
    private static final int MAX_KEYS_OR_STRINGS = 100;

    public MusicalInstrument() {
        setName(UNKNOWNNAME);
        setType(UNKNOWNTYPE);
        setNumberOfKeysorStrings(UNKNOWNKEYSORSTRINGS);
    }

    public MusicalInstrument(String name, String type, int numberOfKeysorStrings) {
        setName(name);
        setType(type);
        setNumberOfKeysorStrings(numberOfKeysorStrings);
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
        if (type != null && !type.trim().isEmpty()) {
            String lowercaseType = type.toLowerCase();
            if (lowercaseType.equals("woodwind") || lowercaseType.equals("string") || lowercaseType.equals("brass") || lowercaseType.equals("keyboard") || lowercaseType.equals("percussion")) {
                this.type = lowercaseType;
            } else {
                this.type = UNKNOWNTYPE;
            }
        } else {
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
