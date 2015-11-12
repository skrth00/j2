package com.facade.smarthome;

public class Light {
    String description;
    Amplifier amplifier;
    
 
    public Light(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }
    public void on() {
        System.out.println(description + " on");
    }
    public void off() {
        System.out.println(description + " off");
    }

    public String toString() {
        return description;
    }
}