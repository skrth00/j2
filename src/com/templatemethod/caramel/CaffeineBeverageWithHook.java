package com.templatemethod.caramel;

public abstract class CaffeineBeverageWithHook {
 
 void prepareRecipe() {
  boilWater();
  brew();
  pourInCup();
  if (customerWantsCondiments()) {
  
   addVanillaSyrup(); 
   addEspresso();
   addMilk(); 
   addCaramel();
  }
 }
 
 abstract void brew();
 
 abstract void addVanillaSyrup(); 
 abstract void addEspresso();
 abstract void addMilk(); 
 abstract void addCaramel();
 
 void boilWater() {
  System.out.println("Boiling water");
 }
 
 void pourInCup() {
  System.out.println("Pouring into cup");
 }
 
 boolean customerWantsCondiments() {
  return true;
 }
}