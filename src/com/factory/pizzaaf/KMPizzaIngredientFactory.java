package com.factory.pizzaaf;

public class KMPizzaIngredientFactory implements PizzaIngredientFactory {
    public Potato createPotato() {
        return new GrilledPotato();
    }
   
}