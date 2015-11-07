package com.command.dvd;

public class DVD {
 String dvd;
 int level;
 public DVD(String dvd) {
  this.dvd = dvd;
 }
 public void on() {
  level = 100;
  System.out.println("DVD is on");
 }
 public void off() {
  level = 0;
  System.out.println("DVD is off");
 }
 public void dim(int level) {
  this.level = level;
  if (level == 0) {
   off();
  }
  else {
   System.out.println("DVD display is dimmed to " + level + "%");
  }
 }
 public int getLevel() {
  return level;
 }
}