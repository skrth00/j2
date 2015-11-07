package com.command.macro;

public class DVDOnWithCDCommand implements Command {
DVD dvd;
 
 public DVDOnWithCDCommand(DVD dvd) {
  this.dvd = dvd;
 }
 
 public void execute() {
  dvd.on();
  dvd.setCD();
  dvd.setVolume(11);
 }

 public void undo() {
  dvd.off();
 }
}