package com.facade.smarthome;

public class SmartHomeFacade {
    private Amplifier amp;
    private Tuner tuner;
    private Light light;
    private McSquare mcSquare;
 
    public SmartHomeFacade(Amplifier amp, Tuner tuner, Light light, McSquare mcSquare) {
        this.amp = amp;
        this.tuner = tuner;
        this.light = light;
        this.mcSquare = mcSquare;
    }
   public void beginStudy() {
        System.out.println("study is beginning");
        
        amp.on();
        tuner.on();
        tuner.setFrequency(0.83);
        light.on();
        mcSquare.on();
        mcSquare.setFrequency(0.83);
        
    }
    
    public void endStudy() {
        System.out.println("i don't want study anymore");
          amp.off();
        tuner.off();
        light.off();
        mcSquare.off();
            }
    public void listenToRadio(double frequency) {
        System.out.println("listeing EBS RADIO");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }
    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amp.off();
    }
}