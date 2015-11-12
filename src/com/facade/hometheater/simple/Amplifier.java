package com.facade.hometheater.simple;

public class Amplifier{

   String description;
   Tuner tuner;
   DvdPlayer dvd;
  
  public void Amplifier(String description){
    this.description =description;
  }
  public void on(){
  System.out.println(description+"is on");
  }
  public void off(){System.out.println(description+"is off");}
  
  public void setDvd(DvdPlayer dvd){
    System.out.println(description+"dvd setting");
    this.dvd =dvd;
  }
  
  public void setTuner(Tuner tuner){
    System.out.println(description+"is tuned");
    this.tuner=tuner;
  }
  public void setVolume(int level ){
    System.out.println(description+"setting volume"+level);
    
  }
  
  
  public String toString(){
  return description;
  
  }
}