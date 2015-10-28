package com.practice;

//pizzafm

public abstract class PizzaStore{
  
 
  public abstract Pizza createPizza(String item);
  public Pizza orderPizza(String type){
  
    Pizza pizza = createPizza(type);
    
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.boxing();
    return pizza;
    
  }

  
}