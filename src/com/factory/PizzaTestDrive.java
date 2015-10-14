package com.factory;

public class PizzaTestDrive {

 public static void main(String[] args) {
  SimplePizzaFactory fac = new SimplePizzaFactory();
  PizzaStore store = new PizzaStore(fac);

  Pizza pizza = store.orderPizza("cheese");
  System.out.println("We ordered a " + pizza.getName() + "\n");
  System.out.println(pizza);
  
  Pizza pizza1 = store.orderPizza("potato");
  System.out.println("We ordered a " + pizza1.getName() + "\n");
  System.out.println(pizza1);
 
 
 }

}