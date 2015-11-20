package com.templatemethod.barista;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
 
 public void brew() {
  System.out.println("Dripping Coffee through filter");
 }
 
 public void addCondiments() {
  System.out.println("Adding Sugar and Milk");
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
