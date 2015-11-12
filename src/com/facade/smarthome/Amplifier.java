package com.facade.smarthome;

public class Amplifier {
    String description;
    Tuner tuner;
    Light light;
    McSquare mcSquare;
    public Amplifier(String description) {
        this.description = description;
    }
    public void on() {
        System.out.println(description + " on");
    }
    public void off() {
        System.out.println(description + " off");
    }
    public void setLight(Light light) {
        System.out.println(description + " setting light to " + light);
        this.light = light;
    }
    public void setTuner(Tuner tuner) {
        System.out.println(description + " setting tuner to " + tuner);
        this.tuner = tuner;
    }
    public void setVolume(int level) {
        System.out.println(description + " setting volume to " + level);
    }
     public void setMcSquare(McSquare mcSquare) {
        System.out.println(description + " setting McSqaure  to " + mcSquare);
    }
    
    public String toString() {
        return description;
    }
}