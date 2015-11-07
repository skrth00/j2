package com.command.macro;

public class DVD {
 String location;

 public DVD(String location) {
  this.location = location;
 }

 public void on() {
  System.out.println(location + " dvd is on");
 }

 public void off() {
  System.out.println(location + " dvd is off");
 }

 public void setCD() {
  System.out.println(location + " dvd is set for CD input");
 }
 public void setRadio() {
  System.out.println(location + " dvd is set for Radio");
 }

 public void setVolume(int volume) {
  
  System.out.println(location + " dvd volume set to " + volume);
 }
}