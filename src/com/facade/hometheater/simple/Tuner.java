package com.facade.hometheater.simple;

public class Tuner {
    String description;
    Amplifier amplifier;
    double frequency;
 
    public Tuner(String description, Amplifier amplifier) {//생성자에서 가지고있으므로 uml표현시 강하게표현가능
        this.description = description;
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