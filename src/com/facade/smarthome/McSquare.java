package com.facade.smarthome;

public class McSquare {
    String description;
    Amplifier amplifier;
    double frequency;
    
 
    public McSquare(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }
    public void on() {
        System.out.println(description + " on");
    }
    public void off() {
        System.out.println(description + " off");
    }
    public void setFrequency(double frequency) {
        System.out.println(description + " setting frequency to " + frequency);
        this.frequency = frequency;
    }

    public String toString() {
        return description;
    }
}