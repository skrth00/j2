package com.singleton.chocolatethreadsafe;
 
public class ChocolateController {
 public static void main(String args[]) {
  ChocolateBoiler boiler = ChocolateBoiler.getInstance();
  boiler.fill();
  boiler.boil();
  boiler.drain();

  // will return the existing instance
  ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
   boiler.fill();
  boiler.boil();
  boiler.drain();
  ChocolateBoiler boiler3 = ChocolateBoiler.getInstance();
   boiler.fill();
  boiler.boil();
  boiler.drain();
 }
}