package com.example.studyproject.collections.instruments;

public class Guitar implements Instrument {

    private int numberOfString;
    public Guitar(Integer numberOfString) {
        this.numberOfString = numberOfString;
    }
    @Override
    public void play() {
        System.out.printf("Guitar with %d strings is playing!%n", numberOfString);
    }

    public int getNumberOfString() {
        return numberOfString;
    }

    public void setNumberOfString(int numberOfString) {
        this.numberOfString = numberOfString;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfString=" + numberOfString +
                '}';
    }
}
