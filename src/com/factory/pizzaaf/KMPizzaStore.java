package com.factory.pizzaaf;

public class KMPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory=new KMPizzaIngredientFactory();
 
        if (item.equals("potato")) {
  
            pizza = new PotatoPizza(ingredientFactory);
            pizza.setName("KM Style potato Pizza");
  
        }
        return pizza;
    }
}