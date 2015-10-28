package com.practice;

//pizzafm

public class HKstyleOlivePizza extends Pizza{
  
  PizzaIngredientFactory ingredientFactory;
  
  public HKstyleOlivePizza(PizzaIngredientFactory ingredientFactory){
          this.ingredientFactory=ingredientFactory;
  }
  void prepare()
  {
    System.out.println("hi hi we are preparing");
   olive =ingredientFactory.createOlive();//
  }
  
}