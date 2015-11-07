package com.command.macro;

public class RemoteLoader {

 public static void main(String[] args) {

  RemoteControl remoteControl = new RemoteControl();

  Light light = new Light("Living Room");
  TV tv = new TV("Living Room");
  Stereo stereo = new Stereo("Living Room");
  Hottub hottub = new Hottub();
  DVD dvd = new DVD("Living Room");
  
  LightOnCommand lightOn = new LightOnCommand(light);
  StereoOnCommand stereoOn = new StereoOnCommand(stereo);
  TVOnCommand tvOn = new TVOnCommand(tv);
  HottubOnCommand hottubOn = new HottubOnCommand(hottub);
  DVDOnCommand dvdOn = new DVDOnCommand(dvd);
  
  LightOffCommand lightOff = new LightOffCommand(light);
  StereoOffCommand stereoOff = new StereoOffCommand(stereo);
  TVOffCommand tvOff = new TVOffCommand(tv);
  HottubOffCommand hottubOff = new HottubOffCommand(hottub);
  DVDOffCommand dvdOff = new DVDOffCommand(dvd);

  Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn,dvdOn};
  Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff,dvdOff};
  
  MacroCommand partyOnMacro = new MacroCommand(partyOn);
  MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
  remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
  System.out.println(remoteControl);
  System.out.println("--- Pushing Macro On---");
  remoteControl.onButtonWasPushed(0);
  System.out.println("--- Pushing Macro Off---");
  remoteControl.offButtonWasPushed(0);
 }
}