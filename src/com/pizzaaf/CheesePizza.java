package com.factory.pizzaaf;

public class CheesePizza extends Pizza{
PizzaIngredientFactory ingredientFactory
  public CheesePizza(PizzaIngredientFactory ingredientFactory){
  
    this.ingredientFactory=ingredientFactory;
    name="cheese pizza";
  }


void prepare(){
 System.out.println("preparing.."+name);
 dough=ingredientFactory.createDough();
 cheese=ingredientFactory.createCheese();
}

}