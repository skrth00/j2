package com.facade.smarthome;

public class SmartHomeTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("My Amplifier");
        Tuner tuner = new Tuner("My AM/FM Tuner", amp);
        Light light = new Light("My Light", amp);
        McSquare mcSquare = new McSquare ("My McSquare", amp);
 
        SmartHomeFacade smartHome = new SmartHomeFacade(amp, tuner, light, mcSquare);
        smartHome.beginStudy();
        smartHome.endStudy();
        smartHome.listenToRadio(0.99);
        smartHome.endRadio();
    }
}