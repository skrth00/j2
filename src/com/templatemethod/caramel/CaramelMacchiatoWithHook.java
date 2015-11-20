package com.templatemethod.caramel;

public class CaramelMacchiatoWithHook extends CaffeineBeverageWithHook {
 
 public void brew() {
  System.out.println("Dripping Coffee through filter");
 }
 
 public void addVanillaSyrup() {
  System.out.println("Adding VanillaSyrup");
 }
 public void addEspresso() {
  System.out.println("Adding Espresso");
 }
 public void addMilk() {
  System.out.println("Adding Milk");
 }
 public void addCaramel() {
  System.out.println("Adding Caramel");
 }
 
 public boolean customerWantsCondiments() {

  String answer = "YES";

  if (answer.toLowerCase().startsWith("y")) {
   return true;
  } 
  else {
   return false;
  }
 }
}