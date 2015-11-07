package com.command.macro;

public class DVDOffCommand implements Command {
DVD dvd;

 public DVDOffCommand(DVD dvd) {
  this.dvd = dvd;
 }

 public void execute() {
  dvd.off();
 }

 public void undo() {
  dvd.on();
 }
}