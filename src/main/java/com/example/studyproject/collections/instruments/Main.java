package com.example.studyproject.collections.instruments;

/**
 * First level: 1. Create the Instrument interface and the Guitar, Drum and Trumpet classes that implement it.
 * The Instrument interface contains the play() method and the String KEY ="C major" variable.
 * Guitar contains class variables number of Strings, Drum - size, Trumpet - diameter.
 * Create an array of type Tool containing different types of tools.
 * In the loop, call the play() method for each instrument, which should display the string
 * "This instrument is playing, with such and such characteristics."
 */
public class Main {
    public static void main(String[] args) {

        Drum drum1 = new Drum(100);
        Drum drum2 = new Drum(110);
        Guitar guitar1 = new Guitar(6);
        Guitar guitar2 = new Guitar(7);
        Trumpet trumpet1 = new Trumpet(12);
        Trumpet trumpet2 = new Trumpet(10);

        Instrument[] musicalInstruments = {drum1,drum2, guitar1,guitar2, trumpet1, trumpet2};
        for (Instrument musicalInstrument : musicalInstruments) {
            musicalInstrument.play();
        }
    }
}

