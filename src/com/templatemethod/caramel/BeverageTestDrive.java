package com.templatemethod.caramel;

public class BeverageTestDrive {
 public static void main(String[] args) {
 
  Coffee coffee = new Coffee();
  
  System.out.println("\nMaking coffee...");
  coffee.prepareRecipe();
  
  System.out.println("\nMaking caramel Macchiato...");
  
  CaramelMacchiatoWithHook caramelHook = new CaramelMacchiatoWithHook();
  caramelHook.prepareRecipe();

 
 }
}