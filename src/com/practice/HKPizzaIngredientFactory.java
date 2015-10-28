package com.practice;

public class HKPizzaIngredientFactory implements PizzaIngredientFactory{

  
  public Olive createOlive(){
  
    return new MashedOlive();
  }
}